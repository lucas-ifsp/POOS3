package br.edu.ifsp.poo.aula03.ea02;

public class Principal {

    public static void main(String[] args) {
        Department department = new Department("Finanças", 10, "São Carlos", 55, 300000);
        Employee newEmployee = new Employee("Raiane", 1, 3000, "Analista");
        Employee otherEmployee = new Employee("Lucas", 2, 1500, "Professor");
        Employee otherEmployee2 = new Employee("Lucas1", 3, 1500, "Professor");
        Employee otherEmployee3 = new Employee("Lucas2", 3, 1500, "Professor");

        department.addEmployee(newEmployee);
        department.addEmployee(otherEmployee);
        department.addEmployee(otherEmployee2);
        department.addEmployee(otherEmployee3);

        department.setChief(newEmployee);

        department.listAllEmployees();


    }

}
