package com.Zeib.empapp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoIntr i=new EmployeeDao();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Employee management application");


        do{

            System.out.println("1. Add Employee\n2. Show All Employee\n3.Show Employee based on id\n4.Update the employee\n5.Delete the employee\n6.Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    Employee emp=new Employee();
                    System.out.println("\nEnter Id");
                    int id=sc.nextInt();
                    System.out.println("Enter Name");
                    String name=sc.next();
                    System.out.println("Enter salary");
                    double salary=sc.nextDouble();
                    System.out.println("Enter age");
                    int age=sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    i.createEmployee(emp);
                break;
                case 2:
                    i.showAllEmployee();
                    break;
                case 3:
                    System.out.println("\nEnter id to show details");
                    int empid=sc.nextInt();
                    i.showAllEmployeeBasedOnId(empid);
                    break;
                case 4:
                    System.out.println("\nEnter the id of employee you want to update");
                    int id1=sc.nextInt();
                    System.out.println("Enter the name which you want to update");
                    String name1=sc.next();
                    i.updateEmployee(id1,name1);
                    break;
                case 5:
                    System.out.println("\nEnter the id of employee you want to delete");
                    int id2=sc.nextInt();
                    i.deleteEmployee(id2);
                    break;
                case 6:
                    System.out.println("\nThankyou for using our application");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }while(true);
    }
}
