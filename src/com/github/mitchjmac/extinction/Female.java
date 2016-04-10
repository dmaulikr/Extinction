package com.github.mitchjmac.extinction;
import java.util.Random;

class Female extends Person {
    
    //Female Fields
    private boolean pregnantStatus = false;
    private int birthCountdown;
    private Random random = new Random();
    private Fetus baby;
    
    
    //Female Constructor
    Female() {
        super();
    }
    
    Female(Fetus f) {
        super(f);
    }
    
    Female(int age) {
        super(age);
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
                baby = new Fetus(this, partner);
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
        if (random.nextInt(2) == 0) {
            Male child = new Male(baby);
        } else {
            Female child = new Female(baby);
        }
        pregnantStatus = false;
        birthCountdown = 0;
        baby = null;
        child.parents.get(0).children.add(child);
        child.parents.get(1).children.add(child);
        child.parents.get(0).increaseNumChildren();
        child.parents.get(1).increaseNumChildren();
        return child; //use this return to add child to list of people
    }
    
    void miscarriage() {
        pregnantStatus = false;
        birthCountdown = 0;
        baby = null;
    }
    
}
