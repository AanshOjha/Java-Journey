public class Alphabet {
    void alphaPrint() {
        for (char i = 'A'; i<='Z'; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Alphabet instance = new Alphabet();
        instance.alphaPrint();
    }
}
