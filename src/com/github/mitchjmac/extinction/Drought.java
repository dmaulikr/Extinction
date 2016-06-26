package com.github.mitchjmac.extinction;

class Drought extends Disaster {
    
    //Drought Fields
    private int duration;
    
    
    //Drought Constructor
    Drought() {
        duration = (Disaster.getRandom().nextInt(120) + 1);//months
    }
    
    
    //Drought Methods
    void decreaseDuration() {
        duration--;
    }
    
}
