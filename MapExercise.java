import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        String str = "Quick brown fox jumps over the lazy dog.";
        Map<Character, Integer> occ = new HashMap<>();
        var chr = str.toCharArray();
        
        for (Character c : chr) {
            Integer integer = occ.get(c);
            if (integer == null) {
                occ.put(c, 1);
            }
            else {
                occ.put(c, integer+1);
            }
        }
        System.out.println(occ);

        System.out.println("==================================================================");

        Map<String, Integer> words = new HashMap<>();
        var str1 = str.split(" ");
        
        for (String word : str1) {
            Integer count = words.get(word);
            if (count == null) {
                words.put(word, 1);
            } else {
                words.put(word, count + 1);
            }
        }
        System.out.println(words);
        System.out.println(words.get("Quick"));
    }
}
