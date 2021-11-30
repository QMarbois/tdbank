package fr.voleur.banque;

public class Client {

    private Account account = new Account();
    private String lastname;
    public Account [] accounts = new Account[100];

    public Client(String lastname){
        this.lastname=lastname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public float getBalance(Account account){
        return this.account.getBalance();
    }

    public void displayBalance(Account account){
        this.account.displayBalance();
    }
}
