package main.java.lotr.kick;

import main.java.lotr.Character;
import java.util.Random;

public class ElfKill implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character oponent) {
        if (oponent.getPower() < whoKick.getPower())
            oponent.setHp(0);
        else {
            Random random = new Random();
            whoKick.setPower(whoKick.getPower() - 1);
            oponent.setHp(oponent.getHp() - random.nextInt(whoKick.getHp() - 1) + 1;        }
    }
}
