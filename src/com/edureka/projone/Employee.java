package com.edureka.projone;

public class Employee {
    private int idemp;
    private  String ename;
    private  double salary;

    public Employee() {
    }

    public Employee(int idemp, String ename, double salary) {
        this.idemp = idemp;
        this.ename = ename;
        this.salary = salary;
    }

    public int getIdemp() {
        return idemp;
    }

    public void setIdemp(int idemp) {
        this.idemp = idemp;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idemp=" + idemp +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }
}
