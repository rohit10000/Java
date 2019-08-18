package ex68;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Gui extends JFrame {

    private JComboBox box;
    private JLabel picture;
    private static String[] filename = {"d.jpg", "x.jpg"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};

    public Gui(){
        super("the title");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);
        box.addItemListener(
                //Anonymous inner class
                new ItemListener()
                {
                    public void itemStateChanged(ItemEvent event){
                        if(event.getStateChange()== ItemEvent.SELECTED)
                                picture.setIcon(pics[box.getSelectedIndex()]);
                    }
                }
        );
        add(box);
        picture=new JLabel(pics[0]);
        add(picture);
    }
}
