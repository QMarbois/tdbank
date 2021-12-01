package fr.voleur.banque;

import java.util.ArrayList;

public class Client {

    private String lastname;
    public ArrayList<Account> accounts = new ArrayList<Account>(100);
    public int nbAccount = accounts.size();

    public Client(String lastname){
        this.lastname=lastname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public float getBalance(){
        float sum=0;
        for (int i = 0; i < this.accounts.size(); i++) {
            sum += this.accounts.get(i);
        }
        return sum;
    }

    public void displayBalance(int index){
        this.accounts.get(index).displayBalance();
    }

    public void addAccount(){
        this.accounts.add(new Account());
    }
}
