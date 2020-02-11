import java.util.ArrayList;
import java.util.List;

public class Map {

    private String levelName;
    private int sizeX;
    private int sizeY;
    private String[][] board;
    private List<Element> elements;

    public Map(String levelName, int sizeX, int sizeY) {
        this.levelName = levelName;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.board = new String [sizeX][sizeY];
        this.elements = new ArrayList<Element>();
        generateMap();
    }

    public String[][] getBoard() {
        return board;
    }

    public String[][] generateMap() {
        // constants
        String sand = " . ";
        String frameHorizontal = "---";
        String frameVertical = " | ";
        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                if (x == 0 || x == sizeX - 1) {
                    this.board[x][y] = frameHorizontal;
                }
                else if (y == 0 || y == sizeY - 1) {
                    this.board[x][y] = frameVertical;
                }
                else {
                    this.board[x][y] = sand;
                }
                
                // add StaticElements here -- create class to reflect that
                // for (Element element : elements) {
                //     int x = element.getX();
                //     int y = element.getY();
                //     this.board[x][y] = element.getLook();
                // }
            }
        }

        return this.board;
    }

    public void addElement(Element element) {
        this.elements.add(element);
    }

}
