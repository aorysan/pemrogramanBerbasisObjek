package percobaan3;

import javax.swing.*;
import java.awt.BorderLayout;

public class Border extends JFrame {
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_WIDTH = 200;
    private JPanel panel;

    public Border () {
        panel = new JPanel();

        panel.setLayout(new BorderLayout());

        panel.add(new JButton("1"), BorderLayout.NORTH);
        panel.add(new JButton("2"), BorderLayout.WEST);
        panel.add(new JButton("3"), BorderLayout.CENTER);
        panel.add(new JButton("4"), BorderLayout.EAST);
        panel.add(new JButton("5"), BorderLayout.SOUTH);

        add(panel);
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
        setTitle("Border Layout Demo");
    }
}
