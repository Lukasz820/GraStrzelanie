package SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra;

import java.util.Scanner;

import static SDA.PodswawyProgJava.zaj20210213.ZadDomowe.gra.MainGra.healthPoint;

public class MainGra {
    protected static int healthPoint=100;
    static int money=900;
    static int level=0;

    public static void main(String[] args) {
        displayMoney();
    }


    public static void displayMoney(){
        level++;
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
                if (money<1000){
                    System.out.println("Nie stać Cię, wybierz inną broń");
                    level--;
                    displayMoney();
                    break;
                }else{
                    money-=1000;
                    Shotgun.shot();
                    break;
                }

            }
        }
    }



}
