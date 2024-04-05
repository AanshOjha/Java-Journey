import java.util.*;

public class Hello {
    public static void main(String[] args) {
        int[] arr = new int[] {4,2,5,1,3};

        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println("HashSet" + set.toString());

        Set<Integer> set2 = new LinkedHashSet<>();
        for (int i : arr) {
            set2.add(i);
        }
        System.out.println("LinkedHashSet" + set2.toString());
        
        Set<Integer> set3 = new TreeSet<>();
        for (int i : arr) {
            set3.add(i);
        }
        System.out.println("TreeSet" + set3.toString());


    }


}