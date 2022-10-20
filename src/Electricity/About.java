package Electricity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About(){
        setLayout(null);
        b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);

         f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s= "                               About Project                \n   "
                +"\n This project is a software based application developed in Java.\n "
                +"This is a concept for computerizing a billing System focused on the \n"
                +"calculations of units consumed in a during a specified time.\n\n";

        t1 = new TextArea(s, 5, 20, Scrollbar.VERTICAL);
        t1.setEditable(true);
        t1.setBounds(20, 100, 450, 300);

        add(t1);

        f1 = new Font("RALEWAY", Font.BOLD, 16);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

         l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);

        f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        dispose();
    }

    public static void main(String[] args){
        new About().setVisible(true);
    }


}
