package com.github.mitchjmac.extinction;

class Female extends Person {
    
    //Female Fields
    private boolean pregnantStatus = false;
    private int birthCountdown;
    private Fetus baby;
    
    
    //Female Constructors
    Female(int age) {
        super(age);
    }
    Female(Fetus f) {
        super(f);
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
        if (random.nextInt(2) == 0) {
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
    
    
    //Inner Classes
    private class Fetus {
        private Person[] parents = new Person[2];
        Fetus(Person p1, Person p2) {
            parents[0] = p1;
            parents[1] = p2;
        }
        Person getParent(int i) {
            return parents[i];
        }
    }
    
}
