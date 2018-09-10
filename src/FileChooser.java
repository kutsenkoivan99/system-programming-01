import javax.swing.JFileChooser;
import java.io.File;

public class FileChooser {
    private static File _chooseFile() {
        JFileChooser fileChooser = new JFileChooser();
        int dialogResult = fileChooser.showDialog(null, "Open File");
        File file;
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
        } else {
            file = null;
        }
        return file;
    }

    public static String GetFilePath() {
        return _chooseFile().getPath();
    }
}
