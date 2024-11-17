package percobaan3;

import javax.swing.*;

public class Box extends JFrame {
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_WIDTH = 200;
    private JPanel panel;

    public Box() {
        panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));

        add(panel);
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
        setTitle("Box Layout Demo");
    }
}
