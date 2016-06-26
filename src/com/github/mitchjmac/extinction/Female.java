package com.github.mitchjmac.extinction;

class Female extends Person {
    
    //Female Fields
    private boolean pregnantStatus = false;
    private int birthCountdown;
    private Fetus baby;
    
    
    //Female Constructors
    Female() {
        super();
    }
    Female(Fetus f) {
        super(f);
    }
    
    
    //Female Methods
    void scoodilypoop(Person partner) {
        if (partner instanceof Male) {
            if (((drunk && partner.isDrunk()) || (partner == spouse && (Person.getRandom().nextInt(19 + (38 * numChildren)) == 1))) && (Person.getRandom().nextInt(6) == 0)) {//6/32 married&child-bearing years try to have baby and chance of conception 16-17%
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
        if (getRandom().nextInt(2) == 0) {
            Male child = new Male(baby);
        } else {
            Female child = new Female(baby);
        }
        pregnantStatus = false;
        birthCountdown = 0;
        baby = null;
        child.parents.get(0).addChild(child);
        child.parents.get(1).addChild(child);
        return child; //use this return to add child to list of people
    }
    void miscarriage() {
        pregnantStatus = false;
        birthCountdown = 0;
        baby = null;
    }
    
}
