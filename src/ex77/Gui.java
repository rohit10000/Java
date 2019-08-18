package ex77;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui extends JFrame {
    private String details;
    private JLabel statusbar;

    public Gui(){
        super("title");
        statusbar = new JLabel("this is a  default");
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new MouseClass());
    }

    private class MouseClass extends MouseAdapter{
        public void mouseClicked(MouseEvent event){
            details = String.format("You clicked %d", event.getClickCount());
            if(event.isMetaDown())
                    details+="with right mouse button";
            else if(event.isAltDown())
                    details+="with center mouse button";
            else
                details+="with left mouse button";
            statusbar.setText(details);
        }
    }

}
