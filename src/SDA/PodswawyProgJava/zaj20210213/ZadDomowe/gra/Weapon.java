package SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra;

import java.util.Random;

import static SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra.MainGra.displayMoney;
import static SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra.MainGra.money;

public abstract class Weapon {


    public static boolean distance(){
        
        return new Random().nextBoolean();//true - mały dystans
    }
    public static boolean hit(){
        return new Random().nextBoolean();//true trafiony
    }

    public static void countTheMoney(int startHealthPoint,int healthPoint){
        int multiplier = (int)Math.floor(startHealthPoint-Math.max(0,healthPoint));
        money=money+multiplier*10;

        if (healthPoint<=0){
            System.out.println("Wygrałeś");
        } else {
            System.out.println("Przeciwnik ma jeszcze "+ healthPoint + " punktów życia, Graj dalej");
            displayMoney();
        }
    }

}
