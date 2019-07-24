package ru.Asai_kann.help_homer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;


public class GameWindow extends JFrame {
    private static GameWindow game_drop;
    private static long last_frame_time;
    private static Image background;
    private static Image game_over;
    private static Image drop;
    private static float drop_left = 200;
    private static float drop_top = -100;
    private static float drop_v = 200;
    private static int score;


    public static void main(String[] args) throws IOException {
        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));
        game_over = ImageIO.read(GameWindow.class.getResourceAsStream("game_over.png"));
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));
        game_drop =new GameWindow(); //ссылаемся на себя
        game_drop.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //При закрытии окна прога закрывается
        game_drop.setLocation(200,100); //где открывается
        game_drop.setSize(906,478);// размеры
        game_drop.setResizable(false); //запретить изменять окно
        last_frame_time = System.nanoTime();
        GameField game_field = new GameField();
        game_drop.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int X = e.getX();
                int Y = e.getY();
                float drop_right = drop_left + drop.getWidth(null);
                float drop_bottom = drop_top + drop.getHeight(null);
                boolean is_drop = X >= drop_left && X <= drop_right && Y >= drop_top && Y<= drop_bottom;
                if (is_drop) {
                    drop_top = -100;
                    drop_left = (int)(Math.random() * (game_field.getWidth() - drop.getWidth(null)));
                    drop_v = drop_v +20;
                    score++;
                    game_drop.setTitle("Пончики: " +score);
                }
            }
        });
        game_drop.add(game_field);
        game_drop.setVisible(true);


    }
    private static void reDrop (Graphics g){
        long current_time = System.nanoTime();
        float delta_time = (current_time - last_frame_time)* 0.000000001f;
        last_frame_time = current_time;
        drop_top = drop_top + drop_v * delta_time;
        g.drawImage (background,0 ,0, null);
        g.drawImage (drop, (int) drop_left,(int) drop_top,null);
        if (drop_top > game_drop.getHeight())g.drawImage (game_over, 0,0,null);


    }
    private static class GameField extends JPanel{
        @Override
        protected void paintComponent (Graphics g){
            super.paintComponent(g);
            reDrop (g);
            repaint();
        }
    }
}