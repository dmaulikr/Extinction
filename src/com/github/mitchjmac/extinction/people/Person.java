package com.github.mitchjmac.extinction.people;

import java.util.ArrayList;
import java.util.Random;
import com.github.mitchjmac.extinction.occupations.*;
import com.github.mitchjmac.extinction.vehicles.*;


public abstract class Person {
    
    //Person Static Fields
    private static int numberPeople = 0;
    protected static Random random = new Random();
    
    
    //Person Instance Fields
    protected int name;
    protected int age;
    protected int weight;
    protected Occupation job;
    protected Person spouse;
    protected ArrayList<Person> parents = new ArrayList<Person>();
    protected ArrayList<Person> children = new ArrayList<Person>();
    protected int numChildren = 0;
    protected Vehicle vehicle;
    protected boolean drunk = false;
    protected int numDrinks = 0;
    
    
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
    public static int getNumPeople() {
        return numberPeople;
    }
    
    
    //Person Abstract Methods
    abstract void scoodilypoop(Person partner);
    
    
    //Person Instance Methods
    public void die() {
        
    }
    
    public int getAge() {
        return age;
    }
    int increaseAge() {
        return age++;
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
