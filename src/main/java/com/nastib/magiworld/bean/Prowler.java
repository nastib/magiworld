package com.nastib.magiworld.bean;


public class Prowler extends Person {

    public Prowler(){}
    public Prowler(int level, int power, int agility, int brains, String fullname) {
        super(level, power, agility, brains, fullname);
        this.fullname = "Rôder";
    }
    
    //Methodes 
    @Override
    public String basicAttack(Person person) {
        String result = attack.basicAttack(this,person);
        return result;
    }

    @Override
    public String specialAttack(Person person) {
       String result =  attack.specialAttack(this, person);
       return result;
    }      
}
