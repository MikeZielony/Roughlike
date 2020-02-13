import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class GameTimer{

    Toolkit toolkit;

    Timer timer;

    public GameTimer(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Time is up !");
            toolkit.beep();
            System.out.println("YOU Lose !");
            timer.cancel();
        }
    }
}