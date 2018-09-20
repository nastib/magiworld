
package com.nastib.magiworld.attack;

import com.nastib.magiworld.bean.Person;

/**
 * Classe qui implémente l'interface Attack et redefinie 
 * les attaques des Rôdeurs
 * @author ADMIN
 */
public class ProwlerAttack implements Attack {
    private String description ;
    
    public ProwlerAttack() {
    }

    @Override
    public String basicAttack(Person player1, Person player2) {
        description = player1.getFullname()+" (Life : "+player1.getLife()+") Attaque tir à l’Arc. Dommage : "+(player1.getAgility());
        player2.setLife((player2.getLife() - player1.getAgility()));
        return description;
    }

    @Override
    public String specialAttack(Person player1, Person player2) {
        description = player1.getFullname()+" (Life : "+player1.getLife()+") Concentration. Gagne en agilité : "+(player1.getLevel()/2);
        player1.setAgility((player1.getAgility() + (player1.getLevel()/2)));
        return description;       
    }
}
