package com.JFrameProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstCalc {
    public static void main(String[] args) {

        JFrame jf = new JFrame();
        JLabel l1 = new JLabel("value1");
        JLabel l2 = new JLabel(" ");
        JLabel l3 = new JLabel("value2");
        JTextField f1 = new JTextField(20);
        JTextField f2 = new JTextField(20);

        JButton b1 = new JButton("CLICK");

        jf.add(l1);
        jf.add(f1);
        jf.add(l3);
        jf.add(f2);
        jf.add(b1);
        jf.add(l2);



        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int val1  = Integer.parseInt(f1.getText());
                int val2  = Integer.parseInt(f2.getText());
                int res = val1 + val2;
                l2.setText(res+"");
            }
        };

        b1.addActionListener(al);








        jf.setLayout(new FlowLayout());
        jf.setSize(250,250);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
