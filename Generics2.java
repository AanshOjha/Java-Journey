import java.util.List;

public class Generics2 {

    public static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.1, 2.2, 3.3);

        printNumbers(integers); // Output: 1 2 3
        printNumbers(doubles);  // Output: 1.1 2.2 3.3
    }
}
