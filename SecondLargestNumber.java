public class SecondLargestNumber {
 
    public int findSecondLargestElement(int[] array) {
 
        if (array.length < 2) {
            return -1;  // Return -1 if the array has less than 2 elements.
        }
 
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
 
        for (int element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } 
            else if (element > secondLargest && element != largest) {
                secondLargest = element;
            }
        }
 
        // If there is no second largest element (all elements in the array are the same), return -1
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
 
        return secondLargest;
    }

        public static void main(String[] args) {
            int[] inputArray = {5, 10, 20, 15, 30};

            // Create an instance of the SecondLargestNumber class
            SecondLargestNumber instance = new SecondLargestNumber();
    
            // Call the findSecondLargestElement method and store the result
            int secondLargestElement = instance.findSecondLargestElement(inputArray);
    
            // Print the result
            System.out.println("The second largest element in the array is: " + secondLargestElement);
        }
}