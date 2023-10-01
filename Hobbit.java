package main.java.lotr;

public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0);
    }

    private toCry(){
        System.out.println("Hobbit is crying.");
    }

    @Override
    public void kick(Character oponent) {
        toCry();
    }

}
// class Hobbit
// attributes: int power=0, int hp=3 done
// methods: void kick(Character c) { toCry() } done