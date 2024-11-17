/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleframe;

import javax.swing.JFrame;

/**
 *
 * @author Aorys
 */
public class SimpleFrame extends JFrame {

    public SimpleFrame() {
        super("Buat Aplikasi Cuyy");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
        
    public static void main(String[] args) {
        SimpleFrame sf = new SimpleFrame();
    }
}
