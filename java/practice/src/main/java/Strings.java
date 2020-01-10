import java.util.HashMap;

public class Strings {
    public static void main(String[] args) {
    }

    public static HashMap<String, Long> getMapOfCharactersUsed(String inputString) {
        HashMap<String, Long> characterCount = new HashMap<>();

        for(Character c: inputString.toLowerCase().toCharArray()) {
            characterCount.put(String.valueOf(c), characterCount.get(String.valueOf(c)) == null ? 1L : characterCount.get(String.valueOf(c)) + 1L);
        }

        return characterCount;
    }
}
