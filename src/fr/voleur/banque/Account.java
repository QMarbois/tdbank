package fr.voleur.banque;

import java.util.UUID;

public class Account {
    private UUID number;
    private float balance;

    public Account(){
        this.number=UUID.randomUUID();
        this.balance = 0;
    }

    public void deposit(float amount){
        this.balance += amount;
    }

    public void withdraw(float amount){
        this.balance -= amount;
    }

    public float getBalance(){
        return this.balance;
    }

    public void displayBalance(){
        System.out.println(this.balance);
    }

    public void transfer (float amount,Account recipient){

    }
}
