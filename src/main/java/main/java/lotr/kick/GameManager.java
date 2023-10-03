package main.java.lotr.kick;

import main.java.lotr.CharacterFactory;
import main.java.lotr.Hobbit;
import main.java.lotr.Elf;
import main.java.lotr.Character;
import java.util.Random;

public class GameManager {
    public static void fight() {
        // create 2 characters
        CharacterFactory fact = new CharacterFactory();
        Character ch1 = fact.createCharacter();
        System.out.println("First fighter is " + ch1.toString());

        CharacterFactory fact1 = new CharacterFactory();
        Character ch2 = fact1.createCharacter();
        System.out.println("Second fighter is " + ch2.toString());

        // strategies
        KickStrategy cry = new Cry();
        KickStrategy elfkill = new ElfKill();
        KickStrategy kstr = new KStrategy();

        // fight
        while ((ch1.isAlive() == true) && (ch2.isAlive() == true)) {
            // who is gonna start a fight?
            Random rnd = new Random();
            int flag = rnd.nextInt(0, 2);
            Character currentCh = (flag == 0) ? ch1 : ch2;
            Character oponent = (currentCh == ch1) ? ch2 : ch1;
            System.out.println(currentCh.toString() + " starts a fight." + "\n");

            if (currentCh instanceof Hobbit){
                if (oponent instanceof Hobbit) {
                    System.out.println("Fight of 2 Hobbits is impossible)");
                    break;
                }
                else {kick(cry, currentCh, oponent);}
            }
            else if (currentCh instanceof Elf)
                kick(elfkill, currentCh, oponent);
            else {
                kick(kstr, currentCh, oponent);
            }

            // check if works
            System.out.println("Current state:");
            System.out.println(currentCh);
            System.out.println(oponent +"\n");

        }
        // end of fight
        if ((ch1.isAlive() == false) && (ch2.isAlive() == true)) {
            System.out.println(ch2.toString() + "is a winner!");
            System.out.println(ch1.toString() + "is a dead(");
        } else if ((ch1 instanceof Hobbit) && (ch2 instanceof Hobbit))
            System.out.println( "Decided to drink some tea)");
        else {
            System.out.println(ch1.toString() + "is a winner!");
            System.out.println(ch2.toString() + "is a dead(");
        }
        System.out.println("END.");
        
    }

    public static void kick(KickStrategy kickMethod, Character whoKick, Character oponent) {
        kickMethod.kick(whoKick, oponent);
    }

    public static void main(String[] args) {
        fight();
    }
}
