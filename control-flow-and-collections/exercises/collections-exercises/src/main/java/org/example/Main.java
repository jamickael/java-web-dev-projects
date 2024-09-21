package org.example;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,5,8};
        for (int i : array) {
            if (i%2 == 1){
                System.out.println(i);
            }
        }

        String foxSentence = "I would not, could not, in a box. I would not, could not with a fox. \n" +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] foxSentenceSplit = foxSentence.split(" ");
        System.out.println(Arrays.toString(foxSentenceSplit));

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(23);
        integerList.add(51);
        integerList.add(99);
        integerList.add(55);
        integerList.add(102);
        integerList.add(12);
        integerList.add(11);
        integerList.add(1);
        System.out.println(ArrayListPractice.sumEven(integerList));

        for (String i : foxSentenceSplit){
            String word = i.toString();
            if (FiveLetters.fiveLetterWords(word) == true){
                System.out.println(word);
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("What word length would you like to search for?");
        int wordLength = input.nextInt();
        for (String i : foxSentenceSplit){
            String word = i.toString();
            if (VariableWordLength.getWordLength(word, wordLength) == true){
                System.out.println(word);
            }
        }
    }
}