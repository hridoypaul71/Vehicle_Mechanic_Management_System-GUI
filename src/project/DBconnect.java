package project;

import javax.swing.*;
import java.sql.*;

import static java.lang.Class.forName;

public class DBconnect {
    private java.sql.Connection con;
    private Statement st;

    public DBconnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://3306/project", "root", "");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        public void RegisterInsert (String queryinsert){  //db.RegisterInsert(queryInsert);
            try {
                st.executeUpdate(queryinsert);
                JOptionPane.showMessageDialog(null, "Registration Complete!!");
                System.out.println(456);
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Registration not Complete!!");
                System.out.println(e);
                System.out.println(675);
            }
        }

}
