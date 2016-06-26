package com.github.mitchjmac.extinction;

class Earthquake extends Disaster {

    //Earthquake Fields
    
    
    //Earthquake Constructor
    Earthquake() {
        magnitude = (Disaster.getRandom().nextInt(8) + 1); //1-8
    }
    
    
    //Earthquake Methods
    
    
}
