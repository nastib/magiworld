/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nastib.magiworld;

import com.nastib.magiworld.attack.MagusAttack;
import com.nastib.magiworld.attack.ProwlerAttack;
import com.nastib.magiworld.attack.WarriorAttack;
import com.nastib.magiworld.bean.Magus;
import com.nastib.magiworld.bean.Person;
import com.nastib.magiworld.bean.Prowler;
import com.nastib.magiworld.bean.Warrior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class PlayersSetUp {
    
    private  final Scanner sc = new Scanner(System.in);
    private  Person player1, player2;
    private final  List<Person> players = new ArrayList<>();
    private  int joueur ;
    private  boolean responseIsGood;
    
    /**
     * 
     * @return 
     */
    public List<Person> setUp() {
               
        //Boucle de choix des personnages
        for( joueur = 1; joueur <= 2; joueur++) { 
            System.out.println("Joueur N° "+joueur);
            System.out.println("Veuillez choisir votre Personnage : 1 - Guerrier : 2 - Rôdeur : 3 - Mage");
            int person ;
            boolean responseIsGood;
            do {
                try {
                    person = sc.nextInt();
                    if(person < 1 || person > 3) {
                       responseIsGood = false;
                       System.out.println("Vous devez saisir un nombre entre 1, 2 et 3 !");
                    } else {       
                        responseIsGood = true;
                        displaySelectedPerson(person);
                        setUpPlayerAttributs(joueur,person);
                    }
                } catch (InputMismatchException e) {
                    sc.next();
                    System.out.println("Vous devez saisir un nombre !");
                    responseIsGood = false;
                }
            } while (!responseIsGood);            
        }  
        return players;
    }    
           
    /**
     * 
     * @param choix 
     */
    private void displaySelectedPerson(int person) {
        switch (person) {
            case 1:
                System.out.println("Vous avez choisi un Guerrier !\n");
                break;
            case 2:
                System.out.println("Vous avez choisi un Rôdeur !\n");
                break;
            case 3:
                System.out.println("Vous avez choisi un Mage !\n");
                break;
            default:
                System.out.println("Vous n'avez pas choisi un bon numéro ! \n");
                break;
        }
    }
    
    /**
     * 
     * @param joueur
     * @param person 
     */
    private void setUpPlayerAttributs(int joueur,int person){
        List<String> listAttribute = Arrays.asList( "Level", "Power", "Agility","Brains");
        List<Integer> listAttributeInt = new ArrayList<>();    
        
        listAttribute .stream().forEach((attr) -> { 
            System.out.println("Tapez le nombre de : " +attr  ); 
             responseIsGood = false;
             int att;
            do{
                try {
                    
                    att = sc.nextInt();
                    if(att < 0 || att > 100) {
                        responseIsGood = false;
                        System.out.println("Vous devez saisir un nombre compris entre 0 et 100!");
                    } else {    
                         listAttributeInt.add(att);
                         responseIsGood = true;
                    }
                    
                } catch (InputMismatchException e) {
                    sc.next();
                    System.out.println("Vous devez saisir un nombre !");
                    responseIsGood = false;
                }
            } while (!responseIsGood);
        });

         
        switch(joueur ){
            case 1: // Premier joureur            
            switch (person) {
                case 1:
                    player1 = new Warrior(listAttributeInt.get(0),
                                         listAttributeInt.get(1),
                                         listAttributeInt.get(2),
                                         listAttributeInt.get(3),
                                         "Guerrier");
                    player1.setAttack(new WarriorAttack());
                    System.out.println(player1.toString());
                    players.add(player1);
                    break;
                case 2:
                    player1 = new Prowler(listAttributeInt.get(0),
                                        listAttributeInt.get(1),
                                        listAttributeInt.get(2),
                                        listAttributeInt.get(3),
                                        "Rôdeur");
                    player1.setAttack(new ProwlerAttack());
                    System.out.println(player1.toString());
                    players.add(player1);
                    break;
                case 3:
                    player1 = new Magus(listAttributeInt.get(0),
                                        listAttributeInt.get(1),
                                        listAttributeInt.get(2),
                                        listAttributeInt.get(3),
                                        "Mage");
                    player1.setAttack(new MagusAttack());
                    System.out.println(player1.toString());
                    players.add(player1);
                    break;                    
            }
            break;
         
        case 2: //Deuxième joueur
            switch (person) {
                case 1:
                    player2 = new Warrior(listAttributeInt.get(0),
                                         listAttributeInt.get(1),
                                         listAttributeInt.get(2),
                                         listAttributeInt.get(3),
                                         "Guerrier");
                    player2.setAttack(new WarriorAttack());
                    System.out.println(player2.toString());
                     players.add(player2);
                    break;
                case 2:
                    player2 = new Prowler(listAttributeInt.get(0),
                                        listAttributeInt.get(1),
                                        listAttributeInt.get(2),
                                        listAttributeInt.get(3),
                                        "Rôdeur");
                    player2.setAttack(new ProwlerAttack());
                    System.out.println(player2.toString());
                    players.add(player2);
                    break;
                case 3:
                    player2 = new Magus(listAttributeInt.get(0),
                                        listAttributeInt.get(1),
                                        listAttributeInt.get(2),
                                        listAttributeInt.get(3),
                                        "Mage");
                    player2.setAttack(new MagusAttack());
                    System.out.println(player2.toString());
                    players.add(player2);
                    break;                    
            }
             break;
        } 
        
        System.out.println("\n");
    }
    
    
}

