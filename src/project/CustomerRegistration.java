package project;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CustomerRegistration extends JFrame {

        JPanel panel1, panel2;
        JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,l11;
        JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9;
        JButton bt1, bt2;

        CustomerRegistration() {

            //Font
            Font font = new Font("Arial", Font.BOLD, 25);
            Font font2 = new Font("Mono", Font.BOLD, 17);

            setSize(565, 620);
            setLocationRelativeTo(null);
            setLayout(null);
            setDefaultCloseOperation(3);
            setResizable(false);


            panel1 = new JPanel();
            panel1.setBounds(4, 0, 550, 50);
            panel1.setBackground(Color.ORANGE);
            add(panel1);
            panel1.setLayout(null);

            l1 = new JLabel("Customer Registration");
            l1.setBounds(139, 6, 300, 40);
            l1.setForeground(Color.black);
            l1.setFont(font);
            panel1.add(l1);

            panel2 = new JPanel();
            panel2.setBounds(4, 54, 550, 533);
            panel2.setBackground(Color.yellow);
            panel2.setLayout(null);
            add(panel2);

            l2 = new JLabel("User Name :");
            l2.setBounds(82, 30, 150, 25);
            l2.setFont(font2);
            panel2.add(l2);

            field1 = new JTextField();
            field1.setBounds(200, 30, 270, 25);
            panel2.add(field1);

            l3 = new JLabel("Full Name :");
            l3.setBounds(90, 73, 150, 25);
            l3.setFont(font2);
            panel2.add(l3);

            field2 = new JTextField();
            field2.setBounds(200, 73, 270, 25);
            panel2.add(field2);

            l4 = new JLabel("Email :");
            l4.setBounds(124, 117, 150, 25);
            l4.setFont(font2);
            panel2.add(l4);

            field3 = new JTextField();
            field3.setBounds(200, 117, 270, 25);
            panel2.add(field3);

            l5 = new JLabel("Password :");
            l5.setBounds(88, 161, 150, 25);
            l5.setFont(font2);
            panel2.add(l5);

            field4 = new JTextField();
            field4.setBounds(200, 161, 270, 25);
            panel2.add(field4);

            l6 = new JLabel("Confirm Password :");
            l6.setBounds(21, 205, 160, 25);
            l6.setFont(font2);
            panel2.add(l6);

            field5 = new JTextField();
            field5.setBounds(200, 205, 270, 25);
            panel2.add(field5);

            l7 = new JLabel("Mobile :");
            l7.setBounds(115, 249, 150, 25);
            l7.setFont(font2);
            panel2.add(l7);

            field6 = new JTextField();
            field6.setBounds(200, 249, 270, 25);
            panel2.add(field6);

            l8 = new JLabel("Address :");
            l8.setBounds(100, 293, 150, 25);
            l8.setFont(font2);
            panel2.add(l8);

            field7 = new JTextField();
            field7.setBounds(200, 293, 270, 25);
            panel2.add(field7);

//    l9 = new JLabel("<html>Service Type :<br/>(Wheel 2,3,4)</html>");
//            l9 = new JLabel("Service Type :");
//            l9.setBounds(64, 330, 250, 25);
//            l9.setFont(font2);
//            panel2.add(l9);
//
//            field8 = new JTextField();
//            field8.setBounds(200, 330, 270, 25);
//            panel2.add(field8);
//
//            l10 = new JLabel("Service area :");
//            l10.setBounds(71, 374, 150, 25);
//            l10.setFont(font2);
//            panel2.add(l10);
//
//            field9 = new JTextField();
//            field9.setBounds(200, 374, 270, 25);
//            panel2.add(field9);

           /* l11 = new JLabel("If you are a Machanic");
            l11.setBounds(100,)*/

            bt1 = new JButton("Login");
            bt1.setBounds(70, 400, 120, 40);
            bt1.setFont(font2);
            bt1.setBackground(Color.orange);
            bt1.setFocusable(false);
          //  bt2.setBorder(new LineBorder(Color.BLUE));
            panel2.add(bt1);


            bt2 = new JButton("Register");
            bt2.setBounds(340, 400, 120, 40);
            bt2.setFont(font2);
            bt2.setBackground(Color.orange);
            bt2.setFocusable(false);
          //  bt2.setBorder(new LineBorder(Color.BLUE));
            panel2.add(bt2);


            bt1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    dispose();
                    new Login();
                }
            });
            bt2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String userName = field1.getText();
                    String fullName = field2.getText();
                    String email = field3.getText();
                    String pass = field4.getText();
                    String conPass = field5.getText();
                    String mobile = field6.getText();
                    String address = field7.getText();


                    DBconnect db=new DBconnect();
                    //String queryInsert = "INSERT INTO `ureg` (`userName`, `email`, `mob`, `pass`, `add`) VALUES ('"+userName+"', '"+email+"', '"+mobile+"','"+pass+"', '"+address+"');";

                   String queryInsert = "INSERT INTO `ureg`(`userName`, `fullName`, `email`, `pass`, `conPass`, `mob`, `add`) VALUES ('"+userName+"','"+fullName+"','"+email+"','"+pass+"','"+conPass+"','"+mobile+"','"+address+"')";
                    db.RegisterInsert(queryInsert);         //
                }                                           //
            });

            setVisible(true);
        }

    }

