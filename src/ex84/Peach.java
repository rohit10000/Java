package ex84;

import javax.swing.*;
import java.awt.*;

public class Peach extends JPanel {

    public void paintComponent(Graphics g){
        //
        super.paintComponent(g);
        this.setBackground(Color.GRAY);
        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 100, 30); //x y width height
        g.setColor(new Color(190, 81, 215));
        g.fillRect(25, 65, 100, 30);
        g.setColor(Color.RED);
        g.drawString("this is some text", 25, 120);
    }

}
