package br.edu.ifsp.poo.aula03.ea02;

public class Department {
    private String name;
    private int code;
    private String location;
    private int phoneExtention;
    private double budget;

    private final int MAX_EMPLOYEES = 3;
    private Employee[] staff = new Employee[MAX_EMPLOYEES];
    private Employee chief;
    private int qtdEmployees;

    public Department(String name, int code, String location, int phoneExtention, double budget) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.phoneExtention = phoneExtention;
        this.budget = budget;
    }

    public void addEmployee(Employee e){
        if(qtdEmployees < MAX_EMPLOYEES){
            staff[qtdEmployees] = e;
            e.setDept(this);
            qtdEmployees++;
        }
    }

    public void removeEmployee(Employee e){
        for (int i = 0; i < qtdEmployees; i++) {
            if(staff[i] == e){
                removeFromArray(i);
                e.setDept(null);
            }
        }
    }

    public void removeEmployee(int index){
        if(index >= 0 && index < MAX_EMPLOYEES  && staff[index] != null){
            removeFromArray(index);
            staff[index].setDept(null);
        }

    }

    private void removeFromArray(int i) {
        for (int j = i; j < qtdEmployees - 1; j++) {
            staff[j] = staff[j+1];
        }
        qtdEmployees--;
        staff[qtdEmployees] = null;
    }

    /**
     * Este método retorna o objeto Employee na posição "index" válida
     * ou null caso contrário
     */
    public Employee getEmployee(int index){
        if(index >= 0 && index < MAX_EMPLOYEES )
            return staff[index];
        else
            return null;
    }

    public int getQtdEmployees(){
        return qtdEmployees;
    }

    /*public void listAllEmployees(){
        for (Employee employee : staff) {
            if(employee != null)
                employee.printState();
            else
                break;
        }
    }*/

    public void listAllEmployees(){
        for (int i = 0; i < qtdEmployees; i++) {
            staff[i].printState();
        }
    }

    public Department(String name, int code, String location, int phoneExtention, double budget, Employee chief) {
        this(name, code, location, phoneExtention, budget);
        this.chief = chief;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPhoneExtention() {
        return phoneExtention;
    }

    public void setPhoneExtention(int phoneExtention) {
        this.phoneExtention = phoneExtention;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Employee getChief() {
        return chief;
    }

    public void setChief(Employee chief) {
        this.chief = chief;
        chief.setDeptInCharge(this);
    }
}
