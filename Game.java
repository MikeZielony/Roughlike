
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game extends KeyAdapter {

    private Map map;
    private Player player;
    private Enemy enemy;
    public boolean isInteraction;

    public Game(Map map, Player player, Enemy enemy) {
        this.map = map;
        this.player = player;
        this.enemy = enemy;
    }

    public void start() {
        this.map.generateMap();
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public void keyPressed(KeyEvent event) {
        int number = (int) (Math.random() * ((100) + 1));
        if (number > 50){
        logicGrazyna();}

        char ch = event.getKeyChar();


        switch (ch) {
        case 'w':
            isInteraction(player.getX() - 1, player.getY(), -1, 0);

            if (isMovingPossible(player.getX() - 1, player.getY())) {
                player.setX(-1);
            }

            break;
        case 's':
            isInteraction(player.getX() + 1, player.getY(), 1, 0);

            if (isMovingPossible(player.getX() + 1, player.getY())) {
                player.setX(1);
            }

            break;
        case 'a':
            isInteraction(player.getX(), player.getY() - 1, 0, -1);

            if (isMovingPossible(player.getX(), player.getY() - 1)) {
                player.setY(-1);

            }
            break;
        case 'd':
            isInteraction(player.getX(), player.getY() + 1, 0, 1);

            if (isMovingPossible(player.getX(), player.getY() + 1)) {
                player.setY(1);

            }
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
        String[][] boardBackground;
        boardBackground = this.map.generateMap();

        int x = player.getX();
        int y = player.getY();
        boardBackground[x][y] = player.getLook();
        // boardBackground[3][3] = "GRA";
        int xE = enemy.getX();
        int yE = enemy.getY();
        boardBackground[xE][yE] = enemy.getLook();

        for (String[] line : boardBackground) {
            for (String character : line) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public boolean isMovingPossible(int x, int y) {
        return map.getBoard()[x][y] == Color.GREEN_BOLD_BRIGHT + " . " + Color.RESET || map.getBoard()[x][y] == "RRR";
    }

    public boolean isInteraction(int px, int py, int x, int y) {

        for (Element element : map.getElements()) {
            if (element.getX() == px && element.getY() == py) {
                element.setIsMoveable();
                element.setX(x);
                element.setY(y);

                return true;
            }

        }
        return false;

    }
public void moveGrazynaUp () {
    if (!isMovingPossible(enemy.getX() - 1, enemy.getY())) {
        enemy.setY(1);
    }
    enemy.setY(-1);
}
    public void moveGrazynaDown () {
        if (!isMovingPossible(enemy.getX() - 1, enemy.getY())) {
            enemy.setX(1);
            return;
        }
        enemy.setY(1);
    }
    public void moveGrazynaLeft () {
        if (!isMovingPossible(enemy.getX() - 1, enemy.getY())) {
            enemy.setY(1);
        }
        enemy.setX(-1);
        }
    public void moveGrazynaRight () {
        if (!isMovingPossible(enemy.getX() - 1, enemy.getY())) {
            enemy.setX(-1);
        }
        enemy.setX(1);
        }
   public void logicGrazyna () {
            if (player.getY() < enemy.getY()) {
                moveGrazynaUp();}
            if (player.getY() > enemy.getY()) {
                moveGrazynaDown();}
            if ( player.getX() < enemy.getX()) {
                moveGrazynaLeft();}
            if (player.getX() > enemy.getX())
                {moveGrazynaRight();}
    
            }
}
