public class CompareSumOfArrays {

    private int[] array1;
    private int[] array2;

    public CompareSumOfArrays(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        return sum1 == sum2;
    }

    private int calculateSum(int[] array) {
        
        int sum=0; 
        for (int i : array) {
            sum += i;
        }
        return sum;

    }

        public static void main(String[] args) {
            int[] array1 = {12, -3, 42};
            int[] array2 = {22, -3, 42};
            CompareSumOfArrays compare = new CompareSumOfArrays(array1, array2);
            System.out.println(compare.areSumsEqual());
        }

}