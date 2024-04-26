package com.JFrameProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleCalc {
    public static void main(String[] args) {

        SimpleCalcFrame sc = new SimpleCalcFrame();


    }
}

public class SimpleCalcFrame extends JFrame {

    JTextField f1;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9, bclr,bsin,bcos,btan,bsqrt,bhyp, bsq,badd, bsub;
    JButton bnroot, bpower,basin,bacos,batan,bsec,bcosec,bcot, bmult,bdiv,bdot, bmodulo,bfact,beq;
    JButton bsinh, bcosh, btanh,blog,bacircle,bcircumf,basector,bpsector,blarc, bln, bleq;

    static double a = 0,b=0, result=0;
    static int  opr =0;

    public SimpleCalcFrame(){

        f1 = new JTextField();
        f1.setBounds(30,15,270,35);
        f1.setBackground(Color.BLACK);
        f1.setForeground(Color.WHITE);
        f1.setFont(new Font("Arial", 1, 20));

        bclr = new JButton("C");
        bclr.setBounds(30,50,70,40);
        bclr.setBackground(Color.BLACK);
        bclr.setForeground(Color.WHITE);

        bsqrt = new JButton("√"+"x");
        bsqrt.setBounds(90,50,70,40);
        bsqrt.setFont(new Font("serif", 1, 15));
        bsqrt.setBackground(Color.BLACK);
        bsqrt.setForeground(Color.WHITE);

        bnroot = new JButton("nrt");
        bnroot.setBounds(160,50,70,40);
        bnroot.setFont(new Font("serif", 1, 15));
        bnroot.setBackground(Color.BLACK);
        bnroot.setForeground(Color.WHITE);

        bsq = new JButton("x"+"²");
        bsq.setBounds(230,50,70,40);
        bsq.setFont(new Font("serif", 1, 15));
        bsq.setBackground(Color.BLACK);
        bsq.setForeground(Color.WHITE);

        bpower = new JButton("pow");
        bpower.setBounds(30,90,70,40);
        bpower.setBackground(Color.BLACK);
        bpower.setForeground(Color.WHITE);

        bsin = new JButton("sin");
        bsin.setBounds(90,90,70,40);
        bsin.setBackground(Color.BLACK);
        bsin.setForeground(Color.WHITE);

        bcos = new JButton("cos");
        bcos.setBounds(160,90,70,40);
        bcos.setBackground(Color.BLACK);
        bcos.setForeground(Color.WHITE);

        btan = new JButton("tan");
        btan.setBounds(230,90,70,40);
        btan.setBackground(Color.BLACK);
        btan.setForeground(Color.WHITE);

        basin = new JButton("asin");
        basin.setBounds(30,130,70,40);
        basin.setBackground(Color.BLACK);
        basin.setForeground(Color.WHITE);

        bacos = new JButton("acos");
        bacos.setBounds(90,130,70,40);
        bacos.setBackground(Color.BLACK);
        bacos.setForeground(Color.WHITE);

        batan = new JButton("atan");
        batan.setBounds(160,130,70,40);
        batan.setBackground(Color.BLACK);
        batan.setForeground(Color.WHITE);

        bsec = new JButton("sec");
        bsec.setBounds(230,130,70,40);
        bsec.setBackground(Color.BLACK);
        bsec.setForeground(Color.WHITE);

        bcosec = new JButton("csc");
        bcosec.setBounds(30,170,70,40);
        bcosec.setBackground(Color.BLACK);
        bcosec.setForeground(Color.WHITE);

        bcot = new JButton("cot");
        bcot.setBounds(90,170,70,40);
        bcot.setBackground(Color.BLACK);
        bcot.setForeground(Color.WHITE);

        bsinh = new JButton("sinh");
        bsinh.setBounds(160,170,70,40);
        bsinh.setBackground(Color.BLACK);
        bsinh.setForeground(Color.WHITE);

        bcosh = new JButton("cosh");
        bcosh.setBounds(230,170,70,40);
        bcosh.setBackground(Color.BLACK);
        bcosh.setForeground(Color.WHITE);


        btanh = new JButton("tanh");
        btanh.setBounds(30,210,70,40);
        btanh.setBackground(Color.BLACK);
        btanh.setForeground(Color.WHITE);

        blog = new JButton("Log");
        blog.setBounds(90,210,70,40);
        blog.setBackground(Color.BLACK);
        blog.setForeground(Color.WHITE);

        bln = new JButton("Ln");
        bln.setBounds(160,210,70,40);
        bln.setBackground(Color.BLACK);
        bln.setForeground(Color.WHITE);

        bfact = new JButton("x!");
        bfact.setBounds(230,210,70,40);
        bfact.setBackground(Color.BLACK);
        bfact.setForeground(Color.WHITE);

        bhyp = new JButton("Hyp");
        bhyp.setBounds(30,250,70,40);
        bhyp.setBackground(Color.BLACK);
        bhyp.setForeground(Color.WHITE);
       // bhyp.setFont(new Font("Arial", Font.BOLD, 20));

        bleq = new JButton("LEQ");
        bleq.setBounds(90,250,70,40);
        bleq.setBackground(Color.BLACK);
        bleq.setForeground(Color.WHITE);
       // bleq.setFont(new Font("Arial", Font.BOLD, 20));

        bacircle = new JButton("Acirc");
        bacircle.setBounds(160,250,70,40);
        bacircle.setBackground(Color.BLACK);
        bacircle.setForeground(Color.WHITE);
       // bacircle.setFont(new Font("Arial", Font.BOLD, 20));

        bcircumf = new JButton("Circum");
        bcircumf.setBounds(230,250,70,40);
        bcircumf.setBackground(Color.BLACK);
        bcircumf.setForeground(Color.WHITE);
        bcircumf.setFont(new Font("Arial", Font.BOLD, 10));

        basector = new JButton("asect");
        basector.setBounds(30,290,70,40);
        basector.setFont(new Font("Arial", Font.BOLD, 13));
        basector.setBackground(Color.BLACK);
        basector.setForeground(Color.WHITE);

        bpsector = new JButton("psect");
        bpsector.setBounds(90,290,70,40);
        bpsector.setFont(new Font("Arial", Font.BOLD, 13));
        bpsector.setBackground(Color.BLACK);
        bpsector.setForeground(Color.WHITE);

        blarc = new JButton("larc");
        blarc.setBounds(160,290,70,40);
        blarc.setFont(new Font("Arial", Font.BOLD, 13));
        blarc.setBackground(Color.BLACK);
        blarc.setForeground(Color.WHITE);

        bmodulo = new JButton("%");
        bmodulo.setBounds(230,290,70,40);
        bmodulo.setFont(new Font("Arial", Font.BOLD, 20));
        bmodulo.setBackground(Color.BLACK);
        bmodulo.setForeground(Color.WHITE);

        b1 = new JButton("1");
        b1.setBounds(30,330,70,40);
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("2");
        b2.setBounds(90,330,70,40);
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        b3 = new JButton("3");
        b3.setBounds(160,330,70,40);
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        badd = new JButton("+");
        badd.setBounds(230,330,70,40);
        badd.setFont(new Font("Arial", Font.BOLD, 20));
        badd.setBackground(Color.BLACK);
        badd.setForeground(Color.WHITE);

        b4 = new JButton("4");
        b4.setBounds(30,370,70,40);
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);

