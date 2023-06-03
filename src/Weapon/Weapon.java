package Weapon;
import java.util.Random;
public abstract class Weapon implements IWeapon {
    //Оружие
    private String name;
    private int damage;

    public Weapon(String name) {
        this.name = name;
        Random rand = new Random();
        this.damage = 20 + rand.nextInt(30);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getDamage(){
        return this.damage;
    }

    public String getInfo(){
     return  " Оружие " + getName() +
             " урон " + getDamage() ;
    }
}
