package com.Zeib.empapp;

import com.mysql.cj.xdevapi.Result;

import java.sql.*;

public class EmployeeDao implements EmployeeDaoIntr{
    Connection con;
    @Override
    public void createEmployee(Employee emp) {
        con=DbConnection.createDBConnection();
        String query="insert into Emloyee(id,name,salary,age) values(?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1,emp.getId());
            pstm.setString(2,emp.getName());
            pstm.setDouble(3,emp.getSalary());
            pstm.setInt(4,emp.getAge());
            int cnt=pstm.executeUpdate();
            if(cnt!=0){
                System.out.println("Employee inserted successfully");
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void showAllEmployee() {
        Connection con;
        try{
            con=DbConnection.createDBConnection();
            Statement st=con.createStatement();
            String query="select * from emloyee";
            ResultSet res=st.executeQuery(query);
            while(res.next()){
                System.out.println("Id is "+res.getInt(1));
                System.out.println("name is "+res.getString(2));
                System.out.println("Salary is "+res.getDouble(3));
                System.out.println("age is "+res.getInt(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void showAllEmployeeBasedOnId(int id) {
        Connection con;
        try{
            con=DbConnection.createDBConnection();
            Statement st=con.createStatement();
            String query="select * from emloyee where id="+id;
            ResultSet res=st.executeQuery(query);
            while(res.next()) {
                System.out.println("id is " + res.getInt(1));
                System.out.println("name is " + res.getString(2));
                System.out.println("Salary is " + res.getDouble(3));
                System.out.println("age is " + res.getInt(4));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String name) {
        Connection con;
        try{
            con=DbConnection.createDBConnection();
            String query="update emloyee set name= ? where id="+id;
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setString(1,name);
            pstm.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void deleteEmployee(int id) {
        Connection con;
        try{
            con=DbConnection.createDBConnection();
            Statement st=con.createStatement();
            String query="delete from emloyee where id="+id;
            boolean bl=st.execute(query);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
