package Part1;

import Fragen.Eignungstest;
import Text.*;
import Spieler.*;
import java.util.Scanner;

public class Level1 {

    public void level1Start(){

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Drucken Sie eine beliebige Taste um Level 1 zu starten!");
        //scanner.nextLine();

        Player player = Player.getInstance();
        System.out.println("Hallo " + player.getPlayerName() + "!");

        Level1Text level1Text = new Level1Text();

        Funktionen.langsamerText(level1Text.getLevel1IntroText(), 5);

        System.out.println();

        String text1 = Funktionen.kastenErstellenfuerText(level1Text.getLevel1_Text1());

        Funktionen.langsamerText(text1, 5);

        System.out.println("Drücke eine beliebige Taste um fortzufahren!");
        scanner.nextLine();

        Funktionen.leereSeite();

        Eignungstest eignungstest = new Eignungstest();
        eignungstest.eignungstestStart();

        String text2 = Funktionen.kastenErstellenfuerText((level1Text.getLevel1_Text2()));

        Funktionen.langsamerText(text2, 5);

        System.out.println();
        System.out.println("Drücke eine beliebige Taste um fortzufahren!");
        scanner.nextLine();

    }
}
