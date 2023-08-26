public class IsArraySorted {

    public boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i]<=array[i-1]) { // if previous element is greater than current element
                return false;
            }
        }
        return true;
    }

        public static void main(String[] args) {
            int[] array1 = {12, 34, 3, 78};
            IsArraySorted sort = new IsArraySorted();
            System.out.println(sort.isSorted(array1));
        }

}