package percobaan3;

import javax.swing.*;
import java.awt.GridLayout;

public class Grid extends JFrame {
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_WIDTH = 200;
    private JPanel panel;

    public Grid() {
        panel = new JPanel();

        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        panel.add(new JButton("Button 7"));
        panel.add(new JButton("Button 8"));

        add(panel);
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
        setTitle("Grid Layout Demo");
    }
}
