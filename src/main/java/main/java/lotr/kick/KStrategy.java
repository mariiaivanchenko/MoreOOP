package main.java.lotr.kick;

import java.util.Random;
import main.java.lotr.Character;

public class KStrategy implements KickStrategy { // king and knigth strategies
    @Override
    public void kick(Character whoKick, Character oponent) {
        Random random = new Random();
        oponent.setHp(oponent.getHp() - random.nextInt(1, whoKick.getHp()));
    }
}
