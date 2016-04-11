package com.github.mitchjmac.extinction;

import java.util.Random;

abstract class Disaster {

    //Disaster Static Fields
    private static Random random = new Random();
    
    
    //Disaster Instance Fields
    int deathPercent;
    
    
    //Disaster Constructors
    Disaster() {
        
    }
    
    
    //Disaster Abstract Methods
    int getDeathPercent();
    
}
