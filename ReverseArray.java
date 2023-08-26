import java.util.Arrays;

public class ReverseArray {

    public int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        if (array.length <=1) {
            return array;
        }
        else {
            for (int i = 0; i<array.length; i++) {
                reversedArray[array.length-1-i] = array[i];
            }
        }
        return reversedArray;
    }

        public static void main(String[] args) {
            int[] array1 = {1,2,3,4,5};
            ReverseArray instance = new ReverseArray();

            // instance.reverseArray(array1) to call method, 
            // Arrays.toString() prints Array,
            // System.out.println() prints simply.

            System.out.println(
                Arrays.toString(
                    instance.reverseArray(array1)
                )
            );
        }
}