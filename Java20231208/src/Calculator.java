import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator implements ActionListener {
    // Оголошення компонентів GUI
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functions;
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel = new JPanel();
    Font myFont = new Font("Arial", Font.BOLD, 30);

    // Змінні для виконання обчислень
    // (Використовуємо BigDecimal для можливості виходити за межі пам'яті примітивних типів)
    BigDecimal num1 = BigDecimal.valueOf(0), num2 = BigDecimal.valueOf(0), result = BigDecimal.valueOf(0);
    char operator;

    public Calculator() {
        // Ініціалізація і налаштування вікна
        frame = new JFrame("Мій калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        // Ініціалізація текстового поля
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        // Ініціалізація кнопок
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Вдлт");
        clrButton = new JButton("Очис");
        functions = new JButton[]{addButton, subButton, mulButton, divButton, decButton, equButton, delButton, clrButton};

        // Налаштування властивостей кнопок
        for (JButton function : functions) {
            function.addActionListener(this);
            function.setFont(myFont);
            function.setFocusable(false);
        }

        // Створення кнопок для цифр
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton("" + i);
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        // Розміщення кнопок на панелі
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.gray);

        // Додавання кнопок на панель
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        // Додавання панелі та інших компонентів до вікна
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Створення екземпляру калькулятора при запуску програми
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Отримання поточного тексту з текстового поля
        String currentText = textField.getText();

        // Обробка подій для кнопок цифр
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(currentText + i);
            }
        }

        // Обробка подій для кнопки десяткової коми
        if (e.getSource() == decButton) {
            textField.setText(currentText + ".");
        }

        // Обробка подій для кнопок арифметичних операцій
        if (e.getSource() == addButton || e.getSource() == subButton || e.getSource() == mulButton || e.getSource() == divButton) {
            if (!currentText.isEmpty()) {
                num1 = BigDecimal.valueOf(Double.parseDouble(currentText));
                operator = e.getActionCommand().charAt(0);
                textField.setText("");
            }
        }

        // Обробка події для кнопки "Дорівнює"
        if (e.getSource() == equButton) {
            if (!currentText.isEmpty()) {
                num2 = BigDecimal.valueOf(Double.parseDouble(currentText));
                switch (operator) {
                    // Виконання відповідної арифметичної операції
                    case '+' -> result = num1.add(num2);
                    case '-' -> result = num1.subtract(num2);
                    case '*' -> result = num1.multiply(num2);
                    case '/' -> result = num1.divide(num2, RoundingMode.HALF_UP);
                }
                textField.setText(result.toString());
                num1 = result;
            }
        }

        // Обробка подій для кнопок "Очистити" та "Видалити"
        if (e.getSource() == clrButton) {
            textField.setText("");
            currentText = "";
        }
        if (e.getSource() == delButton) {
            if (!currentText.isEmpty()) {
                textField.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
    }
}
