package com.github.mitchjmac.extinction.disaster;

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
                m = Disaster.getRandom().nextInt(1);
            } else if (stormStrength == 4) {
                m = (Disaster.getRandom().nextInt(2) + 1);
            } else {
                m = (Disaster.getRandom().nextInt(3) + 3);
            }
            
        }
        
    }
    
}
