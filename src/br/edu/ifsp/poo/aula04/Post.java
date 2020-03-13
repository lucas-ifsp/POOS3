package br.edu.ifsp.poo.aula04;

import java.time.LocalDate;

public class Post {
    private LocalDate date;
    private String quote;
    private int clap, boo;
    private UserAccount account;

    public Post(String quote, UserAccount account) {
        this.quote = quote;
        this.account = account;
        this.date = LocalDate.now();
    }

    public String show(){
        String post = "["
                + date
                +"] "
                + account.getUserName()
                +  " says "
                + quote;
        return post;
    }

    public void clap(){
        clap++;
    }

    public void boo(){
        boo++;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public int getClap() {
        return clap;
    }

    public int getBoo() {
        return boo;
    }

    public UserAccount getAccount() {
        return account;
    }
}
