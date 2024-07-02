package Fragen;

import Systeme.GameOver;

import java.util.Scanner;

public class Eignungstest {

    public void eignungstestStart(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Eignungstest:");
        System.out.println();

        System.out.println("Frage 1: Welche Fachrichtung ist besser?");
        System.out.println("a) Anwendungsentwicklung b) Systemintegration c) Beide doof");
        System.out.println("Gebe bitte a, b oder c ein!");

        while (true) {
            String antwort = scanner.nextLine();
            if (antwort.equals("a")){
                System.out.println("Richtig!");
                break;
            } else if (antwort.equals("b") || antwort.equals("c")){
                System.out.println("Falsch!");
                GameOver.gameOver();
            } else {
                System.out.println("Falsche Eingabe!");
            }
        }

        System.out.println();
        System.out.println("Frage 2: Wie zieht ein Informatiker seine Freundin aus?");
        System.out.println("a) Pff, du Sexist! b) GetStringFromObject() c) Keine Ahnung, bin neu hier");
        System.out.println("Gebe bitte a, b oder c ein!");

        while (true) {
            String antwort = scanner.nextLine();
            if (antwort.equals("b")){
                System.out.println("Richtig!");
                break;
            } else if (antwort.equals("a") || antwort.equals("c")){
                System.out.println("Falsch!");
                GameOver.gameOver();
            } else {
                System.out.println("Falsche Eingabe!");
            }
        }

        System.out.println();
        System.out.println("Frage 3: Was sagt ein Informatiker, wenn er auf die Welt kommt?");
        System.out.println("a) Bier her! b) Servus?! c) Hallo Welt!");
        System.out.println("Gebe bitte a, b oder c ein!");

        while (true) {
            String antwort = scanner.nextLine();
            if (antwort.equals("c")){
                System.out.println("Richtig!");
                break;
            } else if (antwort.equals("a") || antwort.equals("b")){
                System.out.println("Falsch!");
                GameOver.gameOver();
            } else {
                System.out.println("Falsche Eingabe!");
            }
        }

        System.out.println();
        System.out.println("Glückwunsch, du hast den Eignungstest bestanden!");
        System.out.println("Willkommen an der Mischok Academy!");
        System.out.println();
        System.out.println("Drücke irgendeine Taste um fortzufahren!");

        scanner.nextLine();


    }
}
