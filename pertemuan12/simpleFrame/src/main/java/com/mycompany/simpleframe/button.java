package com.mycompany.simpleframe;
import javax.swing.*;

public class button extends JFrame {
    JButton abort = new JButton("Abort");
    JButton retry = new JButton("Retry");
    JButton fail = new JButton("Fail");

    public button(){
        super("Buttons");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.add(abort);
        pane.add(retry);
        pane.add(fail);
        setContentPane(pane);
    }

    public static void main(String[] args) {
        button rb = new button();
        rb.setVisible(true);
    }
}
