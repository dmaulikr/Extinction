package com.github.mitchjmac.extinction;

class Storm extends Disaster {

    
    //Storm Fields
    
    
    //Storm Constructors
    Storm() {
        magnitude = (Disaster.random.nextInt(5) + 1); //1-5
    }
    
    
    //Storm Methods
    
    
    //Inner Classes
    private class Flood extends Disaster {
        
    }
    
    private class Hail extends Disaster {
        
    }
    
    private class lightning extends Disaster {
        
    }
    
    private class Tornado extends Disaster { //only have chance if storm magnitude >=3
        
        //Tornado Fields
        
        
        //Tornado Constructor
        Tornado(int stormStrength) {
            if (stormStrength == 3) {
                magnitude = Disaster.random.nextInt(1);
            } else if (stormStrength == 4) {
                magnitude = (Disaster.random.nextInt(2) + 1);
            } else {
                magnitude = (Disaster.random.nextInt(3) + 3);
            }
            
        }
        
    }
    
}
