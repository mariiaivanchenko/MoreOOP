package main.java.lotr;

import main.java.lotr.kick.KStrategy;

public class Knight extends Noble {
    
    public Knight() {
        super(2, 12, new KStrategy());
    }
}

// class Knight
// attributes: int power=from 2 to 12, int hp=from 2 to 12
// methods: void kick(Character c) { like King }