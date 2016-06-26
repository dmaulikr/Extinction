package com.github.mitchjmac.extinction;

class Male extends Person {
    
    //Male Constructors
    Male() {
        super();
    }
    Male(Fetus f) {
        super(f);
    }

    
    //Male Methods
    void scoodilypoop(Person partner) {
        if (partner instanceof Female) {
            partner.scoodilypoop(this);
        }
    }
    
}
