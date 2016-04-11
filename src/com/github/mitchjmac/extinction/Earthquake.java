package com.github.mitchjmac.extinction;

class Earthquake extends Disaster {

    //Earthquake Fields
    private int magnitude;
    
    //Earthquake Constructor
    Earthquake() {
        magnitude = (Disaster.random.nextInt(8) + 1);
    }
    
    //Earthquake Methods
    int getDeathPercent(){
        
    }
    
}
