/*
 * Advent11.java
 *
 * Created on Dec 22, 2015, 11:22:01 PM
 *
 *
 */
package advent11;

/**
 *
 * @author Josh Wein
 */
public class Advent11 {

    public static void main(String[] args) {
        char[] input = "cqjxjnds".toCharArray();         
        System.out.println("Puzzle Input: " + new String(input));
        long time = System.currentTimeMillis(); // timer
        while (!checkPassword(input)) {
            incrementPassword(input, 1);
        }        
        System.out.println("Part 1 time: " + (System.currentTimeMillis() - time) + "ms"); // Time to complete        
        //Print result
        System.out.println("Part 1: " + new String(input));
        
        // Increment to do Part 2
        incrementPassword(input, 1);
        while (!checkPassword(input)) {
            incrementPassword(input, 1);
        }        
        System.out.println("Part 1 && 2 time: " + (System.currentTimeMillis() - time) + "ms"); // Time to complete
        //Print result
        System.out.println("Part 2: " + new String(input));
    }

    static boolean checkPassword(char[] input) {
        // Cannot contain 'i', 'o', 'l'
        for (char a : input) {
            if (a == 'i' || a == 'o' || a == 'l') {
                return false;
            }
        }
        // Contains one increasing straight
        boolean pass = false;
        for (int i = 0; i < input.length - 2; i++) {
            if(input[i]+1 == input[i+1]) {
                if(input[i]+2 == input[i+2]) {
                    pass = true;
                }
            }
        }
        // Contains two different, non overlapping pairs
        int pairs = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if(input[i] == input[i+1]) {
                pairs++;
                i++;
            }
        }
        return pairs > 1 && pass;
    }

    // Increments password by 1 at given position
    static void incrementPassword(char[] input, int pos) {
        // If the given position is a 'z', then reset to 'a' and increment the character to the right.
        if (input[input.length - pos] == 'z') {
            input[input.length - pos] = 'a';
            incrementPassword(input, pos + 1);
        } else {
            input[input.length - pos]++;
        }
    }
}
