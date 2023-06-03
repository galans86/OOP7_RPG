package Hero;

import Weapon.*;

import java.util.Random;

public abstract class HeroBase {
    //Герой(Персонаж)
    private int hp;

    public HeroBase() {
        //Случайная величина от 500 до 1000
        Random rand = new Random();
        this.hp = 10 + rand.nextInt(90);
    }

    public void takeDamage(int hp) {
        this.hp = this.hp - hp;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public int getHp() {
        return hp;
    }

    public void attack(Weapon weapon, HeroBase targetHero) {
        targetHero.takeDamage(weapon.getDamage());
    }

    public abstract Weapon getWeapon();
    public abstract String getHeroName();
    public abstract String getInfo();
}
