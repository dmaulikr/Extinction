package com.github.mitchjmac.extinction.people;

public class Female extends Person {
    
    //Female Fields
    private boolean pregnantStatus = false;
    private int birthCountdown;
    private Fetus baby;
    
    
    //Female Constructors
    public Female() {
        super();
    }
    protected Female(Fetus f) {
        super(f);
    }
    
    
    //Female Methods
    void scoodilypoop(Person partner) {
        if (partner instanceof Male) {
            if (((drunk && partner.isDrunk()) || (partner == spouse && (Person.random.nextInt(19 + (38 * numChildren)) == 1))) && (Person.random.nextInt(6) == 0)) {//6/32 married&child-bearing years try to have baby and chance of conception 16-17%
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
        pregnantStatus = false;
        birthCountdown = 0;
        baby = null;
        if (Person.random.nextInt(2) == 0) {
            Male child = new Male(baby);
            child.parents.get(0).addChild(child);
            child.parents.get(1).addChild(child);
            return child; //use this return to add child to list of people
        } else {
            Female child = new Female(baby);
            child.parents.get(0).addChild(child);
            child.parents.get(1).addChild(child);
            return child; //use this return to add child to list of people
        }
    }
    void miscarriage() {
        pregnantStatus = false;
        birthCountdown = 0;
        baby = null;
    }
    
}
