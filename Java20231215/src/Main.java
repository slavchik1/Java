//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Main {
//    private JPanel test;
//    private static JFrame jFrame;
//    private Player playerX;
//    private Player player0;
//    private int currentMove;
//    private JLabel moveInfo;
//    private JButton[] buttons = new JButton[9];
//
//    public static void main(String[] args) {
//        jFrame = new JFrame("Hello World!");
//    }
//
//    private void startGame() {
//        playerX = new Player(Sides.X);
//        player0 = new Player(Sides.0);
//        currentMove = 0;
//        for (int i = 0; i < buttons.length; i++) {
//            buttons[i] = new JButton("" + (i + 1));
//            buttons[i].addActionListener(this);
//        }
//        moveInfo = new JLabel();
//        moveInfo.setFont(new Font("Comic-sans", Font.BOLD, 15));
//        moveInfo.setText("Зараз ход: X");
//        moveInfo.setBounds(110, 15, 100, 30);
//        JPanel gamePanel = new JPanel(new GridLayout(3, 3, 10, 10));
//        for (JButton button:buttons) {
//            gamePanel.add(button);
//        }
//        gamePanel.setBackground(Color.red);
//    }
//
//    public GUIText() { menuSetup(); }
//
//    private void menuSetup() {
//        test = new JPanel(null);
//        test.setPreferredSize(new Dimension());
//        JFrame.add(test);
//        JLabel mainMenuImage;
//        JButton button1Button;
//        mainMenuImage = new JLabel(new ImageIcon("<filename>"));
//    }
//}
