import java.util.ArrayList;
import java.util.List;

public class Map {

    private String levelName;
    private int sizeX;
    private int sizeY;
    private String[][] board;
    public List<Element> elements;

    public Map(String levelName, int sizeX, int sizeY) {
        this.levelName = levelName;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.board = new String[sizeX][sizeY];
        this.elements = new ArrayList<Element>();
        generateMap();
    }

    public List<Element> getElements() {
        this.elements = elements;
        return elements;
    }

    public String[][] getBoard() {
        return board;
    }

    public void generateObstracles(String name, String objectName) {
        int minWeight = 1;
        int maxWeight = 150;
        int minX = 1;
        int minY = 1;
        int maxX = sizeX - 1;
        int maxY = sizeY - 1;
        int numberOfElements = 5;
        int elementWeight = (int) (Math.random() * ((maxWeight - minWeight) + 1)) + minWeight;
        boolean randomBoolean = Math.random() > 0.5;

        for (int i = 0; i < numberOfElements; i++) {
            int elementX = (int) (Math.random() * ((maxX - minX) + 1)) + minX;
            int elementY = (int) (Math.random() * ((maxY - minY) + 1)) + minY;
            switch (objectName) {
            case "Rock":
                elements.add(new Rock(name, elementWeight, elementX, elementY, false, false));
                break;
            case "Tree":
                elements.add(new Tree(name, elementWeight, elementX, elementY, randomBoolean, false));

            }
        }
    }

    public String[][] generateMap() {
        String sand = Color.GREEN_BOLD_BRIGHT + " . " + Color.RESET;
        String frameHorizontal = "---";
        String frameVertical = " | ";

        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                if (x == 0 || x == sizeX - 1) {
                    this.board[x][y] = frameHorizontal;
                } else if (y == 0 || y == sizeY - 1) {
                    this.board[x][y] = frameVertical;
                } else {
                    this.board[x][y] = sand;
                }

                // add StaticElements here -- create class to reflect that
                for (Element element : elements) {
                    int xE = element.getX();
                    int yE = element.getY();
                    this.board[xE][yE] = element.getLook();
                }
            }
        }

        return this.board;
    }

    public void addElement(Element element) {
        this.elements.add(element);
    }

}
