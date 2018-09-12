import java.util.Comparator;

public class Word {
    private String _value;
    private static final String CONSONANT_LETTERS = "bcdfghjklmnpqrstvwxzвгджзйклмнпрстфхцчшщ";

    Word(String value) {
        this._value = value;
    }

    private int getConsonantCount() {
        int result = 0;
        for (var c : _value.toLowerCase().toCharArray()) {
            if (CONSONANT_LETTERS.contains(Character.toString(c))) {
                result++;
            }
        }
        return result;
    }

    public static final Comparator<Word> COMPARE_BY_CONSONANT_COUNT = Comparator.comparingInt(Word::getConsonantCount);

    @Override
    public String toString() {
        return _value;
    }
}
