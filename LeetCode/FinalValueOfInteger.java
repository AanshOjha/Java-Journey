public class FinalValueOfInteger {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (int i = 0; i<=operations.length-1; i++) {
            if (operations[i].equals("--X")) {
                --X;
            }
            else if (operations[i].equals("++X")) {
                ++X;
            }
            else if (operations[i].equals("X++")) {
                X++;
            }
            else if (operations[i].equals("X--")) {
                X--;
            }

        }
        return X;
    }

    public static void main(String[] args) {
        FinalValueOfInteger value = new FinalValueOfInteger();
        System.out.println(value.finalValueAfterOperations(new String[] {"++X","++X","X++"}));
    }
}
