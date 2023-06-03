package Hero;

import Weapon.*;

public class Swordsman extends HeroBase {
    //Мечник
    public SwordAndShield swordAndShield;

    public Swordsman(Weapon weapon) {
        super();
        if (weapon instanceof SwordAndShield) {
            this.swordAndShield = (SwordAndShield) (weapon);
        }
    }

    @Override
    public Weapon getWeapon() {
        return (Weapon) (swordAndShield);
    }

    @Override
    public String getHeroName() {
        return "Меченосец";
    }

    @Override
    public String getInfo() {
        return this.getHeroName() + " HP " + this.getHp() + this.swordAndShield.getInfo();

    }
}
