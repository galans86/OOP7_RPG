package Hero;

import Weapon.*;

import java.util.Random;

public abstract class HeroBase <T extends Weapon>{
    //Герой(Персонаж)
    private int hp;

    public HeroBase() {
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

    public void attack(T weapon, HeroBase targetHero) {
        targetHero.takeDamage(weapon.getDamage());
    }

    public abstract T getWeapon();
    public abstract String getHeroName();
    public abstract String getInfo();
}
