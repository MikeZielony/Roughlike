import java.util.Scanner;

public class UserGlobalInput {

    public Scanner scanner = new Scanner(System.in);

    public float getFloatInput() {
        return scanner.nextFloat();
    }

    public String getStringInput() {
        return scanner.next();
    }

    public int getIntInput() {
        return scanner.nextInt();
    }
    public void scanerClose() {
        scanner.close();
    }
}