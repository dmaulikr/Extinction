package com.github.mitchjmac.extinction;

class Male extends Person {
    
    //Male Constructor
    Male() {
        super();
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
    
    void haveSex(Person partner) {
        if (partner instanceof Female) {
            partner.haveSex(this);
        }
    }
    
}
