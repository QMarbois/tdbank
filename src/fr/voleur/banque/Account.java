package fr.voleur.banque;

public class Account {
    private int number;
    private float balance;

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
