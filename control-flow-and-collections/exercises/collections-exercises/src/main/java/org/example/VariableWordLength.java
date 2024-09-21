package org.example;

public class VariableWordLength {
    public static boolean getWordLength(String args, int number){
        if (args.length() == number){
            return true;
        } else {
            return false;
        }
    }
}
