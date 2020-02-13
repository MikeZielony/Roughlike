import javax.swing.JFrame;
import javax.swing.JTextField;

public class Controller{

    private boolean isRunning = true;
        
    public Controller(){
        
        UserGlobalInput uInput = new UserGlobalInput();

        // TODO: implement user interaction here. You can change the code below

        while (isRunning) {
            System.out.println("" +
            "\n\n\n                                Welcome to Hide the Beer. \n\n" +
            "                                                   with Janusz.\n\n" +
            "                                   Please choose from one of the following options\n\n" +
            "                                                            (1) Start GAME\n" + 
            "         Where is Pioter ?                                  (2) Show Result\n" +
            "                                                            (0) Exit Game\n\n\n");

            int menuOption = uInput.getIntInput(); // TODO: get option from user

            switch (menuOption) {

                case 1:
                    System.out.println("Start Game !!!");
                    // new GameTimer(10);
                    // new TimerCountdown().countdown(30);
                    Player player = new Player("Janusz"," \uD83E\uDDD4 ", 100, 120, 5, 5, false);
                    Enemy enemy = new Enemy("Grazynka", "\uD83E\uDD37\u200D\u2640\uFE0F ", 100, 120, 15, 3, false);
                    
                    Map map = new Map("Level 1", 20, 20);
                    map.generateObstracles(" \u26F0 ", "Rock");
                    map.generateObstracles(" \uD83C\uDF32 ", "Tree");
                    Game game = new Game(map, player, enemy);
                    
                    JTextField textField = new JTextField();
            
                    textField.addKeyListener(game);
                    JFrame jframe = new JFrame();
                    jframe.add(textField);
                    jframe.setSize(50, 50);
                    jframe.setVisible(true);

                    break;
                case 2:
                    // Show all results
                    System.out.println("High Scores: ");
                    Printing table = new Printing();
                    table.printHeader();
                    table.printTable();
                    // result.getResultTable();
                    break;

                case 0:
                    isRunning = false;
                    break;
                default:
                    break;
            }
        }
    uInput.scanerClose();
    }
}