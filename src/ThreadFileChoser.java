/**
 * Created by maximgrozniy on 08.09.15.
 */
public class ThreadFileChoser extends Thread {
    FileChooser fileChooser;

    public ThreadFileChoser() {
        this.start();
    }

    public void run() {
        fileChooser = new FileChooser();
    }
}
