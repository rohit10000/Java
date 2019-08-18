package ex72;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    private JList leftlist;
    private JList rightList;
    private JButton moveButton;
    private static String[] foods = {"bacon", "wings", "ham", "beef", "morebacon"};

    public Gui() {
        super("title");
        setLayout(new FlowLayout());
        leftlist = new JList(foods);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        moveButton = new JButton("Move-->");
        moveButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        rightList.setListData(leftlist.getSelectedValues());
                    }
                }
        );
        add(moveButton);

        rightList = new JList();
        rightList.setVisibleRowCount(3);
        rightList.setFixedCellWidth(100);
        rightList.setFixedCellHeight(15);
        rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightList));
    }
}
