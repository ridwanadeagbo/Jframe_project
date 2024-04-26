package com.JFrameProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGUIApp {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JLabel l1 = new JLabel("My App");
        JLabel l2 = new JLabel(" ");
        JTextField f1 = new JTextField(20);

        JButton b1 = new JButton("CLICK");

        jf.add(l1);
        jf.add(f1);
        jf.add(b1);
        jf.add(l2);


        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = f1.getText();
                l2.setText("You are welcome "+name);
            }
        };

        b1.addActionListener(al);








        jf.setLayout(new FlowLayout());
        jf.setSize(500,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
