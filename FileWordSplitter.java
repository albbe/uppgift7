import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;

//7.0 creating a class for reading in text from a file and splitting it into separate words.
public class FileWordSplitter{

    private ArrayList<String> words = new ArrayList<>();
    //lägger till en public accessor till den privata objektet words
    public void addWord(String word){
        this.words.add(word);
    }
    // behöver jag både addWord och getWords?
    public ArrayList<String> getWords() {
        return words;
    }

    public FileWordSplitter(String filename){
        try {
            BufferedReader file = new BufferedReader(new FileReader());
            String line = file.readLine();
            while (line != null){
                String regex = " ";
                line = file.readLine();
                words = words.concat(line.nextLine() + "\n");
            }
            file.close();
        } catch (IOException e){
            System.out.println("Something went wrong: " + e.getMessage());
            System.exit(1);
        }

    }

}
