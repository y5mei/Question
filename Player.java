public class Player {
    private String name;
    private char position;
    private double avgPoints;
    private double avgRebounds;
    private double avgAssists;


    public Player(String pName, char pPos, double pPoints, double pRebounds, double pAssists) {
        name = pName;
        position = pPos;
        avgPoints = pPoints;
        avgRebounds = pRebounds;
        avgAssists = pAssists;
    }

    public String toString() {
        return "Player: " + name +
                "\n   Position:      " + position +
                "\n   Points/Game:   " + avgPoints +
                "\n   Rebounds/Game: " + avgRebounds +
                "\n   Assists/Game:  " + avgAssists +
                "\n";
    }

    public String toFile() {
        return name + " " + position + " " + avgPoints + " " + avgRebounds + " " +
                avgAssists;
    }
}
