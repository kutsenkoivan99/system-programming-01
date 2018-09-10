import javax.swing.JFileChooser;

public class Controller {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int ret = fileChooser.showDialog(null, "Open File");
        File file;
        if (ret == JFileChooser.APPROVE_OPTION) {
            file = new File(fileChooser.getSelectedFile().getPath());
        } else {
            file = new File();
        }
        file.FillWords();
        file.SortWordsByConsonantCount();
        for (String word : file.GetWords()) {
            System.out.println(word);
        }
    }
}
