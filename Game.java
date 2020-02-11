public class Game {


    public void start() {
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

}
