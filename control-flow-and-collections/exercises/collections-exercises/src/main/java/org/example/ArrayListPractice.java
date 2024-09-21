package org.example;
import java.util.ArrayList;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr){
        int total = 0;
        for (int i : arr) {
            if (i%2 == 0) {
                total += i;
            }
        }
        return total;
    }
}