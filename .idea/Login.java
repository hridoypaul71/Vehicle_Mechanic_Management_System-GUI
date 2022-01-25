package project;
import javax.swing.*;
import java.awt.*;


public class Login extends JFrame{

    JPanel panel1, panel2;
    JLabel l1, l2;
    JTextField field1, field2;
    JButton btn1,btn2;

    public Login(){

        //Font
        Font font = new Font("Arial", Font.BOLD, 25);
        Font font2 = new Font("Mono", Font.BOLD, 17);

        setSize(550, 400);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setBounds(4, 0, 545, 50);
        panel1.setBackground(Color.blue);
        panel1.add(l1);
        panel1.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(190, 6, 200, 40);
        l1.setBackground(Color.black);
        l1.setFont(font);
        panel1.add(l1);

        setVisible(true);
    }

}
