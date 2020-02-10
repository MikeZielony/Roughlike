public class Game {


    public void start() {
        Map map1 = new Map("Level 1", 20, 20);
        map1.printOnScreen();

        Player player = new Player("Janusz", "@", 100, 120, 5, 5, false, true);
        map1.addElement(player);
    }

}
