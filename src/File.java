import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File {
    private String _filePath;
    private ArrayList<Word> _words = new ArrayList<>();

    File(String filePath) {
        _filePath = filePath;
    }

    File() {
        this("D:\\Users\\kutsenkoivan99\\Documents\\Education\\5 семестр\\Системне програмування\\Lab1\\text.txt");
    }

    public void FillWords(String filePath) {
        _filePath = filePath;
        FillWords();
    }

    public void FillWords() {
        try (BufferedReader br = new BufferedReader(new FileReader(_filePath))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                for (String wordValue : sCurrentLine.split("[\\.,\\s!;?:\"]+")) { // "\\P{L}+"
                    if (wordValue.length() <= 30) {
                        _words.add(new Word(wordValue));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SortWordsByConsonantCount() {
        _words.sort(Word.COMPARE_BY_CONSONANT_COUNT);
    }

    public List<String> GetWords() {
        List<String> wordsValues = new ArrayList<>();
        for (Word word : _words) {
            boolean contains = false;
            for (String wordValue : wordsValues) {
                if (wordValue.equals(word.toString())) {
                    contains = true;
                }
            }
            if (!contains) {
                wordsValues.add(word.toString());
            }
        }
        return wordsValues;
    }
}
