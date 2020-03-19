package br.edu.ifsp.poo.p1;

public class Client {
    private String name;
    private String cpf;
    private Account[] accounts = new Account[3];
    private int numAccounts = 0;

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public void listAccounts(){
        for (int i = 0; i < numAccounts; i++) {
            System.out.println("Agency: "  + accounts[i].getAgency() + " number: " + accounts[i].getNumber());
        }
    }

    public void addAccount(Account account){
        if(account != null && numAccounts < accounts.length){
            accounts[numAccounts] = account;
            numAccounts++;
        }
    }

    public void rmAccount(Account account){
        for (int i = 0; i < numAccounts; i++) {
            if(accounts[i] == account) {
                for (int j = i; j < numAccounts - 1; j++)
                    accounts[j] = accounts[j+1];
                accounts[numAccounts - 1] = null;
                numAccounts--;
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
