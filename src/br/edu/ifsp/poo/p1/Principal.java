package br.edu.ifsp.poo.p1;

public class Principal {
    public static void main(String[] args) {
        Bank bank1 = new Bank(77);
        Bank bank2 = new Bank(230);

        Client client1 = new Client("Corona", "111.111.111-11");
        Client client2 = new Client("Zica", "222.222.222-22");
        Client client3 = new Client("Chikungunya", "333.333.333-33");

        Account account1 = new Account(1, 1, 123123, client1, bank1);
        Account account2 = new Account(2, 1, 321321, client2, bank1);
        Account account3 = new Account(3, 2, 567567, client3, bank1);
        Account account4 = new Account(5, 4, 123456, client3, bank2);

        System.out.println("Contas do bank1");
        bank1.listAccounts();

        System.out.println("\nContas do bank1 na agency 1");
        bank1.listAccounts(1);

        System.out.println("\nContas do bank1 após a remoção do account2");
        bank1.rmAccount(account2);
        bank1.listAccounts();

        System.out.println("\nContas do client3");
        client3.listAccounts();

        System.out.print("\nSaldo da account1 antes do depósito: ");
        System.out.println(account1.balance(123123));
        System.out.println("\nDepósito com senha errada");
        account1.deposit(200, 123122);
        System.out.print("Saldo da account1 após tentativa de depósito: ");
        System.out.println(account1.balance(123123));
        System.out.println("\nDepósito com senha certa");
        account1.deposit(200, 123123);
        System.out.print("Saldo da account1 depois do depósito: ");
        System.out.println(account1.balance(123123));

        System.out.print("\nCrédito disponível inicialmente: ");
        System.out.println(account1.getAvailableCredit());

        System.out.print("Crédito após tentativa de aumentar limite com três anos de conta, valor menor que o máximo: ");
        account1.setAccountTime(3);
        account1.increaseLimit(500,123123); //limite máximo 1100
        System.out.println(account1.getAvailableCredit());

        System.out.print("Crédito após tentativa de aumentar limite com três anos de conta, valor além do máximo: ");
        account1.increaseLimit(2000,123123); //limite máximo 1100
        System.out.println(account1.getAvailableCredit());


        System.out.println("\nTentativa de adicionar mais contas do que o limite permitido no usuário");
        Account account5 = new Account(5, 5, 567567, client3, bank1);
        Account account6 = new Account(6, 6, 123456, client3, bank2);
        client3.listAccounts();


        System.out.println("\nRemoção de todas as contas de Client3");
        client3.rmAccount(account4);
        client3.rmAccount(account5);
        client3.rmAccount(account3);
        client3.listAccounts();
    }

}
