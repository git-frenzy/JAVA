package YouTube.GUI;

import javax.swing.JOptionPane;

public class DialogueBox {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, "you're " + age+" years old");

        Double height = Double.parseDouble(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, "you're " + height+" cm tall");

    }
}