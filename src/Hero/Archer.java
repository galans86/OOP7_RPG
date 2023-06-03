package Hero;

import Weapon.*;

public class Archer extends HeroBase {
    //Лучник
    public BowAndArrows bowAndArrows;

    public Archer(Weapon weapon) {
        super();
        if (weapon instanceof BowAndArrows) {
            this.bowAndArrows = (BowAndArrows) (weapon);
        }
    }

    @Override
    public Weapon getWeapon() {
        return (Weapon) (bowAndArrows);
    }

    @Override
    public String getHeroName() {
        return "Лучник";
    }

    @Override
    public String getInfo() {
        return this.getHeroName() + " HP " + this.getHp() + this.bowAndArrows.getInfo();
    }
}
