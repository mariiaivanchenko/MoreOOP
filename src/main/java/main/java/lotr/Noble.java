package main.java.lotr;

import java.util.Random;

import main.java.lotr.kick.KStrategy;

public abstract class Noble extends Character {
    private static Random random = new Random();

    public Noble(int min, int max) { 
        super(random.nextInt(max - min) + min + 1, random.nextInt(max - min) + min + 1, new KStrategy());
    }

    public Noble(int min, int max, KStrategy kStrategy) {
        super(random.nextInt(max - min) + min + 1, random.nextInt(max - min) + min + 1, kStrategy);
    }
}
