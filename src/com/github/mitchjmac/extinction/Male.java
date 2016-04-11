package com.github.mitchjmac.extinction;

class Male extends Person {
    
    //Male Constructor
    Male(Fetus f) {
        super(f);
    }
    
    Male(int age) {
        super(age);
    }
    
    //Male Methods
    void drink() {
        numDrinks++;
        if (numDrinks >= 4) {
            drunk = true;
        }
    }
    
    void scoodilypoop(Person partner) {
        if (partner instanceof Female) {
            partner.scoodilypoop(this);
        }
    }
    
}
