package ex66;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Gui extends JFrame {
    private JTextField tf;
    private Font bf;
    private Font pf;
    private Font itf;
    private Font bif;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup group;

    public Gui(){
        super("the title");
        setLayout(new FlowLayout());
        tf = new JTextField("Bucky is teaching.", 25);
        add(tf);

        pb = new JRadioButton("plain", true);
        bb = new JRadioButton("Bold", false);
        ib = new JRadioButton("Italic", false);
        bib = new JRadioButton("Bold and Italic", false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);

        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        tf.setFont(pf);
        //wait for event to happen and pass it to constructor
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));
    }
    private  class HandlerClass implements ItemListener {
        private Font font;

        //the font object get variable font
        public HandlerClass(Font f){
            font =f;
        }
        public void itemStateChanged(ItemEvent event){
            tf.setFont(font);
        }
    }

}
