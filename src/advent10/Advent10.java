/*
 * Advent10.java
 *
 * Created on Dec 22, 2015, 10:24:10 PM
 *
 *
 */
package advent10;

/**
 *
 * @author Josh Wein
 */
public class Advent10 {

    public static void main(String[] args) {
        String input = "3113322113";
        int processAmount = 50;
        long time = System.currentTimeMillis(); // timer
        for(int i = 0; i < processAmount; i++) {
            input = process(input);
        }        
        System.out.println("Total time: " + (System.currentTimeMillis() - time) + "ms"); // Time to complete
        System.out.println("Length: " + input.length());
    }

    // Performs "look-and-say" on given input
    static String process(String input) {
        StringBuilder result = new StringBuilder(); // Build result string
        int count;
        for (int i = 0; i < input.length()-1; i++) {
            count = 1;
            char t = input.charAt(i); // Iterate through each character
            // Make sure not to go past end of string, test if the next character is the same
            while(i != input.length()-1 && t == input.charAt(i + 1)) {
                i++;
                count++;
            }       
            // Append how many repeat characters and the character
            result.append(count).append(t);
            // Only happens when the last character is not a repeat since we stop a character early if it is.
            if(i == input.length() - 2) {
                result.append(1).append(input.charAt(i+1));
            }
        }
        return result.toString();
    }

}
