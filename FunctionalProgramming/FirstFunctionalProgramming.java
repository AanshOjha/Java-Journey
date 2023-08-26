package FunctionalProgramming;
import java.util.List;

public class FirstFunctionalProgramming {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        System.out.println("Odd Numbers.");
       
        // For odd
        list.stream().filter(
            element -> element % 2 != 0
            )
            .forEach(
                element -> System.out.println(element)
            );


        System.out.println("\nNow Even Numbers.");

        // For even
        list.stream().filter(
            element -> element % 2 == 0
            )
            .forEach(
                element -> System.out.println(element)
            );
    }
}
