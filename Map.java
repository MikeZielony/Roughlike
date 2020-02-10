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

    public void printOnScreen() {
        String[][] board = new String [sizeX][sizeY];
        String sand = " . ";
        String frameHorizontal = "---";
        String frameVertical = "|";
        for (int y = 0; y < sizeY; y++) {
            board[sizeX][sizeY] = "\n";
            // System.out.println();
        
            for (int x = 0; x < sizeX; x++){
                if (x == 0 || x == sizeX - 1) {
                    board[sizeX][sizeY] = frameVertical;
                // System.out.print(frameVertical);
                }
                else {
                    if (y == 0 || y == sizeY - 1) {
                        board[sizeX][sizeY] = frameHorizontal;
                        // System.out.print(frameHorizontal);
                    }
                    else {
                        board[sizeX][sizeY] = sand;
                    // System.out.print(sand);
                    }
                }
            }
        }
        System.out.println("\n");
    }

    public void addElement(Element element) {
        this.elements.add(element);
        
    }
}
