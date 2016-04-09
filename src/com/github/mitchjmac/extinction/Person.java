package com.github.mitchjmac.extinction;

abstract class Person {
    
    //Person Fields
    private static int numberPeople = 0;
    private int age;
    private Person spouse;
    private int numDrinks = 0;
    private boolean drunk = false;
    private int numChildren = 0;
    
    //Person Constructor
    Person(int inputAge) {
        numberPeople++;
        age = inputAge;
    }
    
    //Person Static Methods
    static int getNumPeople() {
        return numberPeople;
    }
    static void decreaseNumPeople() {
        numberPeople--;
    }
    
    //Person Abstract Methods
    abstract void drink();
    
    abstract void haveSex();
    
    //Person Instance Methods
    int getAge() {
        return age;
    }
    int increaseAge() {
        age++;
    }
    
    boolean isDrunk() {
        return drunk;
    }
    
    void getMarried(Person fiance) {
        spouse = fiance;
        if (spouse.getSpouse() != this) {
            spouse.getMarried(this);
        }
    }
    
}
