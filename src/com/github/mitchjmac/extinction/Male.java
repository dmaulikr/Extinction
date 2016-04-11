package com.github.mitchjmac.extinction;

class Male extends Person {
    
    //Male Constructors
    Male(int age) {
        super(age);
    }
    Male(Fetus f) {
        super(f);
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
