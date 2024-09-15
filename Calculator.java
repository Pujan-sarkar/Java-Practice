import java.awt.Graphics;
import javax.swing.*;

public class Calculator extends JApplet {
    private int choice;

    public void init() {
        String input = JOptionPane.showInputDialog(
            "Enter 1 for Addition\n" +
            "Enter 2 for Subtraction\n" +
            "Enter 3 for Multiplication\n" +
            "Enter 4 for Division\n" +
            "Enter -99 to Exit the program\n");

        choice = Integer.parseInt(input);
        Menu();    
 }

 
    public void Menu() {
        while (choice != -99) {
            switch (choice) {
                case 1:
                    int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your 1st number:"));
                    int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your 2nd number:"));
                    int sum = number1 + number2;
                    JOptionPane.showMessageDialog(null, "Your sum is: " + sum); 
                    break;

                case 2:
                    int number3 = Integer.parseInt(JOptionPane.showInputDialog("Enter your 1st number:"));
                    int number4 = Integer.parseInt(JOptionPane.showInputDialog("Enter your 2nd number:"));
                    int difference = number3 - number4;
                    JOptionPane.showMessageDialog(null, "Your subtraction result is: " + difference);
                    break;

                case 3:
                    int number5 = Integer.parseInt(JOptionPane.showInputDialog("Enter your 1st number:"));
                    int number6 = Integer.parseInt(JOptionPane.showInputDialog("Enter your 2nd number:"));
                    int product = number5 * number6;
                    JOptionPane.showMessageDialog(null, "Your multiplication result is: " + product);
                    break;

                case 4:
                    int number7 = Integer.parseInt(JOptionPane.showInputDialog("Enter your 1st number:"));
                    int number8 = Integer.parseInt(JOptionPane.showInputDialog("Enter your 2nd number:"));
                    if (number8 == 0) {
                        JOptionPane.showMessageDialog(null, "Division by zero is not allowed!");
                    } else {
                        float quotient = (float) number7 / number8;
                        JOptionPane.showMessageDialog(null, "Your division result is: " + quotient);
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Incorrect choice!");
                    break;
            }
            String input = JOptionPane.showInputDialog(
                "Enter 1 for Addition\n" +
                "Enter 2 for Subtraction\n" +
                "Enter 3 for Multiplication\n" +
                "Enter 4 for Division\n" +
                "Enter -99 to Exit the program\n");
            choice = Integer.parseInt(input);
        }
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.init();
    }
}
