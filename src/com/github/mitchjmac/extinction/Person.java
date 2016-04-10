package com.github.mitchjmac.extinction;

import java.util.ArrayList;


abstract class Person {
    
    //Person Fields
    private static int numberPeople = 0;
    private int age;
    private Person spouse;
    private int numDrinks = 0;
    private boolean drunk = false;
    private int numChildren = 0;
    private Person[] parents = new Person[2];
    private ArrayList<Person> children = new ArrayList<Person>();
    
    
    //Person Constructor
    Person() {
        numberPeople++;
        age = 0;
    }
    
    Person(Person p1, Person p2) {
        numberPeople++;
        age = 0;
        parents[0] = p1;
        parents[1] = p2;
    }
    
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
    
    void increaseNumChildren() {
        numChildren++;
    }
    void decreaseNumChildren() {
        numChildren--;
    }
    
    //Person Abstract Methods
    abstract void drink();
    
    abstract void scoodilypoop();
    
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
