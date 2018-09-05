public class Controller {
    public static void main(String[] args) {
        File file = new File();
        file.FillWords();
        file.SortWordsByConsonantCount();
        for (String word : file.GetWords()) {
            System.out.println(word);
        }
    }
}
