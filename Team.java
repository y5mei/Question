import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Team {
    private MyConcreteList<Player> roster;

    public Team() {
        roster = new MyConcreteList<Player>();
    }

    public void addPlayer(Player player) {
        roster.add(player);

    }

    public String toString() {
        String result = "";
        for (Player P : roster) {
            result += P.toString();
        }
        return result;
//        return roster.toString();
    }


    public String toFile() {
        String fileRoster = ""; // output String
        for (int i = 0; i < roster.size(); i++) {
            fileRoster += roster.get(i).toFile();
        }
        return fileRoster;
    }


    public static void main(String args[]) {
        Team t = new Team();
        String name;
        char position;
        double avgPoints;
        double avgRebounds;
        double avgAssists;

        try {
            Scanner scan = new Scanner(new File("TeamFile.txt"));
            while (scan.hasNext()) {
                name = scan.next() + " " + scan.next();
                position = scan.next().charAt(0);
                avgPoints = Double.parseDouble(scan.next());
                avgRebounds = scan.nextDouble();
                avgAssists = scan.nextDouble();
                t.addPlayer(new Player(name, position, avgPoints, avgRebounds, avgAssists));
            }

            scan.close();
        } catch (IOException e) {
            System.out.println("*** I/O Error ***\n" + e);
        }
        System.out.println(t.toString());
    }

}


