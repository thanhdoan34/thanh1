package com.example.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateBean {
    public static boolean insertProduct(String id, String name, String pro_desc){

        boolean kp =true;
        try {
            //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");
            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/t1808a1_sem4?serverTimezone=UTC", "root","");
            PreparedStatement ps = con.prepareStatement("insert into product (name ,pro_desc) values(?,?)");
            ps.setString(1,name);
            ps.setString(2,pro_desc);
            ps.executeUpdate();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return kp;

    }
}
