package FunctionalProgramming;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquareOf10Numbers {
    
    public static void main(String[] args) {
        // Result into List
        IntStream.range(1, 11).map(e -> e*e).boxed().collect(Collectors.toList());    

        // Directly
        IntStream.range(1, 11).map(e -> e*e).forEach(e -> System.out.println(e)); 
    }
}
