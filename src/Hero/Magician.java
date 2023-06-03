package Hero;

import Weapon.*;

public class Magician extends HeroBase{
    public MagicSpell magicSpell;

    public Magician (Weapon weapon) {
        super();
        if (weapon instanceof MagicSpell) {
            this.magicSpell = (MagicSpell) (weapon);
        }
    }

    @Override
    public Weapon getWeapon() {
        return (Weapon) (magicSpell);
    }

    @Override
    public String getHeroName() {
        return "Маг";
    }

    @Override
    public String getInfo() {
        return this.getHeroName() + " HP " + this.getHp() + this.magicSpell.getInfo() ;
    }
}
