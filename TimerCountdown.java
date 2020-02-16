import java.util.concurrent.TimeUnit;

public class TimerCountdown {

    private int time;

    public void countdown(int time) throws InterruptedException {
        boolean isRunning = true;
        while (isRunning) {
            if (time + 1 > 0) {
            time = time - 1;
            TimeUnit.SECONDS.sleep(1);
            clearScreen();
            System.out.println(time);
            }
            isRunning = false;
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}