package com.JFrameProject;


import com.JFrameProject.GradePoint.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo extends JFrame {

    JMenuBar mb;
    JMenu dept1, dept2,dept3,csc_level1,csc_level2,csc_level3,csc_level4,mth_level1,mth_level2;
    JMenu mth_level3,mth_level4,elect_level1,elect_level2,elect_level3,elect_level4;

    JMenuItem csc_level1_semester1,csc_level1_semester2,csc_level2_semester1,csc_level2_semester2;
    JMenuItem csc_level3_semester1,csc_level3_semester2,csc_level4_semester1,csc_level4_semester2;

    JMenuItem mth_level1_semester1,mth_level1_semester2,mth_level2_semester1,mth_level2_semester2;
    JMenuItem mth_level3_semester1,mth_level3_semester2,mth_level4_semester1,mth_level4_semester2;

    JMenuItem elect_level1_semester1,elect_level1_semester2,elect_level2_semester1,elect_level2_semester2;
    JMenuItem elect_level3_semester1,elect_level3_semester2,elect_level4_semester1,elect_level4_semester2;


    public MenuDemo(){
        mb = new JMenuBar();

        dept1= new JMenu("Computer Science");
        dept2= new JMenu("Maths");
        dept3= new JMenu("Electrical");

        csc_level1 = new JMenu("100 level");
        csc_level2 = new JMenu("200 level");
        csc_level3 = new JMenu("300 level");
        csc_level4 = new JMenu("400 level");

        mth_level1 = new JMenu("100 level");
        mth_level2 = new JMenu("200 level");
        mth_level3 = new JMenu("300 level");
        mth_level4 = new JMenu("400 level");


        elect_level1 = new JMenu("100 level");
        elect_level2 = new JMenu("200 level");
        elect_level3 = new JMenu("300 level");
        elect_level4 = new JMenu("400 level");

        csc_level1_semester1 = new JMenuItem("First Semester");
        csc_level1_semester2 = new JMenuItem("Second Semester");

        csc_level2_semester1 = new JMenuItem("First Semester");
        csc_level2_semester2 = new JMenuItem("Second Semester");

        csc_level3_semester1 = new JMenuItem("First Semester");
        csc_level3_semester2 = new JMenuItem("Second Semester");

        csc_level4_semester1 = new JMenuItem("First Semester");
        csc_level4_semester2 = new JMenuItem("Second Semester");

        mth_level1_semester1 = new JMenuItem("First Semester");
        mth_level1_semester2 = new JMenuItem("Second Semester");

        mth_level2_semester1 = new JMenuItem("First Semester");
        mth_level2_semester2 = new JMenuItem("Second Semester");

        mth_level3_semester1 = new JMenuItem("First Semester");
        mth_level3_semester2 = new JMenuItem("Second Semester");

        mth_level4_semester1 = new JMenuItem("First Semester");
        mth_level4_semester2 = new JMenuItem("Second Semester");


        elect_level1_semester1 = new JMenuItem("First Semester");
        elect_level1_semester2 = new JMenuItem("Second Semester");

        elect_level2_semester1 = new JMenuItem("First Semester");
        elect_level2_semester2 = new JMenuItem("Second Semester");

        elect_level3_semester1 = new JMenuItem("First Semester");
        elect_level3_semester2 = new JMenuItem("Second Semester");

        elect_level4_semester1 = new JMenuItem("First Semester");
        elect_level4_semester2 = new JMenuItem("Second Semester");


        csc_level1.add(csc_level1_semester1);
        csc_level1.add(csc_level1_semester2);

        csc_level2.add(csc_level2_semester1);
        csc_level2.add(csc_level2_semester2);

        csc_level3.add(csc_level3_semester1);
        csc_level3.add(csc_level3_semester2);

        csc_level4.add(csc_level4_semester1);
        csc_level4.add(csc_level4_semester2);

        mth_level1.add(mth_level1_semester1);
        mth_level1.add(mth_level1_semester2);

        mth_level2.add(mth_level2_semester1);
        mth_level2.add(mth_level2_semester2);

        mth_level3.add(mth_level3_semester1);
        mth_level3.add(mth_level3_semester2);

        mth_level4.add(mth_level4_semester1);
        mth_level4.add(mth_level4_semester2);


        elect_level1.add(elect_level1_semester1);
        elect_level1.add(elect_level1_semester2);

        elect_level2.add(elect_level2_semester1);
        elect_level2.add(elect_level2_semester2);

        elect_level3.add(elect_level3_semester1);
        elect_level3.add(elect_level3_semester2);

        elect_level4.add(elect_level4_semester1);
        elect_level4.add(elect_level4_semester2);


        dept1.add(csc_level1);
        dept1.add(csc_level2);
        dept1.add(csc_level3);
        dept1.add(csc_level4);


        dept2.add(mth_level1);
        dept2.add(mth_level2);
        dept2.add(mth_level3);
        dept2.add(mth_level4);


        dept3.add(elect_level1);
        dept3.add(elect_level2);
        dept3.add(elect_level3);
        dept3.add(elect_level4);


        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==csc_level1_semester1){
                    new ComputerLevel1Semester1Frame();
                }

                else if(e.getSource()==csc_level1_semester2){
                    new ComputerLevel1Semester2();
                }

                else if(e.getSource()==csc_level2_semester1){
                    new ComputerLevel2Semester1();
                }

                else if(e.getSource()==csc_level2_semester2){
                    new ComputerLevel2Semester2();
                }

                else if(e.getSource()==csc_level3_semester1){
                    new ComputerLevel3Semester1();
                }
                else if(e.getSource()==csc_level3_semester2){
                    new ComputerLevel3Semester2();
                }
                else if(e.getSource()==csc_level4_semester1){
                    new ComputerLevel4Semester1();
                }
                else if(e.getSource()==csc_level4_semester2){
                    new ComputerLevel4Semester2();
                }
                else if(e.getSource()==elect_level1_semester1){
                    new ElectricalLevel1Semester1();
                }
                else if(e.getSource()==elect_level1_semester2){
                    new ElectricalLevel1Semester2();
                }

                else if(e.getSource()==elect_level2_semester1){
                    new ElectricalLevel2Semester1();
                }
                else if(e.getSource()==elect_level2_semester2){
                    new ElectricalLevel2Semester2();
                }

                else if(e.getSource()==elect_level3_semester1){
                    new ElectricalLevel3Semester1();
                }
                else if(e.getSource()==elect_level3_semester2){
                    new ElectricalLevel3Semester2();
                }
                else if(e.getSource()==elect_level4_semester1){
                    new ElectricalLevel4Semester1();
                }
                else if(e.getSource()==elect_level4_semester2){
                    new ElectricalLevel4Semester2();
                }
                else if(e.getSource()==mth_level1_semester1){
                    new MathLevel1Semester1();
                }
                else if(e.getSource()==mth_level1_semester2){
                    new MathLevel1Semester2();
                }
                else if(e.getSource()==mth_level2_semester1){
                    new MathLevel2Semester1();
                }
                else if(e.getSource()==mth_level2_semester2){
                    new MathLevel2Semester2();
                }
                else if(e.getSource()==mth_level3_semester1){
                    new MathLevel3Semester1();
                }
                else if(e.getSource()==mth_level3_semester2){
                    new MathLevel3Semester2();
                }
                else if(e.getSource()==mth_level4_semester1){
                    new MathLevel4Semester1();
                }
                else if(e.getSource()==mth_level4_semester2){
                    new MathLevel4Semester2();
                }






            }
        };

        csc_level1_semester1.addActionListener(al);
        csc_level1_semester2.addActionListener(al);

        csc_level2_semester1.addActionListener(al);
        csc_level2_semester2.addActionListener(al);

        csc_level3_semester1.addActionListener(al);
        csc_level3_semester2.addActionListener(al);

        csc_level4_semester1.addActionListener(al);
        csc_level4_semester2.addActionListener(al);


        elect_level1_semester1.addActionListener(al);
        elect_level1_semester2.addActionListener(al);

        elect_level2_semester1.addActionListener(al);
        elect_level2_semester2.addActionListener(al);

        elect_level3_semester1.addActionListener(al);
        elect_level3_semester2.addActionListener(al);

        elect_level4_semester1.addActionListener(al);
        elect_level4_semester2.addActionListener(al);

        mth_level1_semester1.addActionListener(al);
        mth_level1_semester2.addActionListener(al);

        mth_level2_semester1.addActionListener(al);
        mth_level2_semester2.addActionListener(al);

        mth_level3_semester1.addActionListener(al);
        mth_level3_semester2.addActionListener(al);

        mth_level4_semester1.addActionListener(al);
        mth_level4_semester2.addActionListener(al);









        mb.add(dept1);
        mb.add(dept2);
        mb.add(dept3);


        setJMenuBar(mb);
        setTitle("Menu Demo");
        setLayout(null);
        setSize(350,550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class Menuframe{
    public static void main(String[] args) {
        MenuDemo md = new MenuDemo();
    }
}






