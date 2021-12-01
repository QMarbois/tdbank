package fr.voleur.banque;

import java.util.Scanner;

public class Bank {

    public void addClient(String clientLastname){
        new Client(clientLastname);
    }

    public void interactStart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle opération voulez-vous effectuer?");
        int resp = scanner.nextInt();
        if (resp == 1){
            System.out.println("ajouter client");
        }else if (resp == 2){
            System.out.println("Effectuer une operation sur un client");
        }else if (resp == 3){
            System.out.println("Afficher un bilan général");
        }
    }

    public void interactAddClient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom du client ");
        String resp = scanner.next();
        System.out.println("Le client " + resp + " a été crée.");
        interactStart();
    }

    public void interactClientOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel client ?");
        int resp = scanner.nextInt();
    }

}

