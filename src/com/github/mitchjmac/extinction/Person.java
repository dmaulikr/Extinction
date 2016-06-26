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
    private int weight;
    private Occupation job;
    private Person spouse;
    private ArrayList<Person> parents = new ArrayList<Person>();
    private ArrayList<Person> children = new ArrayList<Person>();
    private int numChildren = 0;
    private Vehicle vehicle;
    private boolean drunk = false;
    private int numDrinks = 0;
    
    
    //Person Constructors
    Person() {
        numberPeople++;
        name = numberPeople;
        age = random.nextInt(20) + 20;
        System.out.println("A person named " + name + " was placed on the planet by the alien overlords.");
    }
    Person(Fetus f) {
        numberPeople++;
        name = numberPeople;
        age = 0;
        for(int i = 0; i < 2; i++) {
            parents.add(f.getParent(i));
        }
        System.out.println("A person named " + name + " was born.");
    }
    
    
    //Person Static Methods
    public static Random getRandom() {
        return random;
    }
    public static int getNumPeople() {
        return numberPeople;
    }
    protected static void incrementPeople() {
        numberPeople++;
    }
    
    
    //Person Abstract Methods
    abstract void scoodilypoop(Person partner);
    
    
    //Person Instance Methods
    public void die() {
        
    }
    
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
    
    void drink() {
        numDrinks++;
        if (weight / numDrinks <= 4 ) { //http://dui.drivinglaws.org/drink-table.php
            drunk = true;
        }
    }
    boolean isDrunk() {
        return drunk;
    }
    
    Person getSpouse() {
        return spouse;
    }
    void getMarried(Person fiance) {
        spouse = fiance;
        if (spouse.getSpouse() != this) {
            spouse.getMarried(this);
        }
    }
    void getDivorced() {
        Person temp = spouse;
        spouse = null;
        if (temp.getSpouse() != null) {
            temp.getDivorced();
        }
    }
    
}
