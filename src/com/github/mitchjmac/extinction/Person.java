package com.github.mitchjmac.extinction;

import java.util.ArrayList;
import java.util.Random;


abstract class Person {
    
    //Person Static Fields
    private static int numberPeople = 0;
    private static Random random = new Random();
    
    //Person Instance Fields
    private int name;
    private int age;
    private Occupation job;
    private Person spouse;
    private ArrayList<Person> parents = new ArrayList<Person>();
    private ArrayList<Person> children = new ArrayList<Person>();
    private int numChildren = 0;
    private int numDrinks = 0;
    private boolean drunk = false;
    
    
    //Person Constructors
    Person(Fetus f) {
        numberPeople++;
        name = numberPeople;
        age = 0;
        for(int i = 0; i < 2; i++) {
            parents.add(f.getParent(i));
        }
    }
    
    Person(int inputAge) {
        numberPeople++;
        name = numberPeople;
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
    
    void addChild(Person c) {
        children.add(c);
        numChildren++;
    }
    void removeChild(Person c) {
        children.remove(c);
        numChildren--;
    }
    int getNumChildren() {
        return numChildren;
    }
    
    void addParent(Person p) {
        parents.add(p);
    }
    void removeParent(Person p) {
        parents.remove(p);
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
