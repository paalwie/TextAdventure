package Spieler;

public class Player {

    // Private Instanz
    private static Player instance = null;
    private static String playerName;

    // Konstruktor
    private Player() {
        // Initialisierung des Players
    }

    // Methode zum Abrufen der Instanz
    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}

