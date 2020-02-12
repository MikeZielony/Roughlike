import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {
        new GameTimer(30);
        Player player = new Player("Janusz","JAN", 100, 120, 5, 5, false);
        Enemy enemy = new Enemy("Grazynka", "GRA", 100, 120, 15, 3, true);
        
        Map map = new Map("Level 1", 20, 20);
        map.generateObstracles("RRR", "Rock");
        map.generateObstracles("XXX", "Tree");
        Game game = new Game(map, player, enemy);
        
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