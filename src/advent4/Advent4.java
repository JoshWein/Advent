package advent4;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Josh Wein
 */
public class Advent4 {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        int i = 0;
        byte[] array;
        long a = System.currentTimeMillis();
        while(true) {   // Concat key with counter starting from 0, and hash until we get the right result
            array = md.digest("bgvyzdsv".concat(Integer.toString(i++)).getBytes()); // Put input here, store the md5 hash bytes in an array
            if(array[0] == 0 && array[1] == 0 && (array[2]>> 4 & 0xf) == 0) { // Test first two bytes and first two bits of third byte
                if(array[2] == 0) // Comment out to do part 1, test whole third byte instead of just the first half
                    break;
            }
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - a) + "ms"); // Time to complete
        System.out.println("Lowest value needed: " + (i-1));
    }
}
