package com.Zeib.empapp;

public interface EmployeeDaoIntr {
    public void createEmployee(Employee emp);
    public void showAllEmployee();
    public void showAllEmployeeBasedOnId(int id);
    public void updateEmployee(int id,String name);
    public void deleteEmployee(int id);
}
