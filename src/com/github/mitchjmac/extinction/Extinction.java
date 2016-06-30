package com.github.mitchjmac.extinction;

import java.util.LinkedList;
import com.github.mitchjmac.extinction.people.*;

public class Extinction {

    public static void main(String[] args) {
        
//        //Generate People
//        LinkedList<Person> people = new LinkedList<Person>();
//        LinkedList<Location> locations = new LinkedList<Location>();
//        LinkedList<Vehicles> vehicles = new LinkedList<Vehicles>();
//        LinkedList<Disaster> disasters = new LinkedList<Disaster>();
//        LinkedList<FoodSource> food = new LinkedList<FoodSource>();
//        
//        while (Person.getNumPeople() != 0) {
//            
//        }
        Person bob = new Male();
//        System.out.println("" + bob.getAge());
        System.out.println("" + bob.getClass());
        ((Male) bob).printTaco();
        
    }
//
//    public kill(Person toKill) {
//        
//    }
//    
//    public destroy(Building toDestory) {
//        
//    }
}
