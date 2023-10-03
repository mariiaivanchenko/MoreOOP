package main.java.lotr;

import main.java.lotr.kick.Cry;

public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0, new Cry());
    }
}

// class Hobbit
// attributes: int power=0, int hp=3 done
// methods: void kick(Character c) { toCry() } done