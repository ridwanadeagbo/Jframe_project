package com.JFrameProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    public static void main(String[] args) {
        LoginFrame lf = new LoginFrame();
    }
}


class LoginFrame extends JFrame{

    JLabel l1,l2,l3;
    JTextField f1,f2;
    JButton b1;
    JPasswordField jp;

    public LoginFrame(){
        l1 = new JLabel("Uname");
        l2 = new JLabel(" ");
        l3 = new JLabel("Password");
        f1 = new JTextField(20);
        f2 = new JTextField(20);
        jp = new JPasswordField(20);

        b1 = new JButton("LOGIN");

        add(l1);
        add(f1);
        add(l3);
        add(jp);
        add(b1);
        add(l2);


        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String uname = f1.getText();
                String pass = String.valueOf(jp.getPassword());

                if(uname.equals("admin") && pass.equals("123")){
                    new AllAppFrame();
                }
                else{
                    JOptionPane.showMessageDialog(null,"This is an Error", "Login Error",JOptionPane.ERROR_MESSAGE);
                   // l2.setText("Incorrect Credentials");
                    f1.setText("");
                    jp.setText("");
                }



            }
        };

        b1.addActionListener(al);


        setLayout(new FlowLayout());
        setSize(250,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

