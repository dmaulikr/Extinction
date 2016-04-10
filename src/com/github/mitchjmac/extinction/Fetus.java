package com.github.mitchjmac.extinction;

class Fetus {
    
    private Person[] parents = new Person[2];

    Fetus(Person p1, Person p2) {
        parents[0] = p1;
        parents[1] = p2;
    }
    
    Person getParent(int i) {
        return parents[i];
    }


}