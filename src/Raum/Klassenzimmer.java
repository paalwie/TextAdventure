package Raum;

import Text.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Klassenzimmer {

    private boolean leaveRoom = false;
    private String einleitungsText =
            "Mit einer schnellen Bewegung streckte Heribert seine Hand aus und enthüllte einen \n" +
                    " glänzenden Schlüssel. \"Dieser Schlüssel,\" erklärte er, seine Stimme triefte vor Bosheit, \n" +
                    "hat die Macht, jede Tür in dieser Akademie zu öffnen oder zu schließen. Und heute werde \n" +
                    "ich dein Schicksal entscheiden.\"\n" +
                    "\n" +
                    "Alex sah entsetzt zu, wie Heribert die Tür zuschlug und ihn in Dunkelheit stürzte. \n" +
                    "Der Raum war erfüllt von einer drückenden Stille, die nur vom Geräusch seines \n" +
                    "eigenen keuchenden Atems unterbrochen wurde. Er spürte, wie eine Welle der Panik \n" +
                    "über ihn hinwegspülte, seine Gedanken rasten vor Fluchtgedanken.";

    private String roomLayout =
                            "____xx2_____2xx_____\n" +
                            "|                  |\n" +
                            "|3    l5  l5      Ü|\n" +
                            "||                6|\n" +
                            "||    l5  l5       |\n" +
                            "||                 |\n" +
                            "|     l5  l5       |\n" +
                            "|  DDD4           7|\n" +
                            "|________==1______O|";


    public void klassenzimmerStart(){

        Scanner scanner = new Scanner(System.in);

        String text1 = Funktionen.kastenErstellenfuerText(einleitungsText);

        Funktionen.langsamerText(text1, 5);
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Funktionen.leereSeite();

        System.out.println("Ziel: Fliehe aus dem Raum!");
        System.out.println();
        System.out.println(roomLayout);

        System.out.println("Anleitung:");
        System.out.println("Die Zahlen (1-7) stehen für Interaktionobjekte. Gebe die Nummer ein um zu testen was man damit machen kann");
        System.out.println("Folgende Aktionen können Sie machen: nehmen, druecken, schieben, verwenden");
        System.out.println("Gebe den gleichen Namen als Aktion ein. Möchtest du die Anleitung und Karte nochmal sehen gebe 'help' ein");

        while(leaveRoom == false){

            System.out.println();
            System.out.println("Geben Sie einen der Befehle ein (für Hilfefunktion: 'help'!");
            scanner.nextLine();
        }


    }
}
