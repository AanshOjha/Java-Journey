public class ReverseWordsInSentence {

    public String reverseWordsInSentence(String sentence) {
        // If the sentence is null, return "INVALID"
        if (sentence == null) {
            return "INVALID";
        }
        
        // If the sentence is empty, return an empty string
        if (sentence == "") {
            return "";
        }

        // Splitting sentence to words and storing in String List
        String[] words = sentence.split(" ");
        

        // String Builder to store reversed words
        StringBuilder sb = new StringBuilder();
        
        // 
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word); // Initializes it with the current word from the loop.
            reversedWord.reverse();                               // Reverses that current word 
            sb.append(reversedWord).append(" ");              // Appends the current word and space
        }

        return sb.toString().trim();    // Converts into string and trims space from end of String

    }

    public static void main(String[] args) {
        ReverseWordsInSentence reverse = new ReverseWordsInSentence();
        System.out.println(reverse.reverseWordsInSentence("Hello everyone . My name is Aansh Ojha"));
    }
}