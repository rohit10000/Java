package ex50;

import javax.swing.JOptionPane;
public class apples {
    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second number");

        int sum = Integer.parseInt(fn) + Integer.parseInt(sn);

        JOptionPane.showMessageDialog(null, "The answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);
    }
}
