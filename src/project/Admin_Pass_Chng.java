package project;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Admin_Pass_Chng extends JFrame {
    static String pass;
    JPanel panel1, panel2;
    JLabel l1, l2, l3, l4;
    JTextField field1;
    JPasswordField field2;
    JButton bt1,bt2,bt3;

    public Admin_Pass_Chng(){

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

        l1 = new JLabel("Admin Pass Change");
        l1.setBounds(157, 6, 270, 40);
        l1.setBackground(Color.black);
        l1.setFont(font);
        panel1.add(l1);

        panel2 = new JPanel();
        panel2.setBounds(3, 54, 538, 315);
        panel2.setBackground(Color.orange);
        panel2.setLayout(null);
        add(panel2);

        l2 = new JLabel("Current Pass :");
        l2.setBounds(15, 45, 200, 40);
        l2.setBackground(Color.black);
        l2.setFont(font2);
        panel2.add(l2);

        field1 = new JPasswordField();
        field1.setBounds(185, 53, 300, 25);
        field1.setFont(font2);
        panel2.add(field1);

        l3 = new JLabel(" New Pass :");
        l3.setBounds(41, 108, 200, 40);
        l3.setBackground(Color.black);
        l3.setFont(font2);
        panel2.add(l3);

        field2 = new JPasswordField();
        field2.setBounds(185, 114, 300, 25);
        field2.setFont(font2);
        panel2.add(field2);

        l4 = new JLabel(" Confirm Pass :");
        l4.setBounds(7, 171, 200, 40);
        l4.setBackground(Color.black);
        l4.setFont(font2);
        panel2.add(l4);

        field2 = new JPasswordField();
        field2.setBounds(185, 175, 300, 25);
        field2.setFont(font2);
        panel2.add(field2);

        bt2 = new JButton("Save");
        bt2.setBounds(365, 250, 120, 40);
        bt2.setFont(font2);
        bt2.setBackground(Color.lightGray);
        panel2.add(bt2);

        bt3 = new JButton("Back");
        bt3.setBounds(65, 250, 120, 40);
        bt3.setFont(font2);
        bt3.setBackground(Color.lightGray);
        panel2.add(bt3);


        bt2.addActionListener(new ActionListener() {   // b2 for customer registration
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                //new Admin();
            }
        });

        bt3.addActionListener(new ActionListener() {   // b2 for customer registration
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                new Admin();
            }
        });
        setVisible(true);

    }

}
