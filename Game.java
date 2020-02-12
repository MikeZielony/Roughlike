
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
                isInteraction(player.getX() - 1, player.getY(), -1, 0);

                // if (isMovingPossible(player.getX() - 1, player.getY())) {           
                //       player.setX(-1);
                //  }
                
                break;
                case 'S':
                isInteraction(player.getX() - 1, player.getY(), 1, 0);

                // if (isMovingPossible(player.getX() - 1, player.getY())) {           
                //       player.setX(1);
                //  }
                
                break;
                case 's':
                isInteraction(player.getX() + 1, player.getY(), 1, 0);

                // if (isMovingPossible(player.getX() +1, player.getY())) {           
                //       player.setX(1);
                //  }

                break;
            case 'W':
                isInteraction(player.getX() + 1, player.getY(), -1, 0);

                // if (isMovingPossible(player.getX() +1, player.getY())) {           
                //       player.setX(-1);
                //  }

                break;
            case 'a':
                isInteraction(player.getX(), player.getY() - 1, 0, -1);

                // if (isMovingPossible(player.getX(), player.getY()-1)) {           
                //     player.setY(-1);
                    
                // }
                break;
                case 'D':
                isInteraction(player.getX(), player.getY() - 1, 0, 1);

                // if (isMovingPossible(player.getX(), player.getY()-1)) {           
                //     player.setY(1);
                    
                // }
                break;
            case 'd':
                isInteraction(player.getX(), player.getY() + 1, 0, 1);

                // if (isMovingPossible(player.getX(), player.getY()+1)) {           
                //     player.setY(1);
                    
                // }
                break;   
                case 'A':
                isInteraction(player.getX(), player.getY() + 1, 0,-1);

                // if (isMovingPossible(player.getX(), player.getY()+1)) {           
                //     player.setY(-1);
                    
                // }
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
        
        

        for (String[] line : boardBackground) {
            for (String character : line) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

//     public void moveGrazyna() {
//         int max = 0;
//         int min = 3;

//         // for (Element element : map.getElements()) {
//         //     if (element.getLook() == "GRA") { 
//         //         int move = (int)(Math.random() * ((max - min)));
//         //         switch(move) {
//         //             case '0':
//         //             isMovingPossible(element.getX()-1, element.getY());
//         //         element.setX(-1);
//         //         break;
//         //         case '1':
//         //             isMovingPossible(element.getX()+1, element.getY());
//         //         element.setX(1);
//         //         break;
//         //         case '2':
//         //             isMovingPossible(element.getX(), element.getY()-1);
//         //         element.setY(-1);
//         //         break;
//         //         case '3':
//         //             isMovingPossible(element.getX(), element.getY()+1);
//         //         element.setY(1);
//         //         break;
//         //     }
            
            
            
//         // }
    //}
//}

   //public boolean isMovingPossible(int x, int y) {
     //  return map.getBoard()[x][y] == " . " || map.getBoard()[x][y] == "RRR";
//}
//isInteraction(player.getX() - 1, player.getY(), -1, 0);

                // if (isMovingPossible(player.getX() - 1, player.getY())) {           
                //       player.setX(-1);
                //  }

    public boolean isInteraction(int px, int py, int x, int y) {
        if(map.getBoard()[px+x][py+y] == " . " || map.getBoard()[px][py] == "RRR"){
            player.setX(x);
            player.setY(y);
       
        for (Element element : map.getElements() ) {
            if (element.getX() == px 
            && element.getY() == py) {
                 element.setIsMoveable();
                 element.setX(x);
                 element.setY(y);
                 
                 return true;
        }
    }
        
    }
    return false;

}
}

    
