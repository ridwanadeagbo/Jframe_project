package com.JFrameProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MortGage {
    public static void main(String[] args) {

        MortgageCalc mc = new MortgageCalc();

    }
}


class MortgageCalc extends JFrame {

    JLabel l1,l2,l3,l4,l5;
    JTextField f1,f2,f3;
    JButton b1;

    public MortgageCalc(){
        l1 = new JLabel("Principal");
        l2 = new JLabel("Rate ");
        l3 = new JLabel("Years");
        l4 = new JLabel("");
        l5 = new JLabel("");
        f1 = new JTextField(20);
        f2 = new JTextField(20);
        f3 = new JTextField(20);

        b1 = new JButton("CALCULATE");

        add(l1);
        add(f1);
        add(l2);
        add(f2);
        add(l3);
        add(f3);
        add(b1);
        add(l4);
        add(l5);


        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double principal  = Double.parseDouble(f1.getText());
                double rate  = Double.parseDouble(f2.getText());
                int year  = Integer.parseInt(f3.getText());

                rate = rate/100/12;
                double number_of_month = year*12;
                double denum = 1 - Math.pow((1+rate), - number_of_month);
                double monthly_payment = (principal*rate)/denum;
                monthly_payment = Math.floor(monthly_payment);
                l4.setText("Your monthly payment is "+"$"+monthly_payment);
                double total = monthly_payment*number_of_month;
                l5.setText("The total amount to be paid for "+year+" years is "+total);

            }
        };

        b1.addActionListener(al);

        getContentPane().setBackground(Color.CYAN);
        setLayout(new FlowLayout());
        setSize(350,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
