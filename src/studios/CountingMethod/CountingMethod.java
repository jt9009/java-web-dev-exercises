package studios.CountingMethod;

import java.io.*;
import java.util.*;

public class CountingMethod {

    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored" +
                " allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

    HashMap<Character, Integer> charCountMap = new HashMap<>();
    char[] strArray = str.toCharArray();

    for (char c: strArray) {
        if (charCountMap.containsKey(c)) {
            charCountMap.put(c, charCountMap.get(c) + 1);
        }
        else {
            charCountMap.put(c, 1);
        }
    }
    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
    }
}
