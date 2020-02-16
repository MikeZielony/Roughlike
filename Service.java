
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    Score score;
    List<Score> scores;


    public Service() {
        scores = new ArrayList<Score>();
    }

    public void readCsvFile() throws FileNotFoundException {

        File scoreFile = new File("Roughlike/score.csv");
        Scanner scanner = new Scanner(scoreFile);

        while (scanner.hasNextLine()) {
            String[] splitted = scanner.nextLine().split(";");
            String name = splitted[0].strip();
            int points = Integer.parseInt(splitted[1].strip());
            Score score = new Score(name, points);
            scores.add(score);
        }
        scanner.close();

    }

    public void addNewScore(int points) {
        UserGlobalInput input = new UserGlobalInput();
        System.out.println("Enter your name: ");
        String playerName = input.getStringInput();
        Score score = new Score(playerName, points);
        scores.add(score);
        try {
            writeScores();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeScores() throws IOException {
        FileWriter writer = new FileWriter("Roughlike/score.csv");
        String outputScores = "";
        for (Score score : scores) {
            outputScores += score.name + ";" + score.points + "\n";
        }
        writer.write(outputScores);
        writer.close();
    }

    public void showLeaderBoard() {
        System.out.println("+++ H I G H S C O R E S +++");
        for(int i = 0; i < 10; i++){
            System.out.println(scores.get(i).name + " " + scores.get(i).points);
        }
    }
}