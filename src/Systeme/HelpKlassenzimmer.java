package Systeme;

public class HelpKlassenzimmer {

    private static String roomLayout =
            "____xx2_____2xx_____\n" +
                    "|                  |\n" +
                    "|3    l5  l5      Ü|\n" +
                    "||                6|\n" +
                    "||    l5  l5       |\n" +
                    "||                 |\n" +
                    "|     l5  l5       |\n" +
                    "|  DDD4           7|\n" +
                    "|________==1______O|";

    public static void helpKlassenzimmer(){
        System.out.println("Klassenzimmer:");
        System.out.println(roomLayout);
        System.out.println("Anleitung:");
        System.out.println("Die Zahlen (1-7) stehen für Interaktionobjekte. Gebe die Nummer ein um zu testen was man damit machen kann");
        System.out.println("Folgende Aktionen können Sie machen: nehmen, druecken, schieben, verwenden");
        System.out.println("Gebe den gleichen Namen als Aktion ein. Möchtest du die Anleitung und Karte nochmal sehen gebe 'help' ein");
    }
}
