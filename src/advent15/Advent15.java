/*
 * Advent15.java
 *
 * Created on Dec 24, 2015, 4:22:02 PM
 *
 *
 */
package advent15;

/**
 *
 * @author Josh Wein
 */
public class Advent15 {

    public static void main(String[] args) {
        String[] input = getInput().split("\n");
        Ingredient[] ingredients = new Ingredient[input.length];
        for (int i = 0; i < input.length; i++) {
            String[] tokens = input[i].split(" ");
            ingredients[i] = new Ingredient(tokens[0], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[4]), Integer.parseInt(tokens[6]), Integer.parseInt(tokens[8]), Integer.parseInt(tokens[10]));
        }
        long time = System.currentTimeMillis(); // timer
        // Raise iterations if the results keep changing
        int iterations = 1000000, max = 0, score = 0, spoonsLeft;
        int[] spoons = new int[input.length];
        int[] scores;
        for (int i = 0; i < iterations; i++) {
            scores = new int[5];
            spoonsLeft = 100;
            for (int j = 0; j < spoons.length - 1; j++) {
                spoons[j] = (int) (Math.random() * spoonsLeft);
                spoonsLeft -= spoons[j];
            }
            spoons[spoons.length - 1] = spoonsLeft;
            for (int j = 0; j < ingredients.length; j++) {
                scores[0] += (ingredients[j].capacity * spoons[j]);
                scores[1] += (ingredients[j].durability * spoons[j]);
                scores[2] += (ingredients[j].flavor * spoons[j]);
                scores[3] += (ingredients[j].texture * spoons[j]);
                scores[4] += (ingredients[j].calories * spoons[j]);
            }
            if (scores[0] > 0 && scores[1] > 0 && scores[2] > 0 && scores[3] > 0) {
                int tScore = scores[0] * scores[1] * scores[2] * scores[3];
                if (tScore > max) {
                    if(scores[4] == 500) {
                        max = tScore;
                    }
                }
            }
        }
        System.out.println("Result: " + max);
        System.out.println("Time: " + (System.currentTimeMillis() - time) + "ms"); // Time to complete      
    }

    static class Ingredient {

        int capacity;
        int durability;
        int flavor;
        int texture;
        int calories;
        String name;

        Ingredient(String name, int capacity, int durability, int flavor, int texture, int calories) {
            this.name = name;
            this.capacity = capacity;
            this.durability = durability;
            this.flavor = flavor;
            this.texture = texture;
            this.calories = calories;
        }
    }

    static String getInput2() {
        return "Butterscotch capacity -1 durability -2 flavor 6 texture 3 calories 8\n"
                + "Cinnamon capacity 2 durability 3 flavor -2 texture -1 calories 3";
    }

    static String getInput() {
        return "Frosting capacity 4 durability -2 flavor 0 texture 0 calories 5\n"
                + "Candy capacity 0 durability 5 flavor -1 texture 0 calories 8\n"
                + "Butterscotch capacity -1 durability 0 flavor 5 texture 0 calories 6\n"
                + "Sugar capacity 0 durability 0 flavor -2 texture 2 calories 1";
    }
}
