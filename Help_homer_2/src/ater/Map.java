package ater;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.Random;

public class Map extends JPanel {
    public static final int GM_HVA = 0;
    public static final int GM_HVH = 1;

    private static final int DOT_EMPTY = 0;
    private static final int DOT_HUMAN = 1;
    private static final int DOT_AI = 2;
    private static final int DOT_PADDING = 5;

    private int stateGameOver;
    private static final int STATE_DRAW = 0;
    private static final int STATE_WIN_HUMAN = 1;
    private static final int STATE_WIN_AI = 2;

    private static Image background;
    private static Image game_over_img;
    private static Image game_win;
    private static Image dot_human;
    private static Image dot_ai;

    private static final Random RANDOM = new Random();

    private int[][] field;
    private int fieldSizeX;
    private int fieldSizeY;
    private int winLength;
    private int cellWidth;
    private int cellHeight;
    private boolean isGameOver;
    private boolean initialized;




    Map() throws IOException {
        background = ImageIO.read(Map.class.getResourceAsStream("background.jpg"));
        dot_human = ImageIO.read(GameWindow.class.getResourceAsStream("dot_human.png"));
        dot_ai = ImageIO.read(GameWindow.class.getResourceAsStream("dot_ai.png"));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                update(e);
            }
        });
        initialized = false;
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        this.fieldSizeY = fieldSizeY;
        this.fieldSizeX = fieldSizeX;
        this.winLength = winLength;
        field = new int[fieldSizeY][fieldSizeX];
        isGameOver = false;
        initialized = true;
        repaint();
    }

    private void setGameOver(int gameOverState) {
        isGameOver = true;
        stateGameOver = gameOverState;
        repaint();
    }

    private void update(MouseEvent e) {
        if (!initialized) return;
        if (isGameOver) return;
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;
        if (!isValidCell(cellX, cellY) || !isEmptyCell(cellX, cellY))
            return;
        field[cellY][cellX] = DOT_HUMAN;
        if (checkWin(DOT_HUMAN)) {
            setGameOver(STATE_WIN_HUMAN);
            return;
        }
        if (isMapFull()) {
            setGameOver(STATE_DRAW);
            return;
        }
        aiTurn();
        repaint();
        if (checkWin(DOT_AI)) {
            setGameOver(STATE_WIN_AI);
            return;
        }
        if (isMapFull()) {
            setGameOver(STATE_DRAW);
            return;
        }
    }

    private void render(Graphics g) throws IOException {
        int cellX = cellWidth;
        int cellY = cellHeight;
        if (!initialized){
            g.drawImage(background, 0, 0, null);
        } setBackground(Color.white);
        if (!initialized) return;
        int width = getWidth();
        int height = getHeight();
        cellWidth = width / fieldSizeX;
        cellHeight = height / fieldSizeY;
        g.setColor(Color.BLACK);
        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, width, y);
        }
        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, height);
        }
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isEmptyCell(x, y)) continue;
                if (field[y][x] == DOT_HUMAN) {
                    if (dot_human != null)
                        g.drawImage(dot_human, x*cellWidth,y*cellHeight,cellX,cellY, null );
                    else {
                        g.setColor(new Color(1, 1, 255));
                        g.fillOval(x * cellWidth + DOT_PADDING,
                                y * cellHeight + DOT_PADDING,
                                cellWidth - DOT_PADDING * 2,
                                cellHeight - DOT_PADDING * 2);
                    }
                } else if (field[y][x] == DOT_AI) {
                    if (dot_ai != null)
                        g.drawImage(dot_ai, x*cellWidth,y*cellHeight,cellX,cellY, null );
                    else {
                        g.setColor(Color.RED);
                        g.fillRect(x * cellWidth + DOT_PADDING,
                            y * cellHeight + DOT_PADDING,
                            cellWidth - DOT_PADDING * 2,
                            cellHeight - DOT_PADDING * 2);
                    }

                } else {
                    throw new RuntimeException(
                            String.format("Can't recognize cell field[%d][%d]: %d", y, x, field[y][x]));
                }

            }
        }
        if (isGameOver) {
            showMessageGameOver(g);
        }
    }

    private void showMessageGameOver(Graphics g) throws IOException {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 200, getWidth(), 70);
        g.setColor(Color.RED);
        g.setFont(new Font("Times new roman", Font.BOLD, 48));
        game_over_img = ImageIO.read(GameWindow.class.getResourceAsStream("game_over.jpg"));
        game_win = ImageIO.read(GameWindow.class.getResourceAsStream("game_win.jpg"));
        switch (stateGameOver) {
            case STATE_DRAW:
                g.drawImage(game_over_img, 0, 0, null);
                break;
            case STATE_WIN_AI:
                g.drawImage(game_over_img, 0, 0, null);
                break;
            case STATE_WIN_HUMAN:
                g.drawImage(game_win, 0, 0, null);
                break;
            default:
                throw new RuntimeException("Unexpected gameOver state: " + stateGameOver);
        }
    }

    // Ход компьютера
    private void aiTurn() {
        if(turnAIWinCell()) return;
        if(turnHumanWinCell()) return;
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }

    private boolean turnAIWinCell() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    field[i][j] = DOT_AI;
                    if (checkWin(DOT_AI)) return true;
                    field[i][j] = DOT_EMPTY;
                }
            }
        }
        return false;
    }

    private boolean turnHumanWinCell() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    field[i][j] = DOT_HUMAN;
                    if (checkWin(DOT_HUMAN)) {
                        field[i][j] = DOT_AI;
                        return true;
                    }
                    field[i][j] = DOT_EMPTY;
                }
            }
        }
        return false;
    }
    // проверка на победу
    private  boolean checkWin(int c) {
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                if (checkLine(i, j, 1, 0, winLength, c)) return true;
                if (checkLine(i, j, 1, 1, winLength, c)) return true;
                if (checkLine(i, j, 0, 1, winLength, c)) return true;
                if (checkLine(i, j, 1, -1, winLength, c)) return true;
            }
        }
        return false;
    }
    // проверка линии
    private boolean checkLine(int x, int y, int vx, int vy, int len, int c) {
        final int far_x = x + (len - 1) * vx;
        final int far_y = y + (len - 1) * vy;
        if (!isValidCell(far_x, far_y)) return false;
        for (int i = 0; i < len; i++) {
            if (field[y + i * vy][x + i * vx] != c) return false;
        }
        return true;
    }
    // ничья?
    private boolean isMapFull() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    // ячейка-то вообще правильная?
    private boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }
    // а пустая?
    private boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            render(g);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