        b5 = new JButton("5");
        b5.setBounds(90,370,70,40);
        b5.setFont(new Font("Arial", Font.BOLD, 20));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);

        b6 = new JButton("6");
        b6.setBounds(160,370,70,40);
        b6.setFont(new Font("Arial", Font.BOLD, 20));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);

        bsub = new JButton("-");
        bsub.setBounds(230,370,70,40);
        bsub.setFont(new Font("Arial", Font.BOLD, 20));
        bsub.setBackground(Color.BLACK);
        bsub.setForeground(Color.WHITE);

        b7 = new JButton("7");
        b7.setBounds(30,410,70,40);
        b7.setFont(new Font("Arial", Font.BOLD, 20));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);

        b8 = new JButton("8");
        b8.setBounds(90,410,70,40);
        b8.setFont(new Font("Arial", Font.BOLD, 20));
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);

        b9 = new JButton("9");
        b9.setBounds(160,410,70,40);
        b9.setFont(new Font("Arial", Font.BOLD, 20));
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);

        bmult = new JButton("x");
        bmult.setBounds(230,410,70,40);
        bmult.setFont(new Font("Arial", Font.BOLD, 20));
        bmult.setBackground(Color.BLACK);
        bmult.setForeground(Color.WHITE);

        b0 = new JButton("0");
        b0.setBounds(30,450,70,40);
        b0.setFont(new Font("Arial", Font.BOLD, 20));
        b0.setBackground(Color.BLACK);
        b0.setForeground(Color.WHITE);

        bdot = new JButton(".");
        bdot.setBounds(90,450,70,40);
        bdot.setFont(new Font("Arial", Font.BOLD, 20));
        bdot.setBackground(Color.BLACK);
        bdot.setForeground(Color.WHITE);

        beq = new JButton("=");
        beq.setBounds(160,450,100,40);
        beq.setFont(new Font("Arial", Font.BOLD, 30));
        beq.setBackground(Color.BLACK);
        beq.setForeground(Color.WHITE);

        bdiv = new JButton("/");
        bdiv.setBounds(230,450,70,40);
        bdiv.setFont(new Font("Arial", Font.BOLD, 20));
        bdiv.setBackground(Color.BLACK);
        bdiv.setForeground(Color.WHITE);




        add(f1);
        add(bacircle);
        add(bcircumf);
        add(basector);
        add(bpsector);
        add(blarc);
        add(bclr);
        add(bsqrt);
        add(bhyp);
        add(bsq);
        add(b1);
        add(b2);
        add(b3);
        add(badd);
        add(b4);
        add(b5);
        add(b6);
        add(bsub);
        add(b7);
        add(b8);
        add(b9);
        add(bmult);
        add(b0);
        add(bdot);
        add(bmodulo);
        add(bdiv);
        add(bfact);
        add(bsin);
        add(bcos);
        add(btan);
        add(bnroot);
        add(bpower);
        add(basin);
        add(bacos);
        add(batan);
        add(bsec);
        add(bcosec);
        add(bcot);
        add(bsinh);
        add(bcosh);
        add(btanh);
        add(blog);
        add(bln);
        add(bleq);
        add(bacircle);
        add(beq);


        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==bclr){
                    f1.setText(" ");
                }

               else if(e.getSource()==b0){
                    f1.setText(f1.getText().concat("0"));
                }

                else if(e.getSource()==b1){
                    f1.setText(f1.getText().concat("1"));
                }

                else  if(e.getSource()==b2){
                    f1.setText(f1.getText().concat("2"));
                }

                else if(e.getSource()==b3){
                    f1.setText(f1.getText().concat("3"));
                }

                else   if(e.getSource()==b4){
                    f1.setText(f1.getText().concat("4"));
                }

                else  if(e.getSource()==b5){
                    f1.setText(f1.getText().concat("5"));
                }

                else  if(e.getSource()==b6){
                    f1.setText(f1.getText().concat("6"));
                }

                else  if(e.getSource()==b7){
                    f1.setText(f1.getText().concat("7"));
                }

                else  if(e.getSource()==b8){
                    f1.setText(f1.getText().concat("8"));
                }

                else  if(e.getSource()==b9){
                    f1.setText(f1.getText().concat("9"));
                }

                else  if(e.getSource()==bdot){
                    f1.setText(f1.getText().concat("."));
                }

                else  if(e.getSource()==badd){
                    //f1.setText(f1.getText().concat("+"));
                    a = Double.parseDouble(f1.getText());
                    opr =1;
                    f1.setText("");
                }

                else  if(e.getSource()==bsub){
                    //f1.setText(f1.getText().concat("-"));
                    a = Double.parseDouble(f1.getText());
                    opr =2;
                    f1.setText("");
                }

                else if(e.getSource()==bmult){
                    a = Double.parseDouble(f1.getText());
                    opr =3;
                    f1.setText("");
                }

                else if(e.getSource()==bdiv){
                    a = Double.parseDouble(f1.getText());
                    opr =4;
                    f1.setText("");
                }

                else if(e.getSource()==bmodulo){
                    a = Double.parseDouble(f1.getText());
                    opr =5;
                    f1.setText("");
                }


                else if(e.getSource()==bhyp){
                    a = Double.parseDouble(f1.getText());
                    opr =6;
                    f1.setText("");
                }


                else if(e.getSource()==bsqrt){
                    a = Double.parseDouble(f1.getText());
                    opr =7;
                }


                else if(e.getSource()==bfact){
                    a = Double.parseDouble(f1.getText());
                    opr =8;
                }

                else if(e.getSource()==bacircle){
                    a = Double.parseDouble(f1.getText());
                    opr =9;
                }
                else if(e.getSource()==basector){
                    a = Double.parseDouble(f1.getText());
                    opr =10;
                    f1.setText("");
                }
                else if(e.getSource()==bcircumf){
                    a = Double.parseDouble(f1.getText());
                    opr =11;
                }

                else if(e.getSource()==bpsector){
                    a = Double.parseDouble(f1.getText());
                    opr =12;
                    f1.setText("");
                }

                else if(e.getSource()==blarc){
                    a = Double.parseDouble(f1.getText());
                    opr =13;
                    f1.setText("");
                }

                else if(e.getSource()==bleq){
                    a = Double.parseDouble(f1.getText());
                    opr =14;
                    f1.setText("");
                }

                else if(e.getSource()==bmodulo){
                    a = Double.parseDouble(f1.getText());
                    opr =15;
                    f1.setText("");
                }

                else if(e.getSource()==bsqrt){
                    a = Double.parseDouble(f1.getText());
                    opr =16;

                }

                else if(e.getSource()==bnroot){
                    a = Double.parseDouble(f1.getText());
                    opr =17;
                    f1.setText("");
                }

                else if(e.getSource()==bsq){
                    a = Double.parseDouble(f1.getText());
                    opr =18;
                }
                else if(e.getSource()==bpower){
                    a = Double.parseDouble(f1.getText());
                    opr =19;
                    f1.setText("");
                }

                else if(e.getSource()==bsin){
                    a = Double.parseDouble(f1.getText());
                    opr =20;
                }

                else if(e.getSource()==bcos){
                    a = Double.parseDouble(f1.getText());
                    opr =21;
                }

                else if(e.getSource()==btan){
                    a = Double.parseDouble(f1.getText());
                    opr =22;
                }

                else if(e.getSource()==basin){
                    a = Double.parseDouble(f1.getText());
                    opr =23;
                }

                else if(e.getSource()==bacos){
                    a = Double.parseDouble(f1.getText());
                    opr =24;
                }

                else if(e.getSource()==batan){
                    a = Double.parseDouble(f1.getText());
                    opr =25;
                }

                else if(e.getSource()==bsec){
                    a = Double.parseDouble(f1.getText());
                    opr =26;
                }

                else if(e.getSource()==bcosec){
                    a = Double.parseDouble(f1.getText());
                    opr =27;
                }

                else if(e.getSource()==bcot){
                    a = Double.parseDouble(f1.getText());
                    opr =28;
                }

                else if(e.getSource()==bsinh){
                    a = Double.parseDouble(f1.getText());
                    opr =29;
                }

                else if(e.getSource()==bcosh){
                    a = Double.parseDouble(f1.getText());
                    opr =30;
                }

                else if(e.getSource()==btanh){
                    a = Double.parseDouble(f1.getText());
                    opr =31;
                }

                else if(e.getSource()==blog){
                    a = Double.parseDouble(f1.getText());
                    opr =32;
                }

                else if(e.getSource()==bln){
                    a = Double.parseDouble(f1.getText());
                    opr =33;
                }


                else  if(e.getSource()==beq){
                    b = Double.parseDouble(f1.getText());

                     switch (opr)
                     {
                         case 1:
                             result = a+b;
                             break;

                         case 2:
                             result = a-b;
                             break;

                         case 3:
                             result = a*b;
                             break;

                         case 4:
                             result = a/b;
                             break;

                         case 5:
                             result = a%b;
                             break;

                         case 6:
                             result = Math.hypot(a,b);
                             break;

                         case 7:
                             result = Math.sqrt(b);
                             break;

                         case 8:
                             int mFact =1;
                           int q  = (int)(b);
                             for(int i=q; i>0;i--){
                                 mFact*=i;
                             }
                             result = mFact;
                             break;

                         case 9:
                             double pi = Math.PI;
                             result = pi * Math.pow(b,2);
                             break;

                         case 10:
                             double p = Math.PI;
                             double area = p * Math.pow(a,2);
                             result = b / 360 * area;
                             break;

                         case 11:
                             double c = Math.PI;
                             result = 2 * c * b;
                             break;

                         case 12:
                             double p1 = Math.PI;
                             double w = (b / 360) *(2*p1*a);
                             result = w+2*a;
                             break;

                         case 13:
                             double arc = Math.PI;
                             result = b * (arc / 180) * a;
                             break;

                         case 14:
                             result = -b / a;
                             break;

                         case 15:
                             result = a%b;
                             break;

                         case 16:
                             result = Math.sqrt(b);
                             break;

                         case 17:
                             result = Math.pow(b,1.0/a);
                             break;

                         case 18:
                             result = b*b;
                             break;

                         case 19:
                             result = Math.pow(a,b);
                             break;

                         case 20:
                             double d =Math.sin(Math.toRadians(b));
                             result = Math.round(d*10000.0)/10000.0;
                             break;

                         case 21:
                             double d1 =Math.cos(Math.toRadians(b));
                             result = Math.round(d1*10000.0)/10000.0;
                             break;

                         case 22:
                             double d2 =Math.tan(Math.toRadians(b));
                             result = Math.round(d2*10000.0)/10000.0;
                             break;

                         case 23:
                             double as =Math.toDegrees(Math.asin(b));
                             result = Math.round(as*100.0)/100.0;
                             break;

                         case 24:
                             double ac =Math.toDegrees(Math.acos(b));
                             result = Math.round(ac*100.0)/100.0;
                             break;

                         case 25:
                             double at =Math.toDegrees(Math.atan(b));
                             result = Math.round(at*100.0)/100.0;
                             break;

                         case 26:
                             double cos = Math.cos(Math.toRadians(b));
                             double asec = 1/cos;
                             result = Math.round(asec*100.0)/100.0;
                             break;

                         case 27:
                             double sin = Math.sin(Math.toRadians(b));
                             double cosec = 1/sin;
                             result = Math.round(cosec*100.0)/100.0;
                             break;

                         case 28:
                             double tan = Math.tan(Math.toRadians(b));
                             double cot = 1/tan;
                             result = Math.round(cot*100.0)/100.0;
                             break;

                         case 29:
                             double sinh = Math.sinh(Math.toRadians(b));
                             result = Math.round(sinh*100.0)/100.0;
                             break;

                         case 30:
                             double cosh = Math.cosh(Math.toRadians(b));
                             result = Math.round(cosh*100.0)/100.0;
                             break;

                         case 31:
                             double tanh = Math.tanh(Math.toRadians(b));
                             result = Math.round(tanh*10000.0)/10000.0;
                             break;

                         case 32:
                             double log = Math.log10(b);
                             result = Math.round(log*10000.0)/10000.0;
                             break;

                         case 33:
                             double ln = Math.log(b);
                             result = Math.round(ln*10000.0)/10000.0;
                             break;

                     }

                     f1.setText(""+result);
                }

            }
        };

