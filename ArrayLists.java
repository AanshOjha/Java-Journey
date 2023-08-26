import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public void str12() {
        List<String> word = List.of("Aansh","Ananay","Mamma","Papa");
        List<String> words = new ArrayList<>(word);
        for (String i : words) {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        ArrayLists instance = new ArrayLists                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ();
        instance.str12();
    }
        
}