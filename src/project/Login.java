package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{

    JPanel panel1, panel2;
    JLabel l1, l2, l3, l4;
    JTextField field1, field2;
    JButton bt1,bt2,bt3;

    public Login(){

        //Font
        Font font = new Font("Arial", Font.BOLD, 25);
        Font font2 = new Font("Mono", Font.BOLD, 20);
        Font font3 = new Font("Italic", Font.BOLD, 15);

        setSize(550, 400);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setBounds(3, 0, 538, 50);
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setLayout(null);
        add(panel1);

        l1 = new JLabel("Login Form");
        l1.setBounds(190, 6, 200, 40);
        l1.setBackground(Color.black);
        l1.setFont(font);
        panel1.add(l1);

        panel2 = new JPanel();
        panel2.setBounds(3, 54, 538, 315);
        panel2.setBackground(Color.orange);
        panel2.setLayout(null);
        add(panel2);

        l2 = new JLabel(" User Name :");
        l2.setBounds(40, 45, 200, 40);
        l2.setBackground(Color.black);
        l2.setFont(font2);
        panel2.add(l2);

        field1 = new JTextField();
        field1.setBounds(185, 53, 300, 25);
        field1.setFont(font2);
        panel2.add(field1);

        l3 = new JLabel(" Password :");
        l3.setBounds(53, 108, 200, 40);
        l3.setBackground(Color.black);
        l3.setFont(font2);
        panel2.add(l3);

        field2 = new JTextField();
        field2.setBounds(185, 114, 300, 25);
        field2.setFont(font2);
        panel2.add(field2);

        bt1 = new JButton("Login");
        bt1.setBounds(60, 200, 120, 40);
        bt1.setFont(font2);
        bt1.setBackground(Color.lightGray);
        panel2.add(bt1);

        bt2 = new JButton("Register");
        bt2.setBounds(365, 200, 120, 40);
        bt2.setFont(font2);
        bt2.setBackground(Color.lightGray);
        panel2.add(bt2);

        l4 = new JLabel("If you're a Mechanic");
        l4.setBounds(180, 290, 200, 20);
//        l4.setBackground(Color.WHITE);
        l4.setFont(font3);
        panel2.add(l4);

        bt3 = new JButton("Register");
        bt3.setBounds(320, 290, 70, 20);
        bt3.setFont(font3);
        bt3.setBackground(Color.orange);
        bt3.setBorder(null);
        bt3.setForeground(Color.RED);
        bt3.setFocusable(false);
        panel2.add(bt3);



        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                new CustomerRegistration();
            }
        });

        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                new MechanicRegistration();
            }
        });
        setVisible(true);
    }

}
