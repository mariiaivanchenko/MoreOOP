package main.java.lotr.kick;

import main.java.lotr.Character;

public class Cry implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character oponent) {
        System.out.println("Hobbit is crying.");
    }
}
