package main.java.lotr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.reflections.Reflections;
import lombok.SneakyThrows;

public class CharacterFactory{
    @SneakyThrows
    public Character createCharacter() {
        Reflections reflections = new Reflections("main.java.lotr");
        List<Class<? extends Character>> classes = new ArrayList<>(reflections.getSubTypesOf(Character.class));
        classes.remove(Noble.class);
        Random random = new Random();
        int randomInd = random.nextInt(classes.size());
        Class<? extends Character> resultClass = classes.get(randomInd);
        return resultClass.getDeclaredConstructor().newInstance();
    }
}

// class CharacterFactory
// methods: Character createCharacter() { returns random instance of any existing character }
