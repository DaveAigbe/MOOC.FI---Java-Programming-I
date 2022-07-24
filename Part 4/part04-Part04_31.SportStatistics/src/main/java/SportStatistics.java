
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();


        int games = 0;
        int wins = 0;
        int losses = 0;

        try(Scanner reader = new Scanner(Paths.get(file))){
            while (reader.hasNextLine()) {
                String[] info = reader.nextLine().split(",");

                String home = info[0];
                String away = info[1];

                int homeScore = Integer.valueOf(info[2]);
                int awayScore = Integer.valueOf(info[3]);

                if (home.equals(team)){
                    games ++;
                    if (homeScore > awayScore){
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (away.equals(team)) {
                    games ++;
                    if (awayScore > homeScore){
                        wins++;
                    } else {
                        losses++;
                    }
                }


            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
