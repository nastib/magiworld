
package com.nastib.magiworld.attack;

import com.nastib.magiworld.bean.Person;

/**
 * Classe qui implémente l'interface Attack et redefinie 
 * les attaques des Guerriers
 * @author ADMIN
 */
public class WarriorAttack implements Attack {
    private String description ;
    
    public WarriorAttack() {
    }

    @Override
    public String basicAttack(Person player1, Person player2) {
        description = "Attaque au coup d’épée (D = Vie - Force)";
        description = player1.getFullname()+" (Life : "+player1.getLife()+") Attaque coup d’épée. Dommage : "+player1.getPower();
        player2.setLife((player2.getLife() - player1.getPower()));
        return description;
    }

    @Override
    public String specialAttack(Person player1, Person player2) {
        description = "Attaque au coup de rage (D = Vie - (Force*2))";
        description = player1.getFullname()+" (Life : "+player1.getLife()+") Attaque coup de rage. Dommage : "+(player1.getPower()*2);
        description += "\n"+player1.getFullname()+" (Life : "+player1.getLife()+") Attaque coup de rage. Perd : "+(player1.getPower()/2);
        player2.setLife((player2.getLife()-(player1.getPower()*2)));
        player1.setLife((player1.getLife()-(player1.getPower()/2)));
        return description;
    }
}
