package org.launchcode;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String quoteAlphaNumeric = quote.replaceAll("[^a-zA-Z0-9]", "");
        HashMap<Character, Integer> finalCount = new HashMap<>();
        for (char i : quoteAlphaNumeric.toLowerCase().toCharArray()) {
            if(finalCount.containsKey(i)) {
                int currentCount = finalCount.get(i);
                finalCount.put(i, currentCount+1);
            } else {
                finalCount.put(i, 1);
            }
        }
        System.out.println(finalCount);

    }

}
