package org.launchcode;
import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without " +
                "pictures or conversation?’";
        System.out.println(firstSentence);
        System.out.println("What word would you like to search for in the sentence above?");
        String word = input.nextLine();
        String wordLower = word.toLowerCase();
        String firstSentenceLower = firstSentence.toLowerCase();
        boolean check = firstSentenceLower.contains(wordLower);
        System.out.println(check);
    }
}
