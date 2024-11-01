import java.util.Stack;

public class Reversesentence {
    public static void main(String[] args) {
        String str = "Devasena is very kind and beautiful girl";
        Stack<String> st = new Stack<>();
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!longest.isEmpty()) { // Check if there's a word to push
                    st.push(longest);
                    longest = ""; // Clear the string
                }
            } else {
                longest += str.charAt(i);
            }
        }
        // Push the last word
        if (!longest.isEmpty()) {
            st.push(longest);
        }

        // Construct the reversed sentence
        String reversedSentence = "";
        while (!st.isEmpty()) {
            reversedSentence += st.pop() + " ";
        }

        // Print the reversed sentence, trim to remove the trailing space
        System.out.println(reversedSentence);
    }
}
