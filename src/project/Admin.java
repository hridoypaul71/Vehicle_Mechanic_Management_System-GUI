package project;

        import javax.swing.*;
        import javax.swing.border.LineBorder;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;


public class Admin extends JFrame {

    JPanel panel1, panel2;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,l11;
    JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9;
    JButton bt1, bt2, bt3,bt4,bt5,bt6, bt7, bt8,bt9;

    Admin() {

        //Font
        Font font = new Font("Arial", Font.BOLD, 25);
        Font font2 = new Font("Mono", Font.BOLD, 17);

        setSize(565, 570);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(3);
        setResizable(false);


        panel1 = new JPanel();
        panel1.setBounds(4, 0, 550, 50);
        panel1.setBackground(Color.pink);
        add(panel1);
        panel1.setLayout(null);

        l1 = new JLabel("Admin Features");
        l1.setBounds(185, 4, 300, 40);
        l1.setForeground(Color.black);
        l1.setFont(font);
        panel1.add(l1);

       panel2 = new JPanel();
        panel2.setBounds(4, 54, 550, 533);
        panel2.setBackground(Color.lightGray);
        panel2.setLayout(null);
        add(panel2);

        bt3 = new JButton("Mechanic Member Info.(search");
        bt3.setBounds(170, 35, 200, 40);
        bt3.setBackground(new Color(93, 114, 217));
        bt3.setFont(font2);
        bt3.setForeground(Color.WHITE);
        bt3.setBorder(new LineBorder(Color.BLUE));
        bt3.setFocusable(false);
        panel2.add(bt3);
//        bt3.addActionListener((ActionListener) this);
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        bt4 = new JButton("Normal User Info.");
        bt4.setBounds(170, 95, 200, 40);
        bt4.setBackground(new Color( 93, 114, 217));
        bt4.setFont(font2);
        bt4.setForeground(Color.WHITE);
        bt4.setBorder(new LineBorder(Color.BLUE));
        bt4.setFocusable(false);
        panel2.add(bt4);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        bt5 = new JButton("Update(Edit) Mechanic Info.");
        bt5.setBounds(170, 155, 200, 40);
        bt5.setBackground(new Color( 93, 114, 217));
        bt5.setFont(font2);
        bt5.setForeground(Color.WHITE);
        bt5.setBorder(new LineBorder(Color.BLUE));
        bt5.setFocusable(false);
        panel2.add(bt5);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        bt6 = new JButton("Update User Info");
        bt6.setBounds(170, 215, 200, 40);
        bt6.setBackground(new Color(93, 114, 217));
        bt6.setFont(font2);
        bt6.setForeground(Color.WHITE);
        bt6.setBorder(new LineBorder(Color.BLUE));
        bt6.setFocusable(false);
        panel2.add(bt6);
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        bt7 = new JButton("News Letter Update");
        bt7.setBounds(170, 275, 200, 40);
        bt7.setBackground(new Color(93, 114, 217));
        bt7.setFont(font2);
        bt7.setForeground(Color.WHITE);
        bt7.setBorder(new LineBorder(Color.BLUE));
        bt7.setFocusable(false);
        panel2.add(bt7);
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        bt8 = new JButton("Admin Password Change ");
        bt8.setBounds(170, 335, 200, 40);
        bt8.setBackground(new Color(93, 114, 217));
        bt8.setFont(font2);
        bt8.setForeground(Color.WHITE);
        bt8.setBorder(new LineBorder(Color.BLUE));
        bt8.setFocusable(false);
        panel2.add(bt8);
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        bt9 = new JButton("Logout");
        bt9.setBounds(170, 395, 200, 40);
        bt9.setBackground(new Color(93, 114, 217));
        bt9.setFont(font2);
        bt9.setForeground(Color.WHITE);
        bt9.setBorder(new LineBorder(Color.BLUE));
        bt9.setFocusable(false);
        panel2.add(bt9);
        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

//        btn0 = new JButton("0");
//        btn0.setBackground(Color.LIGHT_GRAY);
//        btn0.setFont(font);


//        bt1 = new JButton("Login");
//        bt1.setBounds(70, 400, 120, 40);
//        bt1.setFont(font2);
//        bt1.setBackground(Color.orange);
//        //  bt2.setBorder(new LineBorder(Color.BLUE));
//        panel2.add(bt1);
//
//        bt2 = new JButton("Register");
//        bt2.setBounds(340, 400, 120, 40);
//        bt2.setFont(font2);
//        bt2.setBackground(Color.orange);
//        //  bt2.setBorder(new LineBorder(Color.BLUE));
//        panel2.add(bt2);


        /* l2 = new JLabel("User Name :");
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
        panel2.add(field7);*/

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


   /*     bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                dispose();
                new Login();
            }
        });*/

        setVisible(true);
    }

}

