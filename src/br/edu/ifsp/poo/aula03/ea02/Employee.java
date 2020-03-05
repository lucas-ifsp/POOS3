package br.edu.ifsp.poo.aula03.ea02;

public class Employee {
    private String name;
    private long id;
    private double salary;
    private String jobTitle;
    private Department dept;
    private Department deptInCharge;

    public Employee() {
    }

    public Employee(String name, long id, double salary, String jobTitle) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary(){
        return  getSalary() * 12;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Department getDeptInCharge() {
        return deptInCharge;
    }

    public void setDeptInCharge(Department deptInCharge) {
        this.deptInCharge = deptInCharge;
    }

    public void printState() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", dept=" + (dept !=null ? dept.getName() : "null") +
                ", deptInCharge=" + (deptInCharge !=null ? deptInCharge.getName() : "null") +
                '}');
    }
}
