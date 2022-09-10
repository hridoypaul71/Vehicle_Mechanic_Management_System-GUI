
package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ContactMechanic extends JFrame {

    JPanel panel1, panel2;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,l11,l12,l13;
    JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9,field10,field11,field12;
    JButton bt1, bt2;

    ContactMechanic() {

        //Font
        Font font = new Font("Arial", Font.BOLD, 25);
        Font font2 = new Font("Mono", Font.BOLD, 17);
        setSize(1000, 560);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(3);
        setResizable(false);


        panel1 = new JPanel();
        panel1.setBounds(4, 0, 986, 50);
        panel1.setBackground(Color.ORANGE);
        add(panel1);
        panel1.setLayout(null);

        l1 = new JLabel("Contact Mechanic Informations");
        l1.setBounds(290,4,400,45);
        l1.setForeground(Color.black);
        l1.setFont(font);
        panel1.add(l1);

        panel2 = new JPanel();
        panel2.setBounds(4, 54, 986, 474);
        panel2.setBackground(Color.yellow);
        panel2.setLayout(null);
        add(panel2);

        l2 = new JLabel(" Name :");
        l2.setBounds(42, 35, 150, 25);
        l2.setFont(font2);
        panel2.add(l2);

        field1 = new JTextField();
        field1.setBounds(170, 35, 270, 25);
        panel2.add(field1);

        l3 = new JLabel("Contact num :");
        l3.setBounds(42, 83, 150, 25);
        l3.setFont(font2);
        panel2.add(l3);

        field2 = new JTextField();
        field2.setBounds(170, 83, 270, 25);
        panel2.add(field2);

        l4 = new JLabel("Name :");
        l4.setBounds(42, 150, 150, 25);
        l4.setFont(font2);
        panel2.add(l4);

        field3 = new JTextField();
        field3.setBounds(170, 150, 270, 25);
        panel2.add(field3);

        l5 = new JLabel("Contact num :");
        l5.setBounds(42, 199, 150, 25);
        l5.setFont(font2);
        panel2.add(l5);

        field4 = new JTextField();
        field4.setBounds(170, 199, 270, 25);
        panel2.add(field4);

        l6 = new JLabel("Name :");
        l6.setBounds(42, 266, 160, 25);
        l6.setFont(font2);
        panel2.add(l6);

        field5 = new JTextField();
        field5.setBounds(170, 266, 270, 25);
        panel2.add(field5);

        l7 = new JLabel("Contact num :");
        l7.setBounds(42, 315, 150, 25);
        l7.setFont(font2);
        panel2.add(l7);

        field6 = new JTextField();
        field6.setBounds(170, 315, 270, 25);
        panel2.add(field6);

        l8 = new JLabel("Name :");
        l8.setBounds(500, 35, 150, 25);
        l8.setFont(font2);
        panel2.add(l8);

        field7 = new JTextField();
        field7.setBounds(630, 35, 270, 25);
        panel2.add(field7);

        l9 = new JLabel("Contact num :");
        l9.setBounds(500, 83, 150, 25);
        l9.setFont(font2);
        panel2.add(l9);

        field8 = new JTextField();
        field8.setBounds(630, 83, 270, 25);
        panel2.add(field8);

        l10 = new JLabel("Name :");
        l10.setBounds(500, 150, 150, 25);
        l10.setFont(font2);
        panel2.add(l10);

        field9 = new JTextField();
        field9.setBounds(630, 150, 270, 25);
        panel2.add(field9);

        l11 = new JLabel("Contact num :");
        l11.setBounds(500, 199, 150, 25);
        l11.setFont(font2);
        panel2.add(l11);

        field10 = new JTextField();
        field10.setBounds(630, 199, 270, 25);
        panel2.add(field10);

        l12 = new JLabel("Name :");
        l12.setBounds(500, 266, 150, 25);
        l12.setFont(font2);
        panel2.add(l12);

        field11 = new JTextField();
        field11.setBounds(630, 266, 270, 25);
        panel2.add(field11);

        l13 = new JLabel("Contact num :");
        l13.setBounds(500, 315, 150, 25);
        l13.setFont(font2);
        panel2.add(l13);

        field12 = new JTextField();
        field12.setBounds(630, 315, 270, 25);
        panel2.add(field12);
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

        bt1 = new JButton("Back");
        bt1.setBounds(150, 400, 120, 40);
        bt1.setFont(font2);
        bt1.setBackground(Color.orange);
        bt1.setFocusable(false);
        //  bt2.setBorder(new LineBorder(Color.BLUE));
        panel2.add(bt1);


        bt2 = new JButton("Logout");
        bt2.setBounds(695, 400, 120, 40);
        bt2.setFont(font2);
        bt2.setBackground(Color.orange);
        bt2.setFocusable(false);
        //  bt2.setBorder(new LineBorder(Color.BLUE));
        panel2.add(bt2);

        field1.setEditable(false);
        field2.setEditable(false);
        field3.setEditable(false);
        field4.setEditable(false);
        field5.setEditable(false);
        field6.setEditable(false);

        try{
//            String str = "hp1";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/project";
            //String url = "jdbc:mysql://localhost:3306/macreg";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            String add = "Zakiganj";

            ResultSet rs = st.executeQuery("SELECT * FROM macreg where address = 'Zakiganj'");

                rs.next();
                String s11 = rs.getString(3);
                field1.setText(s11);
                String s21 = rs.getString(7);
                field2.setText(s21);

                rs.next();
                String s32 = rs.getString(3);
                field3.setText(s32);
                String s42 = rs.getString(7);
                field4.setText(s42);

                rs.next();
                String s51 = rs.getString(3);
                field5.setText(s51);
                String s62 = rs.getString(7);
                field6.setText(s62);




                 field5.setText(s11);


        }
        catch (Exception e){
            System.out.println(e);
        }

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                new Driver();
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                dispose();
                new Login();

//                String userName = field1.getText();
//                String fullName = field2.getText();
//                String email = field3.getText();
//                String pass = field4.getText();
//                String conPass = field5.getText();
//                String mobile = field6.getText();
//                String address = field7.getText();
//
//
//                DBconnect db=new DBconnect();
//                //String queryInsert = "INSERT INTO `ureg` (`userName`, `email`, `mob`, `pass`, `add`) VALUES ('"+userName+"', '"+email+"', '"+mobile+"','"+pass+"', '"+address+"');";
//
//                String queryInsert = "INSERT INTO `ureg`(`userName`, `fullName`, `email`, `pass`, `conPass`, `mob`, `add`) VALUES ('"+userName+"','"+fullName+"','"+email+"','"+pass+"','"+conPass+"','"+mobile+"','"+address+"')";
//                db.RegisterInsert(queryInsert);         //
            }                                           //
        });

        setVisible(true);
    }

}


