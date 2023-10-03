package main.java.lotr;

import main.java.lotr.kick.KStrategy;

public class King extends Noble {

    public King() {
        super(5, 15, new KStrategy());
    }
}

// class King
// attributes: int power=from 5 to 15, int hp=from 5 to 15
// methods: void kick(Character c) { decrease number of hp of the enemy by random number which will be in the range of his power }



