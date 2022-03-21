package com.muwaffaq.innopolis.solid.LSP_IS.wrong;
//❌❌❌
// how many SOLID Does it Violates ?
// Fix it.
 interface BirdFlyable {
    void fly();
    void eat();
    void hatch();
}

interface BirdSwimmable{
    void eat();
    void hatch();
    void swim();
}

interface BirdAllMighty{
    void eat();
    void hatch();
    void swim();
    void fly();
}
