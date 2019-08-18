package ex52_54;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class tuna extends JFrame{
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JPasswordField passwordField;

    public tuna(){
        super("This is a title");
        setLayout(new FlowLayout());
        text1 = new JTextField(10);
        add(text1);
        text2 = new JTextField("enter text here");
        add(text2);
        text3 = new JTextField("uneditable", 20);
        text3.setEditable(false);
        add(text3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);

        thehandler handler = new thehandler();
        text1.addActionListener(handler);
        text2.addActionListener(handler);
        text3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private  class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent event) {

            String string = "";
            if (event.getSource() == text1)
                string = String.format("field 1: %s", event.getActionCommand());
            else if (event.getSource() == text2)
                string = String.format("field 2: %s", event.getActionCommand());
            if (event.getSource() == text3)
                string = String.format("field 3: %s", event.getActionCommand());
            if (event.getSource() == passwordField)
                string = String.format("password field : %s", event.getActionCommand());

            JOptionPane.showMessageDialog(null, "Message is " + string, "the title", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
