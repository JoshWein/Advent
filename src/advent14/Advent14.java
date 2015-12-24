/*
 * Advent14.java
 *
 * Created on Dec 23, 2015, 8:34:06 PM
 *
 *
 */
package advent14;

/**
 *
 * @author Josh Wein
 */
public class Advent14 {

    public static void main(String[] args) {
        int time = 2503;
        String[] input = getInput().split("\n");
        Deer[] deer = new Deer[input.length];
        int i = 0;
        for (String line : input) {
            String[] split = line.split(" ");
            deer[i++] = new Deer(Integer.parseInt(split[3]), Integer.parseInt(split[6]), Integer.parseInt(split[13]));
        }
        runSimulation(deer, time);
    }

    static void runSimulation(Deer[] deer, int time) {
        for (int i = 0; i <= time; i++) {
            for (Deer d : deer) {
                if (d.holder == 0) {
                    if (d.status == 1) {
                        d.status = 0;
                        d.holder = d.rtime;
                    } else {
                        d.status = 1;
                        d.holder = d.ftime;
                    }
                }
                d.holder--;
                d.location += d.status == 1 ? d.speed : 0;
            }
            int track = 0, distance = 0;
            for(int j = 0; j < deer.length; j++) {
                if(deer[j].location >= distance) {
                    distance = deer[j].location;
                    track = j;
                }
            }
            ++deer[track].points;
        }
        // Shows all points unsorted
        for (Deer d : deer) {
            System.out.println("Points: " + d.points + " Distance: " + d.location);
        }
    }

    static class Deer {
        int speed, ftime, rtime, location, status, holder, points;
        Deer(int speed, int ftime, int rtime) {
            this.speed = speed;
            this.ftime = ftime;            
            this.holder = ftime;
            this.rtime = rtime;
            this.location = 0;
            this.status = 1;
            this.points = 0;
        }
    }

    static String getInput2() {
        return "Comet can fly 14 km/s for 10 seconds, but then must rest for 127 seconds.\n"
                + "Dancer can fly 16 km/s for 11 seconds, but then must rest for 162 seconds.";
    }

    static String getInput() {
        return "Vixen can fly 19 km/s for 7 seconds, but then must rest for 124 seconds.\n"
                + "Rudolph can fly 3 km/s for 15 seconds, but then must rest for 28 seconds.\n"
                + "Donner can fly 19 km/s for 9 seconds, but then must rest for 164 seconds.\n"
                + "Blitzen can fly 19 km/s for 9 seconds, but then must rest for 158 seconds.\n"
                + "Comet can fly 13 km/s for 7 seconds, but then must rest for 82 seconds.\n"
                + "Cupid can fly 25 km/s for 6 seconds, but then must rest for 145 seconds.\n"
                + "Dasher can fly 14 km/s for 3 seconds, but then must rest for 38 seconds.\n"
                + "Dancer can fly 3 km/s for 16 seconds, but then must rest for 37 seconds.\n"
                + "Prancer can fly 25 km/s for 6 seconds, but then must rest for 143 seconds.";
    }
}
