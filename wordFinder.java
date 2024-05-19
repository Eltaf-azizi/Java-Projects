import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wordFinder {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("dictionary.txt"));

        for (String currentWord = reader.readLine(); currentWord != null; currentWord = reader.readLine()) {
            System.out.println(currentWord);
        }

    }
}