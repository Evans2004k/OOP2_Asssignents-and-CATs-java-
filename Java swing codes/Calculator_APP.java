import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_App extends JFrame implements ActionListener {

    JTextField display;
    String operator = "";
    double num1 = 0, num2 = 0, result = 0;

    public CalculatorApp() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display Field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 20));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        // Buttons
        String[] buttons = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0",".","=","+",
            "C"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        try {
            // Numbers and decimal
            if (input.matches("[0-9.]")) {
                display.setText(display.getText() + input);
            }

            // Clear button
            else if (input.equals("C")) {
                display.setText("");
                num1 = num2 = result = 0;
                operator = "";
            }

            // Operators
            else if (input.matches("[+\\-*/]")) {
                num1 = Double.parseDouble(display.getText());
                operator = input;
                display.setText("");
            }

            // Equals
            else if (input.equals("=")) {
                num2 = Double.parseDouble(display.getText());

                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/":
                        if (num2 == 0) {
                            display.setText("Error: Div by 0");
                            return;
                        }
                        result = num1 / num2;
                        break;
                }

                display.setText(String.valueOf(result));
            }

        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}