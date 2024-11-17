package percobaan2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aorys
 */

import java.awt.event.*;
import javax.swing.*;

public class myInputForm extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button0;
    private JButton button1;
    private JPanel panel;

    public myInputForm() {
        createTextField();
        createButtonMultiply();
        createButtonAddition();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A");
        bLabel = new JLabel("Nilai B");
        cLabel = new JLabel("Hasil kali : ");
        dLabel = new JLabel("Hasil tambah : ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("");


    }

    private void createButtonMultiply() {
        button0 = new JButton("Kalikan");

        class addInterestListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(aField.getText());
                int c = a * b;
    
                cLabel.setText("Hasil kali : " + c);
            }
        }

        ActionListener listener = new addInterestListener();
        button0.addActionListener(listener);
    }

    private void createButtonAddition() {
        button1 = new JButton("Tambahkan");

        class addInterestListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(aField.getText());
                int d = a + b;
    
                dLabel.setText("Hasil tambah : " + d);
            }
        }

        ActionListener listener = new addInterestListener();
        button1.addActionListener(listener);
    }

    private void createPanel() {
        panel = new JPanel();

        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button0);
        panel.add(button1);
        panel.add(cLabel);
        panel.add(dLabel);

        add(panel);
    }
}
