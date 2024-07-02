package Text;

public class Funktionen {

    public static void leereSeite(){
        for (int i = 0; i < 100; i++){
            System.out.println();
        }
    }

    public static void langsamerText(String text, int speed){
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static String kastenErstellenfuerText(String textOhneKasten) {

        String kasten = "=============================================================";
        String textMitKasten = kasten + "\n" + textOhneKasten + "\n" + kasten;

        return textMitKasten;
    }

}
