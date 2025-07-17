package com.adhoc.progpractice;

public class SentenceReverser {
    /**
     * Reverses the words within a sentence, leaving punctuation and spacing intact.
     * For example, "Hello, world!" becomes "olleH, dlrow!".
     *
     * @param sentence The input string sentence.
     * @return A new string with the words reversed.
     */
    public static String reverseWords(String sentence) {
        // Handle null or empty strings as edge cases.
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        // Use a StringBuilder for efficient string construction.
        StringBuilder resultBuilder = new StringBuilder();
        // Use another StringBuilder to hold the characters of the current word.
        StringBuilder currentWordBuilder = new StringBuilder();

        // Iterate over each character in the input sentence.
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            // A "word" character is considered a letter.
            // You could also use Character.isLetterOrDigit(c) if numbers should be part of words.
            if (Character.isLetter(c)) {
                // If it's a letter, append it to the current word being built.
                currentWordBuilder.append(c);
            } else {
                // If it's not a letter, it's a delimiter (space, dot, comma, etc.).
                // First, reverse the word we have built so far and append it to the result.
                resultBuilder.append(currentWordBuilder.reverse());

                // Reset the current word builder to start fresh for the next word.
                currentWordBuilder.setLength(0);

                // Append the delimiter itself to the result.
                resultBuilder.append(c);
            }
        }

        // After the loop, there might be a final word if the sentence doesn't end with a delimiter.
        // For example, in "Hello world", the word "world" would still be in the currentWordBuilder.
        if (currentWordBuilder.length() > 0) {
            resultBuilder.append(currentWordBuilder.reverse());
        }

        return resultBuilder.toString();
    }

    /**
     * The main method to run and test the reverseWords function.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // --- Test Cases ---

        String sentence1 = "This is a sentence.";
        System.out.println("Original:  \"" + sentence1 + "\"");
        System.out.println("Reversed:  \"" + reverseWords(sentence1) + "\"");
        System.out.println("Expected:  \"sihT si a ecnetnes.\"");
        System.out.println("---------------------------------");

        String sentence2 = "Hello, world!";
        System.out.println("Original:  \"" + sentence2 + "\"");
        System.out.println("Reversed:  \"" + reverseWords(sentence2) + "\"");
        System.out.println("Expected:  \"olleH, dlrow!\"");
        System.out.println("---------------------------------");

        String sentence3 = "  leading, spaces. and...dots  ";
        System.out.println("Original:  \"" + sentence3 + "\"");
        System.out.println("Reversed:  \"" + reverseWords(sentence3) + "\"");
        System.out.println("Expected:  \"  gnidael, secaps. dna...stod  \"");
        System.out.println("---------------------------------");

        String sentence4 = "SingleWord";
        System.out.println("Original:  \"" + sentence4 + "\"");
        System.out.println("Reversed:  \"" + reverseWords(sentence4) + "\"");
        System.out.println("Expected:  \"droWeldgniS\"");
        System.out.println("---------------------------------");
    }
}
