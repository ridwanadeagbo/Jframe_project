package com.JFrameProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstCalcUsingConstructor{
    public static void main(String[] args) {

        FirstCalc1 fc1  = new FirstCalc1();

    }

}


class FirstCalc1 extends JFrame{

    JLabel l1,l2,l3;
    JTextField f1,f2;
    JButton b1;

    public FirstCalc1(){
         l1 = new JLabel("value1");
         l2 = new JLabel(" ");
         l3 = new JLabel("value2");
         f1 = new JTextField(20);
         f2 = new JTextField(20);

         b1 = new JButton("CLICK");

        add(l1);
        add(f1);
        add(l3);
        add(f2);
        add(b1);
        add(l2);


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


        setLayout(new FlowLayout());
        setSize(250,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
