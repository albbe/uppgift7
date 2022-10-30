import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main (String[] args){
        // hur få java att fatta att BufferedReader.file är en metod i klassen FileWordSplitter
    BufferedReader file = FileWordSplitter.file(new FileReader("my_file.txt"));
    FileWordSplitter splitter = new FileWordSplitter("hamlet.txt");
    ArrayList<String> hamletWords = splitter.getWords();
    System.out.println(hamletWords.get(3)); // Get the fourth word in hamlet.txt
    }
}
