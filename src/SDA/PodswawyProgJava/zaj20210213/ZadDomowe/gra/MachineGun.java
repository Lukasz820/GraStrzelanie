package SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra;

import static SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra.MainGra.healthPoint;
import static SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra.MainGra.level;

public class MachineGun extends Weapon {

    public static void shot(){
        int startHealthPoint=healthPoint;
        for (int i=1;i<16;i++){
            if (hit()){
                if (distance()){
                    healthPoint-=10-0.5;
                    System.out.println("Runda " + level+ " Strzal "+i + " -  karabin z małej odległosci - trafiony");
                }else {
                    healthPoint-=10*1.5;
                    System.out.println("Runda " + level+ " Strzal "+i + " -karabin z dużej odległosci - trafiony");
                }
            } else {
                System.out.println("Runda " + level+ " Strzal "+i + " strzał - niecelny");
            }
        }
        countTheMoney(startHealthPoint,healthPoint);
    }
}
