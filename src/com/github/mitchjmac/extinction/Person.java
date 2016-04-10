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
    private ArrayList<Person> parents = new ArrayList<Person>();
    private ArrayList<Person> children = new ArrayList<Person>();
    
    
    //Person Constructor
    Person() {
        numberPeople++;
        age = 0;
    }
    
    Person(Fetus f) {
        numberPeople++;
        age = 0;
        for(int i = 0; i < 2; i++) {
            parents.add(f.getParent(i));
        }
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
    
    void increaseNumChildren() {
        numChildren++;
    }
    void decreaseNumChildren() {
        numChildren--;
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
    
    void addParent(Person p) {
        parents.add(p);
    }
    void removeParent(Person p) {
        parents.remove(p);
    }
    
    void addChild(Person c) {
        children.add(p);
    }
    void removeChild(Person c) {
        children.remove(p);
    }
    
}
