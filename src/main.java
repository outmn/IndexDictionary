import java.io.File;
import java.util.TreeMap;

/**
 * Created by maximgrozniy on 07.09.15.
 */
public class Main {

    public static FileChooser fileChooser = new FileChooser();

    public static void main(String[] args) throws InterruptedException {

        while (fileChooser.files == null) {
            System.out.println(1);
        }

        for (int i = 0; i < fileChooser.files.length; i++) {
            System.out.println(fileChooser.files[i].getName());
        }
    }
}
