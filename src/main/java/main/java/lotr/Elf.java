package main.java.lotr;

import main.java.lotr.kick.ElfKill;

public class Elf extends Character {

    public Elf() {
        super(10, 10, new ElfKill());
    }
    
}
// class Elf
// attributes: int power=10, int hp=10 done
// methods: void kick(Character c) done
// { kill everybody weaker than him, otherwise decrease the power of character by 1 } done