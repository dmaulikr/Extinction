package com.github.mitchjmac.extinction;

import java.util.Random;

abstract class Disaster {

    //Disaster Static Fields
    private static Random random = new Random();
    
    
    //Disaster Instance Fields
    private int magnitude;
    private int killChance; //integer out of total generic (non-app-specific) population
    
    
    //Disaster Constructors
    Disaster() {
        System.out.println("A " + getClass() + " occured.");
    }
    
    
    //Disaster Methods
    int getkillChance() {
        return killChance;
    }
    
}
