import java.util.ArrayList;
import java.util.List;

public class Map {

    private String levelName;
    private int sizeX;
    private int sizeY;
    private List<Element> elements;

    public Map(String levelName, int sizeX, int sizeY) {
        this.levelName = levelName;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.elements = new ArrayList<Element>();
    }

    public String[][] generateMap() {
        String[][] board = new String [sizeX][sizeY];
        String sand = " . ";
        String frameHorizontal = "---";
        String frameVertical = " | ";
        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                if (x == 0 || x == sizeX - 1) {
                    board[x][y] = frameHorizontal;
                }
                else if (y == 0 || y == sizeY - 1) {
                    board[x][y] = frameVertical;
                }
                else if (x == 5 && y == 5) {
                    board[x][y] = " J ";
                } 
                else if (x == 9 && y == 5) {
                    board[x][y] = " R ";
                }
                else {
                    board[x][y] = sand;
                }
            }
        }
        return board;
    }

    public void addElement(Element element) {
        this.elements.add(element);
    }
}
