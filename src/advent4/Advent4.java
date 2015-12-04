/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advent4;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Josh
 */
public class Advent4 {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        int i =0;
        StringBuilder sb = new StringBuilder();
        sb.append("11111111");
        String test = "11111111111";
        byte[] array;
        while(!sb.substring(0, 6).equals("000000")) {
            sb = new StringBuilder();
            test = "bgvyzdsv".concat(Integer.toString(i++));
            array = md.digest(test.getBytes());
            for (int j = 0; j < array.length; ++j) {
                sb.append(Integer.toHexString((array[j] & 0xFF) | 0x100).substring(1, 3));
            }
        }
        System.out.println(sb);
        System.out.println("Lowest value needed: " + (i-1));
    }
}
