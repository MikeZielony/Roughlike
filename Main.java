import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Janusz", "JAN", 100, 120, 5, 5, false);
        Map map = new Map("Level 1", 20, 20);
        Game game = new Game(map, player);
        // game.setPlayer(player);
        // game.setMap(map);

        JTextField textField = new JTextField();

        textField.addKeyListener(game);
        JFrame jframe = new JFrame();
        jframe.add(textField);
        jframe.setSize(100, 100);
        jframe.setVisible(true);
    }
}