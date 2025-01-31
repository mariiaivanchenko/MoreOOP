import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.lotr.Character;
import main.java.lotr.Hobbit;
import main.java.lotr.Elf;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfTest {
    private Character character; // can i change here to Elf???

    @BeforeEach
    public void init() {
        character = new Elf();
    }

    @Test
    public void testToString(){ assertEquals("Elf{hp=10, power=10}", character.toString());
    }

    @Test
    public void testKick() {
        Hobbit hobbit = new Hobbit();
        character.kick(hobbit);
        assertEquals(0, hobbit.getHp());
    }
}

