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
        int i =0;
        byte[] array;
        while(true) {
            array = md.digest("bgvyzdsv".concat(Integer.toString(i++)).getBytes()); // Put input here
            if(array[0] == 0 && array[1] == 0 && (array[2]>> 4 & 0xf) == 0) {
                if(array[2] == 0) // Comment out to do part 1.
                    break;
            }
        }
        System.out.println("Lowest value needed: " + (i-1));
    }
}
