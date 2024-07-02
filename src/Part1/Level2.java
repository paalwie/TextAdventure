package Part1;

import Raum.Klassenzimmer;
import Text.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Level2 {

    public void level2Start(){

        Scanner scanner = new Scanner(System.in);

        Funktionen.leereSeite();

        Level2Text level2Text = new Level2Text();

        Funktionen.langsamerText(level2Text.getLevel2(), 5);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Funktionen.leereSeite();

        System.out.println();
        String text1 = Funktionen.kastenErstellenfuerText(level2Text.getLevel2Text1());
        Funktionen.langsamerText(text1, 5);

        try {
            TimeUnit.SECONDS.sleep(9);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Funktionen.leereSeite();

        Funktionen.langsamerText(level2Text.getLevel2Text2(), 5);
        System.out.println();
        String text2 = Funktionen.kastenErstellenfuerText(level2Text.getLevel2Text3());
        Funktionen.langsamerText(text2, 5);

        System.out.println();
        System.out.println("Drücke eine beliebige Taste um fortzufahren!");
        scanner.nextLine();
        Funktionen.leereSeite();

        Klassenzimmer klassenzimmer = new Klassenzimmer();
        klassenzimmer.klassenzimmerStart();


    }
}
