package com.mycompany.simpleframe;
import javax.swing.JWindow;
        
public class simpleWindow extends JWindow {
    public simpleWindow(){
        super();
    }

    public static void main(String[] args) {
        simpleWindow sw = new simpleWindow();
        sw.setVisible(false);
    }
}
