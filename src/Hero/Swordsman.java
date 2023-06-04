package Hero;

import Weapon.*;

public class Swordsman extends HeroBase<SwordAndShield> {
    //Мечник
    public SwordAndShield swordAndShield;

    public Swordsman(SwordAndShield weapon) {
        super();
        this.swordAndShield = weapon;
    }

    @Override
    public SwordAndShield getWeapon() {
        return swordAndShield;
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
