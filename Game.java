
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game extends KeyAdapter{

    private Map map;
    private Player player;
    public boolean isInteraction;

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
            
                if (isMovingPossible(player.getX() - 1, player.getY())) {  
                            
                player.setX(-1);}
                if (isInteraction(player.getX(), player.getY())) {
                    System.out.println("\007");
                } 
                break;
            case 's':
            if (isMovingPossible(player.getX() +1, player.getY())) {           
                player.setX(1);}
                break;
            case 'a':
            if (isMovingPossible(player.getX(), player.getY()-1)) {           
                player.setY(-1);}
                break;
            case 'd':
            if (isMovingPossible(player.getX(), player.getY()+1)) {           
                player.setY(1);}
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
        boardBackground[3][3] = "GRA";
        

        for (String[] line : boardBackground) {
            for (String character : line) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public boolean isMovingPossible(int x, int y) {
        
        if (map.getBoard()[x][y] == " . " || map.getBoard()[x][y] == "GRA") {
            return true;
        }else{
            return false;
        }
    }
    public boolean isInteraction(int x, int y) {
        if (map.getBoard()[x][y] == "GRA") {
            
            return true;
        }else{
            return false;
        }
    }
    public void getIsInteraction () {
        
    }

}

