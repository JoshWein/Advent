/*
 * Advent9.java
 *
 * Created on Dec 22, 2015, 9:47:07 PM
 *
 *
 */
package advent9;

/**
 *
 * @author https://www.reddit.com/user/twisted_tree 
 * Comments and support for both parts added by Josh Wein
 */
import com.google.common.collect.Collections2;
import static java.lang.Integer.parseInt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Advent9 {

    // This only works if every single node is connected to every single other node
    public static void main(String[] args) {
        HashMap<String, Integer> dists = new HashMap<>();
        HashSet<String> places = new HashSet<>();
        String[] input = getInput().split("\n");
        long time = System.currentTimeMillis(); // timer
        for (String line : input) {
            // Split into:  0: Source
            //              2: Destination 
            //              4: Weight
            String[] split = line.split(" ");

            places.add(split[0]); // HashSet add() adds only if it does not exist already
            places.add(split[2]); // Adds Source and Destination if they don't already exist in HashSet

            dists.put(split[0] + split[2], parseInt(split[4])); // Creates undirected graph Source -> Destination
            dists.put(split[2] + split[0], parseInt(split[4])); // Destination -> Source
        }
        
        // Initialize minimum and maximum
        int min = (int) Double.POSITIVE_INFINITY, max = 0;
        
        for (List<String> perm : Collections2.permutations(places)) { // Gives us every permutation of visiting all places. 
            int len = 0;
            for (int i = 0; i < perm.size() - 1; i++) {
                len += dists.get(perm.get(i) + perm.get(i + 1)); // Get the weights for each leg of the trip for each permutation.
            }
            // Check if it's a new minimum
            if (len < min) {
                min = len;
            }
            // Check if it's a new maximum
            if (len > max) {
                max = len;
            }
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - time) + "ms"); // Time to complete
        System.out.println("Minimum: " + min + " Maximum: " + max);
    }

    static String getInput() {
        return "AlphaCentauri to Snowdin = 66\n"
                + "AlphaCentauri to Tambi = 28\n"
                + "AlphaCentauri to Faerun = 60\n"
                + "AlphaCentauri to Norrath = 34\n"
                + "AlphaCentauri to Straylight = 34\n"
                + "AlphaCentauri to Tristram = 3\n"
                + "AlphaCentauri to Arbre = 108\n"
                + "Snowdin to Tambi = 22\n"
                + "Snowdin to Faerun = 12\n"
                + "Snowdin to Norrath = 91\n"
                + "Snowdin to Straylight = 121\n"
                + "Snowdin to Tristram = 111\n"
                + "Snowdin to Arbre = 71\n"
                + "Tambi to Faerun = 39\n"
                + "Tambi to Norrath = 113\n"
                + "Tambi to Straylight = 130\n"
                + "Tambi to Tristram = 35\n"
                + "Tambi to Arbre = 40\n"
                + "Faerun to Norrath = 63\n"
                + "Faerun to Straylight = 21\n"
                + "Faerun to Tristram = 57\n"
                + "Faerun to Arbre = 83\n"
                + "Norrath to Straylight = 9\n"
                + "Norrath to Tristram = 50\n"
                + "Norrath to Arbre = 60\n"
                + "Straylight to Tristram = 27\n"
                + "Straylight to Arbre = 81\n"
                + "Tristram to Arbre = 90";
    }
}
