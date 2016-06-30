package com.github.mitchjmac.extinction.disaster;

import java.util.Random;

abstract class Disaster {

    //Disaster Static Fields
    protected static Random random = new Random();

    
    //Disasteer Static Methods
    
    
    //Disaster Instance Fields
    protected int magnitude;
    protected int killChance; //integer out of total generic (non-app-specific) population
    
    
    //Disaster Constructors
    Disaster() {
        System.out.println("A " + getClass() + " occured.");
    }
    
    
    //Disaster Methods
    int getkillChance() {
        return killChance;
    }
    
}
