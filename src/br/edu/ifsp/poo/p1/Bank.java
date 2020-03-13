package br.edu.ifsp.poo.p1;

public class Bank {
    private int number;
    private Account[] accounts = new Account[10];
    private int numAccounts = 0;

    public Bank(int number) {
        this.number = number;
    }

    public double approveLimit(double amount, int accountTime){
        if(amount >= 0 && accountTime >= 0){
            int maxLimit = 200 + 300 * accountTime;
            return Math.min(maxLimit, amount);
        }
        return 0;
    }

    public void listAccounts(){
        for (int i = 0; i < numAccounts; i++)
            System.out.println("Agency: "  + accounts[i].getAgency() + " number: " + accounts[i].getNumber());
    }

    public void listAccounts(long agency){
        for (int i = 0; i < numAccounts; i++)
            if(accounts[i].getAgency() == agency)
                System.out.println("Agency: "  + accounts[i].getAgency() + " number: " + accounts[i].getNumber());
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
                numAccounts--;
                break;
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
