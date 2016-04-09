package com.github.mitchjmac.extinction;
import java.util.Random;

class Female extends Person {
    
    //Female Fields
    private boolean pregnantStatus = false;
    private int birthCountdown;
    private Random random = new Random();
    
    
    
    //Female Constructor
    Female(int age) {
        super (age);
    }
    
    //Female Methods
    void drink() {
        numDrinks++;
        if (numDrinks >= 3) {
            drunk = true;
        }
    }
    
    void haveSex(Person partner) {
        if (partner instanceof Male) {
            if (((drunk && partner.isDrunk()) || (partner == spouse && (random.nextInt(19 + (38 * numChildren)) == 1))) && (random.nextInt(6) == 0)) {//6/32 married&child-bearing years try to have baby and chance of conception 16-17%
                pregnantStatus = true;
                birthCountdown = 270;
            }
        }
    }
    
    boolean isPregnant() {
        return pregnantStatus;
    }
    
    int decreaseBirthCount() {
        birthCountdown--;
        return birthCountdown;
    }
    
}
