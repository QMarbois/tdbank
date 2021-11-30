package fr.voleur.banque;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

    }

    public void addClient(String clientLastname){
        Client quentin = new Client("Quentin");
    }

    public void interact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle opération voulez-vous effectuer?");

        int resp = scanner.nextInt();

    }

}

