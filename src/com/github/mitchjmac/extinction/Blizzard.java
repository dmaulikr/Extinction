package com.github.mitchjmac.extinction;

class Blizzard extends Disaster {
    
    //Blizzard Fields
     private int duration;
    
    
    //Blizzard Constructors
    Blizzard() {
        magnitude = (Disaster.getRandom().nextInt(5) + 1); //1-5
        duration = (Disaster.getRandom().nextInt(7) + 1); //days
    }
    
    
    //Blizzard Methods
    void decreaseDuration() {
        duration--;
        if (duration == 0) {
            System.out.println("The blizzard subsided.");
        }
    }
    
}
