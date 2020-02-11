
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game extends KeyAdapter{

    private Map map;
    private Player player;

    public Game(Map map, Player player) {
        this.map = map;
        this.player = player;
    }

    public void start() {        
        this.map.generateMap();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public void keyPressed(KeyEvent event) {

        // Game game = new Game();
        // game.start();

        char ch = event.getKeyChar();

        switch(ch) {
            case 'w':
                player.setX(-1);
                break;
            case 's':
                player.setX(1);
                break;
            case 'a':
                player.setY(-1);
                break;
            case 'd':
                player.setY(1);
                break;   
        }

        clearScreen();
        display();
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void display() {
        String[][] board2;
        board2 = map.generateMap(); 
        
        int x = player.getX();
        int y = player.getY();
        board2[x][y] = player.getLook();

        for (String[] line : board2) {
            for (String character : line) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