//         int fact(int m){
//        int res = 1;
//        if(m>0){
//             res = m * fact(m-1);
//            return res;
//        }
//        else{
//            return res;
//        }
//    }

        bclr.addActionListener(al);
        bsqrt.addActionListener(al);
        bhyp.addActionListener(al);
        bsq.addActionListener(al);
        b1.addActionListener(al);
        b2.addActionListener(al);
        b3.addActionListener(al);
        badd.addActionListener(al);
        b4.addActionListener(al);
        b5.addActionListener(al);
        b6.addActionListener(al);
        bsub.addActionListener(al);
        b7.addActionListener(al);
        b8.addActionListener(al);
        b9.addActionListener(al);
        bmult.addActionListener(al);
        b0.addActionListener(al);
        bdot.addActionListener(al);
        bmodulo.addActionListener(al);
        bdiv.addActionListener(al);
        bfact.addActionListener(al);
        beq.addActionListener(al);
        bacircle.addActionListener(al);
        basector.addActionListener(al);
        bcircumf.addActionListener(al);
        bpsector.addActionListener(al);
        blarc.addActionListener(al);
        bleq.addActionListener(al);
        bsqrt.addActionListener(al);
        bnroot.addActionListener(al);
        bsq.addActionListener(al);
        bpower.addActionListener(al);
        bsin.addActionListener(al);
        bcos.addActionListener(al);
        btan.addActionListener(al);
        basin.addActionListener(al);
        bacos.addActionListener(al);
        batan.addActionListener(al);
        bsec.addActionListener(al);
        bcosec.addActionListener(al);
        bcot.addActionListener(al);
        bsinh.addActionListener(al);
        bcosh.addActionListener(al);
        btanh.addActionListener(al);
        blog.addActionListener(al);
        bln.addActionListener(al);








        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("Scientific Calculator");
        setLayout(null);
        setSize(350,550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
