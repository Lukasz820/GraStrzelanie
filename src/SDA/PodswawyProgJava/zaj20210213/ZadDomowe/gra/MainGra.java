package SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra;

import java.util.Random;
import java.util.Scanner;

import static SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra.MainGra.healthPoint;

public class MainGra {
    protected static int healthPoint=100;
    static int money;
    protected static int level=1;

    public static void main(String[] args) {
        displayMoney();
    }


    public static void displayMoney(){
        System.out.println("\nLevel " + level+"\nYou have "+money+ " dollars\n"
         +"\nWybierz broń \n1. Pistolet - darmowy 7 strzłów po 10 pkt życia"
        + "\n2. Strzelba 2 strzały po 45 pkt życia Bonus 50% za mały dystans, minus 50% za duży dystans cena 1000$"
        + "\n3. Karabin 15 strzałow po 10 pkt życia - minus 50% za mały dystans, plus 50% za duży dystans cena 3000$\n");
        Scanner scanner=new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:{
                Gun.shot();
                break;
            }
            case 2:{
                Shotgun.shot();
                break;
            }
        }
    }
    public static boolean distance(){
        boolean distance=new Random().nextBoolean();
        return distance;//true - mały dystans
    }
    public static boolean hit(){
        boolean hit = new Random().nextBoolean();
        return hit;//true trafiony
    }

    public static void countTheMoney(int startHealthPoint,int healthPoint){
        int multiplier = (int)Math.floor(startHealthPoint-Math.max(0,healthPoint));
        money=money+multiplier*10;

        if (healthPoint<=0){
            System.out.println("Wygrałeś");
        } else {
            System.out.println("Przeciwnik ma jeszcze "+ healthPoint + " punktów życia, Graj dalej");
            level++;
            displayMoney();
        }
    }


}
