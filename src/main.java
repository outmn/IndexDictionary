import java.io.File;
import java.util.TreeMap;

/**
 * Created by maximgrozniy on 07.09.15.
 */
public class main {
    public static void main(String[] args) {
        FileChooser fileChooser = new FileChooser();
        TreeMap<String, Integer> dictionary = new TreeMap<String, Integer>();
        File file = new File("/Users/maximgrozniy/Documents/Lermontov/Geroj_nashego_vremeni.txt") ;
        File files [] = {file};
        DictionaryBuilder dictionaryBuilder = new DictionaryBuilder(dictionary, files);

        for(String word : dictionary.keySet( ))
        {
            System.out.println(word);
        }



    }
}
