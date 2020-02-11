import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game extends KeyAdapter{

    public void start() {
        JTextField textField = new JTextField();

        textField.addKeyListener(new Game());
        JFrame jframe = new JFrame();

        jframe.add(textField);
        jframe.setSize(100, 100);
        jframe.setVisible(true);
        
        Map map1 = new Map("Level 1", 20, 20);
        String[][] board = map1.generateMap();

        for (String[] line : board) {
            for (String character : line) {
                System.out.print(character);
            }
            System.out.println();
        }

        Player player = new Player("Janusz", "@", 100, 120, 5, 5, false, true);
        map1.addElement(player);
    }
    @Override
    public void keyPressed(KeyEvent event) {

        // Game game = new Game();
        // game.start();

        char ch = event.getKeyChar();

        System.out.println((int)ch);

        switch(ch) {
            case 'w':
                // code block
                // Hero.moveUp()
                break;
            case 's':
                // code block
                // Hero.moveDown()
                break;
            case 'a':
                // code block
                // Hero.moveLeft()
                break;
            case 'd':
                // code block
                // Hero.moveRight()
                break;   
        }
    }

    public void moveDown() {

    }

    public void moveUp() {

    }

    public void moveLeft() {

    }

    public void moveRight() {
        
    }

}
