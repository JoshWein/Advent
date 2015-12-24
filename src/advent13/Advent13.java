/*
 * Advent13.java
 *
 * Created on Dec 23, 2015, 7:57:32 PM
 *
 *
 */
package advent13;

import com.google.common.collect.Collections2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Josh Wein
 */
public class Advent13 {

    public static void main(String[] args) {
        String[] input = getInput().split(".\n");
        HashSet<String> people = new HashSet<>(); // Hold all the people
        HashMap<String, Integer> happiness = new HashMap<>(); // Hold the happiness links between everyone
        for (String line : input) {
            String[] tokens = line.split(" ");
            int mult = tokens[2].equals("gain") ? 1 : -1; // Check if it's a gain or loss in happiness
            people.add(tokens[0]);
            people.add(tokens[10]);
            happiness.put(tokens[0] + tokens[10], Integer.parseInt(tokens[3]) * mult); // Create key value pairs of 'name1name2' : weight
        }
        // True: Part 1 || False: Part 2
        if (true) { 
            people.remove("me");
        } else {
            people.add("me");
            for (String peep : people) {
                happiness.put(peep + "me", 0);
                happiness.put("me" + peep, 0);
            }
        }
        int max = 0;
        for (List<String> perm : Collections2.permutations(people)) { // Get all permumations
            int total = 0;
            for (int i = 0; i < perm.size() - 1; i++) {
                total += happiness.get(perm.get(i) + perm.get(i + 1)) + happiness.get(perm.get(i + 1) + perm.get(i));
            }
            // Account for ends of table.
            total += happiness.get(perm.get(0) + perm.get(perm.size() - 1)) + happiness.get(perm.get(perm.size() - 1) + perm.get(0));
            if (total > max) {
                max = total;
            }
        }
        System.out.println("Max happy: " + max);
    }

    // Make sure the last line has a '\n' at the end.
    static String getInput() {
        return "Alice would gain 54 happiness units by sitting next to Bob.\n"
                + "Alice would lose 81 happiness units by sitting next to Carol.\n"
                + "Alice would lose 42 happiness units by sitting next to David.\n"
                + "Alice would gain 89 happiness units by sitting next to Eric.\n"
                + "Alice would lose 89 happiness units by sitting next to Frank.\n"
                + "Alice would gain 97 happiness units by sitting next to George.\n"
                + "Alice would lose 94 happiness units by sitting next to Mallory.\n"
                + "Bob would gain 3 happiness units by sitting next to Alice.\n"
                + "Bob would lose 70 happiness units by sitting next to Carol.\n"
                + "Bob would lose 31 happiness units by sitting next to David.\n"
                + "Bob would gain 72 happiness units by sitting next to Eric.\n"
                + "Bob would lose 25 happiness units by sitting next to Frank.\n"
                + "Bob would lose 95 happiness units by sitting next to George.\n"
                + "Bob would gain 11 happiness units by sitting next to Mallory.\n"
                + "Carol would lose 83 happiness units by sitting next to Alice.\n"
                + "Carol would gain 8 happiness units by sitting next to Bob.\n"
                + "Carol would gain 35 happiness units by sitting next to David.\n"
                + "Carol would gain 10 happiness units by sitting next to Eric.\n"
                + "Carol would gain 61 happiness units by sitting next to Frank.\n"
                + "Carol would gain 10 happiness units by sitting next to George.\n"
                + "Carol would gain 29 happiness units by sitting next to Mallory.\n"
                + "David would gain 67 happiness units by sitting next to Alice.\n"
                + "David would gain 25 happiness units by sitting next to Bob.\n"
                + "David would gain 48 happiness units by sitting next to Carol.\n"
                + "David would lose 65 happiness units by sitting next to Eric.\n"
                + "David would gain 8 happiness units by sitting next to Frank.\n"
                + "David would gain 84 happiness units by sitting next to George.\n"
                + "David would gain 9 happiness units by sitting next to Mallory.\n"
                + "Eric would lose 51 happiness units by sitting next to Alice.\n"
                + "Eric would lose 39 happiness units by sitting next to Bob.\n"
                + "Eric would gain 84 happiness units by sitting next to Carol.\n"
                + "Eric would lose 98 happiness units by sitting next to David.\n"
                + "Eric would lose 20 happiness units by sitting next to Frank.\n"
                + "Eric would lose 6 happiness units by sitting next to George.\n"
                + "Eric would gain 60 happiness units by sitting next to Mallory.\n"
                + "Frank would gain 51 happiness units by sitting next to Alice.\n"
                + "Frank would gain 79 happiness units by sitting next to Bob.\n"
                + "Frank would gain 88 happiness units by sitting next to Carol.\n"
                + "Frank would gain 33 happiness units by sitting next to David.\n"
                + "Frank would gain 43 happiness units by sitting next to Eric.\n"
                + "Frank would gain 77 happiness units by sitting next to George.\n"
                + "Frank would lose 3 happiness units by sitting next to Mallory.\n"
                + "George would lose 14 happiness units by sitting next to Alice.\n"
                + "George would lose 12 happiness units by sitting next to Bob.\n"
                + "George would lose 52 happiness units by sitting next to Carol.\n"
                + "George would gain 14 happiness units by sitting next to David.\n"
                + "George would lose 62 happiness units by sitting next to Eric.\n"
                + "George would lose 18 happiness units by sitting next to Frank.\n"
                + "George would lose 17 happiness units by sitting next to Mallory.\n"
                + "Mallory would lose 36 happiness units by sitting next to Alice.\n"
                + "Mallory would gain 76 happiness units by sitting next to Bob.\n"
                + "Mallory would lose 34 happiness units by sitting next to Carol.\n"
                + "Mallory would gain 37 happiness units by sitting next to David.\n"
                + "Mallory would gain 40 happiness units by sitting next to Eric.\n"
                + "Mallory would gain 18 happiness units by sitting next to Frank.\n"
                + "Mallory would gain 7 happiness units by sitting next to George.\n";
    }
}
