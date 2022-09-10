package project;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Driver extends JFrame {

    JPanel panel1, panel2;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,l11;
    JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9;
    JButton bt1, bt2;
    JComboBox comb;
    private String[] area = {"Sylhet Sadar","Zakiganj","Dakhsinsurma","Osmaninagar","Balaganj","Beanibazar","Bishwanath","Companiganj","Fenchuganj","Golapganj",
            "Gowainghat","Jaintiapur","Kanaighat"};

    private String[] types = {"2","3","4"};

    Driver() {


        //Font
        Font font = new Font("Showcard Gothic", Font.BOLD, 25);
        Font font2 = new Font("Mono", Font.BOLD, 17);
        Font font3 = new Font("Segoe Script", Font.BOLD, 17);

        setSize(565, 365);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(3);
        setResizable(false);



        panel1 = new JPanel();
        panel1.setBounds(4, 0, 552, 50);
        panel1.setBackground(Color.DARK_GRAY);
        add(panel1);
        panel1.setLayout(null);

        l1 = new JLabel("Feature of Driver");
        l1.setBounds(139, 6, 300, 40);
        l1.setForeground(Color.ORANGE);
        l1.setFont(font);
        panel1.add(l1);

        panel2 = new JPanel();
        panel2.setBounds(4, 54, 550, 278);
        panel2.setBackground(Color.cyan);
        panel2.setLayout(null);
        add(panel2);

        l2 = new JLabel("Search Location:");
        l2.setBounds(53, 30, 200, 25);
        l2.setFont(font2);
        panel2.add(l2);


        comb = new JComboBox(area);
        comb.setBounds(200,30,270,25);
        comb.setEditable(true);
        comb.setBackground(Color.black);
        comb.setForeground(Color.green);
        comb.setFont(font3);
        panel2.add(comb);

        l3 = new JLabel("Show Catagory:");
        l3.setBounds(65, 73, 180, 25);
        l3.setFont(font2);
        panel2.add(l3);

        comb = new JComboBox(types);
        comb.setBounds(200,73,270,25);
        comb.setEditable(true);
        comb.setBackground(Color.black);
        comb.setForeground(Color.green);
        comb.setFont(font3);
        panel2.add(comb);

        l4 = new JLabel("Password Change:");
        l4.setBounds(40, 117, 200, 25);
        l4.setFont(font2);
        panel2.add(l4);

        field3 = new JTextField();
        field3.setBounds(200, 117, 270, 25);
        panel2.add(field3);

//        l5 = new JLabel("Logout :");
//        l5.setBounds(120, 161, 150, 25);
//        l5.setFont(font2);
//        panel2.add(l5);
//
//        field4 = new JTextField();
//        field4.setBounds(200, 161, 270, 25);
//        panel2.add(field4);

        bt1 = new JButton("Search");
        bt1.setBounds(400, 225, 100, 30);
        bt1.setFont(font2);
        bt1.setBackground(Color.white);
        bt1.setFocusable(false);
        //  bt2.setBorder(new LineBorder(Color.BLUE));
        panel2.add(bt1);


        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();


                new ContactMechanic();
            }
        });

        bt2 = new JButton("Back");
        bt2.setBounds(50, 225, 100, 30);
        bt2.setFont(font2);
        bt2.setBackground(Color.white);
        bt2.setFocusable(false);
        //  bt2.setBorder(new LineBorder(Color.BLUE));
        panel2.add(bt2);


        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                new Login();
            }
        });

        setVisible(true);
    }}

//    public static void main(String[] args) {
//        new Driver();
//    }
//
//}