package Hero;

import Weapon.*;

public class Archer extends HeroBase<BowAndArrows> {
    //Лучник
    public BowAndArrows bowAndArrows;

    public Archer(BowAndArrows weapon) {
        super();
        this.bowAndArrows = (BowAndArrows) (weapon);
    }

    @Override
    public BowAndArrows getWeapon() {
        return bowAndArrows;
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
