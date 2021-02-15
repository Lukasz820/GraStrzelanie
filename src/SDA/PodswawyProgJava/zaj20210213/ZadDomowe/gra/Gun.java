package SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra;

import static SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra.MainGra.*;

public class Gun {

    public static void  shot() {
        int startHealthPoint=healthPoint;
        for (int i=1;i<8;i++){
            if (hit()){
                healthPoint-=10;
                    System.out.println("Runda " + level+ " Strzal "+i + " -  z pitoletu trafiony");

            } else {
                System.out.println("Runda " + level+ " Strzal "+i + " strzał z pistoletu - niecelny");
            }
        }
        countTheMoney(startHealthPoint,healthPoint);
    }
}
