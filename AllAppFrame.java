package com.JFrameProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class AllApp {
    public static void main(String[] args) {

        AllAppFrame af = new AllAppFrame();

    }
}


public class AllAppFrame extends JFrame{

    JButton b1,b2,b3,b4;

    public AllAppFrame(){

        b1 = new JButton("CALCULATOR");
        b2 = new JButton("BMI");
        b3 = new JButton("MORTGAGE");
        b4 = new JButton("CGP");


            add(b1);
            add(b2);
            add(b3);
            add(b4);


            ActionListener al = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(e.getSource()==b1){
                        new SimpleCalcFrame();
                    }

                    else if(e.getSource()==b3){
                        new MortgageCalc();
                    }

                    else if(e.getSource()==b4){
                        new MenuDemo();
                    }



                }
            };

            b1.addActionListener(al);
            //b1.setBackground(Color.RED);

            b2.addActionListener(al);
            //b3.setBackground(Color.RED);
            b3.addActionListener(al);
        b4.addActionListener(al);

            getContentPane().setBackground(Color.BLUE);
            setBackground(Color.BLUE);
            setLayout(new FlowLayout());
            setSize(300,300);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

}
