
public class MainProgram {
    public static FileChooser fileChooser = new FileChooser();

    public static void main(String[] args) {

        while (fileChooser.files == null);

        for (int i = 0; i < fileChooser.files.length; i++) {
            System.out.println(fileChooser.files[i].getName());
        }
    }
}
