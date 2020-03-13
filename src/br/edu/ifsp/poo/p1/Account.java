package br.edu.ifsp.poo.p1;

public class Account {
    private long number;
    private long agency;
    private double balance;
    private double availableCredit;
    private int password;
    private int accountTime;
    private Client client;
    private Bank bank;

    public Account(long number, long agency, int password, Client client, Bank bank) {
        this(client, bank);
        this.number = number;
        this.agency = agency;
        this.password = password;
    }

    public Account(Client client, Bank bank) {
        this.client = client;
        this.bank = bank;
        this.bank.addAccount(this);
        this.client.addAccount(this);
    }

    public boolean withdraw(double amount, int password){
        if(isAuthenticated(password)){
            if(amount >= 0 && amount <= balance + availableCredit){
                balance -= amount;
                return true;
            }
        }
        return false;
    }

    public boolean deposit(double amount, int password){
        if(isAuthenticated(password)){
            if(amount >= 0){
                balance += amount;
                return true;
            }
        }
        return false;
    }

    public double increaseLimit(double amount, int password){
        if(isAuthenticated(password)){
            if(amount >= 0){
                availableCredit = bank.approveLimit(amount, accountTime);
            }
        }
        return availableCredit;
    }

    public double balance(int password){
        if(isAuthenticated(password)){
            return balance;
        }
        return 0;
    }

    private boolean isAuthenticated(int password){
        return this.password == password;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getAgency() {
        return agency;
    }

    public void setAgency(long agency) {
        this.agency = agency;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(int accountTime) {
        this.accountTime = accountTime;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }
}
