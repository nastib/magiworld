
package com.nastib.magiworld;

import com.nastib.magiworld.bean.Person;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Assure le déroulement de la partie en distribuant 
 * les tours à chaque joueur. Il affiche le dommage causé 
 * après chaque coup ceci jusqu'a la fin de la partie.
 * @author ADMIN
 */
public class PlayGame {
    private final Scanner sca = new Scanner(System.in);
    private List<Person> players = new ArrayList<>();;
    private boolean responseIsGood;
    private int resp, cpt;

    /**
     * Constructor
     * @param players 
     */
    public PlayGame(List<Person> players) {
        this.players = players;
    }
    
    /**
     * Methode qui joue la partie
     * @return 
     * Retourne le message de fin de la partie qui annonce le gagnant
     */
    public String play(){
        
        //Start party
        System.out.println("C'est parti. Bonne chance !\n   *****************");

        int token = 1;
        cpt = 0;
        if(players.get(0) != null && players.get(1) != null) {   
            //Boucle générale
            while (players.get(0).getLife() > 0 && players.get(1).getLife() > 0 ){
                cpt++;
                if (token == 1){
                    responseIsGood = false;

                    System.out.println("Attack N°" +cpt +": - "+players.get(0).getFullname()+"(Life : "+ players.get(0).getLife()+").Veuillez choisir votre attaque : 1 -  Basic Attack : 2 - Special Attack !");
                    do {
                        try {
  
                            resp = sca.nextInt();
                            responseIsGood = true;
                            if(resp < 1 || resp > 2) {
                               responseIsGood = false;
                               System.out.println("Désolé. Vous devez saisir un nombre entre 1 ou 2 !");
                            }
                        } catch (InputMismatchException e) {
                                sca.next();
                                System.out.println("Désolé. Vous devez saisir un nombre entre 1 ou 2 !");
                                responseIsGood = false;
                        }
                    } while (!responseIsGood);  
                    if (resp == 1){
                          System.out.println(players.get(0).basicAttack(players.get(1)));
                    } else {
                          System.out.println(players.get(0).specialAttack(players.get(1)));
                    }
                    token = 2;

                } else {
                    
                    responseIsGood = false;

                    System.out.println("Attack N°" +cpt +": - "+players.get(1).getFullname()+"(Life : "+ players.get(1).getLife()+").Veuillez choisir votre attaque : 1 -  Basic Attack : 2 - Special Attack !");
                    do {
                        try {
                            resp = sca.nextInt();
                            responseIsGood = true;
                            if(resp < 1 || resp > 2) {
                               responseIsGood = false;
                               System.out.println("Désolé. Vous devez saisir un nombre entre 1 ou 2 !");
                            }
                        } catch (InputMismatchException e) {
                                sca.next();
                                System.out.println("Désolé. Vous devez saisir un nombre entre 1 ou 2 !");
                                responseIsGood = false;
                        }
                    } while (!responseIsGood);  
                    if (resp == 1){
                          System.out.println(players.get(1).basicAttack(players.get(0)));
                    } else {
                          System.out.println(players.get(1).specialAttack(players.get(0)));
                    }
                    token = 1;               
                }

            } 
                    
        }      
        //The TheEnd
        return new TheEnd().end(players);  
    }
    
}