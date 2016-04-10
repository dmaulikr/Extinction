package com.github.mitchjmac.extinction;

class Male extends Person {
    
    //Male Constructor
    Male() {
        super();
    }
    
    Male(Person p1, Person p2) {
        super(p1, p2);
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
            partner.haveSex(this);
        }
    }
    
}
