package com.github.mitchjmac.extinction.people;

public class Male extends Person {
    
    int x = 100;
    
    //Male Constructors
    public Male() {
        super();
    }
    protected Male(Fetus f) {
        super(f);
    }
    
    
    //Male Methods
    void scoodilypoop(Person partner) {
        if (partner instanceof Female) {
            partner.scoodilypoop(this);
        }
    }
    
}
