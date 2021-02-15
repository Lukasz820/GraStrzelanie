package SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra;

import static SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra.MainGra.*;

public class Shotgun extends Weapon {


    public static void shot() {
        int startHealthPoint=healthPoint;
        for (int i=1;i<3;i++){
            if (hit()){
                if (distance()){
                    healthPoint-=45*1.5;
                    System.out.println("Runda " + level+ " Strzal "+i + " -  shotgun z małej odległosci - trafiony");
                }else {
                    healthPoint-=45*0.5;
                    System.out.println("Runda " + level+ " Strzal "+i + " -shotgun z dużej odległosci - trafiony");
                }
            } else {
                System.out.println("Runda " + level+ " Strzal "+i + " strzał - niecelny");
            }
        }
        countTheMoney(startHealthPoint,healthPoint);
    }
}
