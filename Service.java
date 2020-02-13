
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Service {

    List<String> scores;
    // public void endGame(int finalScore, String playerName, int level) throws
    // IOException {
    // List<String> scores = retrieveScores();
    // addNewScore(playerName, level, finalScore, scores);
    // writeScores(scores);
    // showLeaderBoard(scores);
    // } 
    public Service(){
        List<String> scores = new ArrayList<String>();

    }

    // ic List<String> retrieveScores(List<String> scores) throws IOException {
    // BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
    // String scoreLine = reader.readLine(); // read line that contains scores
    // // List<String> scores = new ArrayList<>();
    // scoreLine != null) { // in case of first game
    // String[] tempScore = scoreLine.split(", ");
    //     scores = new ArrayList<>(Arrays.asList(tempScore));
    // }
    // reader.close();
    //     return scores;
    // }
        // Service service = new Service();
    public void readCsvFile() throws FileNotFoundException{
        File scoreFile = new File("Roughlike/score.csv");
        Scanner scanner = new Scanner(scoreFile);
        // scanner.useDelimiter(";");
        while (scanner.hasNextLine()){
             for(String score : this.scores){
                String [] res = score.split(";");
                scores.add(res[0]);
                scores.add(res[1]);
        }
     }
     scanner.close();
     System.out.println("read from file");
    }

    public void addNewScore(String playerName, int level, int finalScore, List<String> scores) {

        boolean foundSpotForNewScore = false;
        int i = 0;
        // while (!foundSpotForNewScore && i < scores.size()) {
        //     if (finalScore <= Integer.parseInt(scores.get(i))) {
        //         foundSpotForNewScore = true;
        //     }
        //     i++;
        // }
        scores.add(i, String.valueOf(finalScore));
    }

    public void writeScores(List<String> scores) throws IOException {
        FileWriter writer = new FileWriter("score.txt");
        String outputScores = scores.toString();
        // outputScores = outputScores.replace("[", "");
        // outputScores = outputScores.replace("]", "");
        writer.write(outputScores);
        writer.close();
    }

    public void showLeaderBoard(List<String> scores) {
        System.out.println("*** TOP 5 LEADERBOARD ***");
        int i = 0;
        while (i < 5 && i < scores.size()) {
            System.out.println(scores.get(i));
            i++;
        }
        System.out.println("*** TOP 5 LEADERBOARD ***");
    }

}