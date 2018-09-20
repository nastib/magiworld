
package com.nastib.magiworld.attack;

import com.nastib.magiworld.bean.Person;

/**
 * Classe qui implémente l'interface Attack et redefinie 
 * les attaques des Mages
 * @author ADMIN
 */
public class MagusAttack implements Attack {
    private String description ;
    
    public MagusAttack() {
    }

    @Override
    public String basicAttack(Person player1, Person player2) {
        description = player1.getFullname()+" (Life : "+player1.getLife()+") Attaque boule de feu. Dommage : "+player1.getBrains();
        player2.setLife((player2.getLife() - player1.getBrains()));
        return description;
    }

    @Override
    public String specialAttack(Person player1, Person player2) {
        
        description = player1.getFullname()+" (Life : "+player1.getLife()+") Soin.  Gagne en Life "+ (player1.getBrains()*2);
        if(player1.getLife()+(player1.getBrains()*2) <= player1.getInitialLife()){
            player1.setLife((player1.getLife()+(player1.getBrains()*2)));
        } else {
            player1.setLife(player1.getInitialLife());
        }
        return description;
    }
}
