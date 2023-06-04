package Hero;

import Weapon.*;

public class Magician extends HeroBase<MagicSpell> {
    public MagicSpell magicSpell;

    public Magician(MagicSpell weapon) {
        super();
        this.magicSpell = weapon;
    }

    @Override
    public MagicSpell getWeapon() {
        return magicSpell;
    }

    @Override
    public String getHeroName() {
        return "Маг";
    }

    @Override
    public String getInfo() {
        return this.getHeroName() + " HP " + this.getHp() + this.magicSpell.getInfo();
    }
}
