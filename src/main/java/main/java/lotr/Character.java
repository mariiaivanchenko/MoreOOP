package main.java.lotr;

import lombok.Getter;
import lombok.Setter;
import main.java.lotr.kick.KickStrategy;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

    public void kick(Character oponent) {
        kickStrategy.kick(this, oponent);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}"; 
    }
}

// class Character
// attributes: int power, in hp done
// methods: void kick(Character c), boolean isAlive() done


// class GameManager
// methods: void fight(Character c1, Character c2) { to provide fight between to characters and explain via command line what happens during fight, till both of the characters are alive }

// king and knight(дублювання коду) -> inheritance, композиція
// character factory -> randomno обирає персонажа
// reflections -> розібратись, треба для лаби(
// здати лінк на репозиторій, галочка згори
