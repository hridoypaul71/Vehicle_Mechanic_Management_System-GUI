package project;

import javax.swing.*;
import java.sql.*;
import java.sql.Connection;

public class ConnectionProvider{

    private Connection con;
    private Statement st;

    public ConnectionProvider(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/project";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            con = DriverManager.getConnection(url, uname, pass);

            st = con.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void Login(String queryLogin, String Login_uname, String Login_pass){        // admin after log in

    }
    public void Login_mac(String queryLogin, String Login_uname, String Login_pass){

    }
    public void Login_cus(String queryLogin, String Login_uname, String Login_pass){
        new Driver();
    }
}
