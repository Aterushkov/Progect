package ru.Asai_kann.calculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CalcWindow extends JFrame {
    private static final int WIN_WIDTH = 300;
    private static final int WIN_HEIGHT = 500;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;
    Math math;
    Message message;
    CalcWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH,WIN_HEIGHT);
        setLocation(WIN_POSX,WIN_POSY);
        setTitle("Калькулятор");
        setResizable(false);
        setVisible(true);
        math = new Math();
        message = new Message();

        JPanel mapMonitor = new JPanel();
        add(mapMonitor, BorderLayout.NORTH);
        mapMonitor.setPreferredSize(new Dimension(300,100));

        JPanel mathMonitor = new JPanel();
        mathMonitor.setLayout(new GridLayout(1,1));
        mathMonitor.setPreferredSize(new Dimension(300,60));
        mathMonitor.add(math);

        JPanel messageMonitor = new JPanel();
        messageMonitor.setLayout(new GridLayout(1,1));
        messageMonitor.setPreferredSize(new Dimension(300,40));
        messageMonitor.add(message);

        mapMonitor.add(mathMonitor, BorderLayout.NORTH);
        mapMonitor.add(messageMonitor, BorderLayout.CENTER);



        JPanel mapNubers = new JPanel();
        mapNubers.setLayout(new GridLayout(4,5));
        add(mapNubers, BorderLayout.CENTER);

        JButton Zero = new JButton("0");
        JButton One = new JButton("1");
        JButton Two = new JButton("2");
        JButton Three = new JButton("3");
        JButton Four = new JButton("4");
        JButton Five = new JButton("5");
        JButton Six = new JButton("6");
        JButton Seven = new JButton("7");
        JButton Eight = new JButton("8");
        JButton Nine = new JButton("9");
        JButton Addition = new JButton("+");
        JButton Subtraction = new JButton("-");
        JButton Multiplication = new JButton("*");
        JButton Division = new JButton("/");
        JButton RemainderOfTheNumber = new JButton("Ost");
        JButton Equally = new JButton("=");
        JButton Dell = new JButton("<=");


        mapNubers.add(Addition);
        mapNubers.add(Subtraction);
        mapNubers.add(Multiplication);
        mapNubers.add(Division);
        mapNubers.add(RemainderOfTheNumber);
        mapNubers.add(Nine);
        mapNubers.add(Eight);
        mapNubers.add(Seven);
        mapNubers.add(Six);
        mapNubers.add(Five);
        mapNubers.add(Four);
        mapNubers.add(Three);
        mapNubers.add(Two);
        mapNubers.add(One);
        mapNubers.add(Zero);
        mapNubers.add(Equally);
        mapNubers.add(new JLabel());
        mapNubers.add(new JLabel());
        mapNubers.add(new JLabel());
        mapNubers.add(Dell);

    }
}
