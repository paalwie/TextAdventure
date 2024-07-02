import Part1.Level1;
import Part1.Level2;
import Text.*;
import Spieler.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";

        System.out.println();

        System.out.println(ANSI_RED + "Bevor Sie das Spiel starten, bitte das Terminalfenster auf Maximalgröße (Fullscreen) schalten!" + ANSI_RESET);

        Scanner scanner = new Scanner (System.in);

        System.out.println("Bitte gebe deinen Namen ein:");

        String playerName = scanner.nextLine();
        Player player = Player.getInstance();

        player.setPlayerName(playerName);

        System.out.println("Hallo " + player.getPlayerName() + "!");

        System.out.println("Drucken Sie eine beliebige Taste um das Spiel zu starten!");
        scanner.nextLine();

        //Testbereich Start
        //Level2 level2test = new Level2();
        //level2test.level2Start();
        //Testbereich Ende

        Intro  intro = new Intro();

        Funktionen.langsamerText(intro.getIntroText(), 5);

        Funktionen.leereSeite();

        System.out.println(player.getPlayerName() + ", bitte drücke irgendeine Taste um Level 1 zu starten!");
        scanner.nextLine();

        Level1 level1 = new Level1();
        level1.level1Start();

        Level2 level2 = new Level2();
        level2.level2Start();
    }
}