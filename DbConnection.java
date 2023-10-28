package com.Zeib.empapp;
import java.sql.DriverManager;
import java.util.*;
import java.sql.Connection;

public class DbConnection {
    static Connection con;
    public static Connection createDBConnection() {
        try {
            String url="jdbc:mysql://localhost:3306/";
            String username="root";
            String db="bb1";
            String password="ZeibshaikhA@16";
            con = DriverManager.getConnection(url+db,username,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}