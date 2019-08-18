package ex51;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class tuna extends JFrame{
    public JLabel item1;

    public tuna(){
        super("This is the title");
        setLayout(new FlowLayout());

        item1 = new JLabel("This is the sentence");
        item1.setToolTipText("this is the message on hover");
        add(item1);
    }
}
