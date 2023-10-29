package com.Zeib.empapp;
import java.sql.DriverManager;
import java.util.*;
import java.sql.Connection;

public class DbConnection {
    static Connection con;
    public static Connection createDBConnection() {
        try {
            String url="jdbc:mysql://localhost:3306/";
            String username="Your_Mysql_Username";
            String db="Your_Database_Name";
            String password="Your_Mysql_Passowrd";
            con = DriverManager.getConnection(url+db,username,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
