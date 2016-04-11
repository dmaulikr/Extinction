package com.github.mitchjmac.extinction;

class Storm extends Disaster {

    
    //Storm Fields
    int deathPercent;
    
    
    //Storm Constructors
    Storm() {
        
    }
    
    
    //Storm Methods
    int getDeathPercent() {
        
    }
    
    //Inner Classes
    private class Flood {
        
    }
    
    private class Hail {
        
    }
    
    private class lightning() {
        
    }
    
    private class Tornado {
        
        //Tornado Fields
        private int magnitude;
        
        //Tornado Constructor
        Tornado() {
            magnitude = (Disaster.random.nextInt(5) + 1);
        }
        
    }
    
}
