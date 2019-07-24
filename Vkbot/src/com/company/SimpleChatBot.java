 /**
 * Java. Chatter: simple chatbot
 *
 * @author Terushkov Alexandr
 * @version 0.2.3 dated 10.06.2019
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import bot.SimpleBot;

class SimpleChatBot extends JFrame implements ActionListener {

    final String TITLE_OF_PROGRAM = "Chatter: simple chatbot"; //Объявление неизменяемой строки
    final int START_LOCATION = 200; // Объявление неизменяемой целочисленной переменной
    final int WINDOW_WIDTH = 450;
    final int WINDOW_HEIGHT = 450;
    final String CHB_AI = "AI";
    final String BTN_ENTER = "Enter";

    JTextArea dialogue; // area for dialog
    JCheckBox ai;       // enable/disable AI
    JTextField message; // field for entering messages
    SimpleBot sbot;     // chat-bot class (in bot package)

    public static void main(String[] args) {
        new SimpleChatBot();
    }

    /**
     * Constructor:
     * Creating a window and all the necessary elements on it
     */
    SimpleChatBot() {
        setTitle(TITLE_OF_PROGRAM); //Заголовок программы
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Завершение программы
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIDTH, WINDOW_HEIGHT);
        // area for dialog
        dialogue = new JTextArea();
        dialogue.setLineWrap(true);
        JScrollPane scrollBar = new JScrollPane(dialogue);
        // panel for checkbox, message field and button
        JPanel bp = new JPanel();
        bp.setLayout(new BoxLayout(bp, BoxLayout.X_AXIS));
        ai = new JCheckBox("AI");
        ai.doClick();
        message = new JTextField();
        message.addActionListener(this);
        JButton enter = new JButton(BTN_ENTER);
        enter.addActionListener(this);
        // adding all elements to the window
        bp.add(ai);
        bp.add(message);
        bp.add(enter);
        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, bp);
        setVisible(true);
        sbot = new SimpleBot(); // creating bot object
    }

    /**
     * Listener of events from message field and enter button
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if (message.getText().trim().length() > 0) { //Проверка на пробелы
            dialogue.append(message.getText() + "\n");
            dialogue.append(TITLE_OF_PROGRAM.substring(0, 9) +
                    sbot.sayInReturn(message.getText(), ai.isSelected()) + "\n");

        }
        message.setText("");
        message.requestFocusInWindow();
}
}