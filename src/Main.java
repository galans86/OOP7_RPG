import Hero.*;
import Weapon.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<HeroBase> team1 = new ArrayList<>();
        team1.add(new Archer(new BowAndArrows("FlameBow")));
        team1.add(new Swordsman(new SwordAndShield("SwordFroster")));
        team1.add(new Magician(new MagicSpell("CharmSpell")));

        List<HeroBase> team2 = new ArrayList<>();
        team2.add(new Archer(new BowAndArrows("StrongBow")));
        team2.add(new Swordsman(new SwordAndShield("SwordBooster")));
        team2.add(new Magician(new MagicSpell("DeadSpell")));

        System.out.println("Команда 1:");
        for (HeroBase hero : team1)
            System.out.println(hero.getInfo());
        System.out.println("Команда 2:");
        for (HeroBase hero : team2)
            System.out.println(hero.getInfo());

        int team1Count = team1.size();
        int team2Count = team2.size();
        ;
        Random rand = new Random();
        HeroBase hero1;
        HeroBase hero2;

        do {
            hero1 = team1.get(rand.nextInt(team1Count));
            hero2 = team2.get(rand.nextInt(team2Count));

            if (rand.nextInt(2) == 1) {

                hero1.attack(hero1.getWeapon(), hero2);

                System.out.println("Игрок команды 1 " + hero1.getHeroName() + " hp = " + hero1.getHp() +
                        " атаковал игрока команды 2 " + hero2.getHeroName() + " hp = " + hero2.getHp());
                if (hero2.getHp() == 0) {
                    team2.remove(hero2);
                }
            } else {
                hero2.attack(hero2.getWeapon(), hero1);

                System.out.println("Игрок команды 2 " + hero2.getHeroName() + " hp = " + hero2.getHp() +
                        " атаковал игрока команды 1 " + hero1.getHeroName() + " hp = " + hero1.getHp());
                if (hero1.getHp() == 0) {
                    team1.remove(hero1);
                }
            }

            team1Count = team1.size();
            team2Count = team2.size();

        } while (team1Count > 0 && team2Count > 0);

        if (team1Count > 0) {
            System.out.println("Выиграла команда 1!!!");
        } else System.out.println("Выиграла команда 2!!!");

    }
}