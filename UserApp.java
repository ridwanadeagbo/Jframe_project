package com.JFrameProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyUser extends JFrame{

    JTextField t1,t2;
    JButton b;
    JLabel l1,l2,l3;


    public MyUser(){

        t1 = new JTextField(20);
        t2 = new JTextField(20);

         b = new JButton("Compute");

         l1 = new JLabel("Welcome To This BMI Calculator");
         l2 = new JLabel("Result");
         l3 = new JLabel("Status");

        add(l1);
        add(t1);
        add(t2);
        add(b);
        add(l2);
        add(l3);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double w = Double.parseDouble(t1.getText());
                double h = Double.parseDouble(t2.getText());
                double bmi = (w/Math.pow(h,2));
                l2.setText("Your BMI is "+bmi+" ");
                if(bmi<18){
                    l3.setText("You are underweight");
                }
                else if(bmi>=18 && bmi <25){
                    l3.setText("Your Health is in good condition, keep it up!");
                }

                else if(bmi>=25 && bmi <30){
                    l3.setText("You are overweight please visit your doctor");
                }

                else{
                    l3.setText("Your Health is in critical condition, abeg start running to the Hospital!");
                }


            }
        };

        b.addActionListener(al);



        setLayout(new FlowLayout());
        setVisible(true);
        setSize(250,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




public class UserApp {
    public static void main(String[] args) {

        MyUser user = new MyUser();



    }
}
