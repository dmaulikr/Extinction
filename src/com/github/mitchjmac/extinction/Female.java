package com.github.mitchjmac.extinction;
import java.util.Random;

class Female extends Person {
    
    //Female Fields
    private boolean pregnantStatus = false;
    private int birthCountdown;
    private Random random = new Random();
    private Person baby;
    
    
    
    //Female Constructor
    Female() {
        super ();
    }
    
    Female(Person p1, Person p2) {
        super(p1, p2);
    }
    
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
    
    void scoodilypoop(Person partner) {
        if (partner instanceof Male) {
            if (((drunk && partner.isDrunk()) || (partner == spouse && (random.nextInt(19 + (38 * numChildren)) == 1))) && (random.nextInt(6) == 0)) {//6/32 married&child-bearing years try to have baby and chance of conception 16-17%
                pregnantStatus = true;
                birthCountdown = 270;
                if ((random.nextInt(2) == 0)) {
                    baby = new Male(partner, this);
                } else {
                    baby = new Female(partner, this);
                }
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
    
    Person giveBirth() {
        pregnantStatus = false;
        birthCountdown = 0;
        numChildren++;
        spouse.increaseNumChildren();
        Person toReturn = baby;
        baby = null;
        return toReturn; //use this return to add child to list of people
        // add child to mom and dad's children arraylist
    }
    
    void miscarriage() {
        pregnantStatus = false;
        birthCountdown = 0;
        //decrese number people
    }
    
}
