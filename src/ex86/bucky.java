package ex86;

import javax.swing.*;

public class bucky {
    public static void main(String[] args) {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Peach p = new Peach();
        f.add(p);
        f.setSize(500, 270);
        f.setVisible(true);
    }
}
