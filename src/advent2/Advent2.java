/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advent2;

import java.util.Arrays;

/**
 *
 * @author josh
 */
public class Advent2 {
      public static void main(String[] args) {
        String[] input = getInput().split("\\n");
        int total = 0;
        int bowLength = 0;
        for(String a : input) {
            String[] line = a.split("x");
            int[] dimensions = new int[3];
            dimensions[0] = Integer.parseInt(line[0]);
            dimensions[1] = Integer.parseInt(line[1]);
            dimensions[2] = Integer.parseInt(line[2]);
            System.out.println(a);
            int[] tokens = new int[3];
            tokens[0] = dimensions[0] * dimensions[1];
            tokens[1] = dimensions[1] * dimensions[2];
            tokens[2] = dimensions[2] * dimensions[0];
            total += (2 * tokens[0]) + (2 * tokens[1]) + (2 * tokens[2]) + Math.min(Math.min(tokens[0], tokens[1]), tokens[2]);
            bowLength += (dimensions[0] * dimensions[1] * dimensions[2]);            
            Arrays.sort(dimensions);
            bowLength += (dimensions[0]+dimensions[0]) + (dimensions[1]+ dimensions[1]);
            System.out.println(bowLength);
        }
        System.out.println("Wrapping papper needed: " + total + " sq. ft");
        System.out.println("Ribbon needed: " + bowLength + " sq. ft");
    }
    public static String getInput() {
        return "4x23x21\n" +
        "22x29x19\n" +
        "11x4x11\n" +
        "8x10x5\n" +
        "24x18x16\n" +
        "11x25x22\n" +
        "2x13x20\n" +
        "24x15x14\n" +
        "14x22x2\n" +
        "30x7x3\n" +
        "30x22x25\n" +
        "29x9x9\n" +
        "29x29x26\n" +
        "14x3x16\n" +
        "1x10x26\n" +
        "29x2x30\n" +
        "30x10x25\n" +
        "10x26x20\n" +
        "1x2x18\n" +
        "25x18x5\n" +
        "21x3x24\n" +
        "2x5x7\n" +
        "22x11x21\n" +
        "11x8x8\n" +
        "16x18x2\n" +
        "13x3x8\n" +
        "1x16x19\n" +
        "19x16x12\n" +
        "21x15x1\n" +
        "29x9x4\n" +
        "27x10x8\n" +
        "2x7x27\n" +
        "2x20x23\n" +
        "24x11x5\n" +
        "2x8x27\n" +
        "10x28x10\n" +
        "24x11x10\n" +
        "19x2x12\n" +
        "27x5x10\n" +
        "1x14x25\n" +
        "5x14x30\n" +
        "15x26x12\n" +
        "23x20x22\n" +
        "5x12x1\n" +
        "9x26x9\n" +
        "23x25x5\n" +
        "28x16x19\n" +
        "17x23x17\n" +
        "2x27x20\n" +
        "18x27x13\n" +
        "16x7x18\n" +
        "22x7x29\n" +
        "17x28x6\n" +
        "9x22x17\n" +
        "10x5x6\n" +
        "14x2x12\n" +
        "25x5x6\n" +
        "26x9x10\n" +
        "19x21x6\n" +
        "19x4x27\n" +
        "23x16x14\n" +
        "21x17x29\n" +
        "24x18x10\n" +
        "7x19x6\n" +
        "14x15x10\n" +
        "9x10x19\n" +
        "20x18x4\n" +
        "11x14x8\n" +
        "30x15x9\n" +
        "25x12x24\n" +
        "3x12x5\n" +
        "12x21x28\n" +
        "8x23x10\n" +
        "18x26x8\n" +
        "17x1x8\n" +
        "2x29x15\n" +
        "3x13x28\n" +
        "23x20x11\n" +
        "27x25x6\n" +
        "19x21x3\n" +
        "30x22x27\n" +
        "28x24x4\n" +
        "26x18x21\n" +
        "11x7x16\n" +
        "22x27x6\n" +
        "27x5x26\n" +
        "4x10x4\n" +
        "4x2x27\n" +
        "2x3x26\n" +
        "26x29x19\n" +
        "30x26x24\n" +
        "8x25x12\n" +
        "16x17x5\n" +
        "13x2x3\n" +
        "1x30x22\n" +
        "20x9x1\n" +
        "24x26x19\n" +
        "26x18x1\n" +
        "18x29x24\n" +
        "1x6x9\n" +
        "20x27x2\n" +
        "3x22x21\n" +
        "4x16x8\n" +
        "29x18x16\n" +
        "7x16x23\n" +
        "13x8x14\n" +
        "19x25x10\n" +
        "23x29x6\n" +
        "23x21x1\n" +
        "22x26x10\n" +
        "14x4x2\n" +
        "18x29x17\n" +
        "9x4x18\n" +
        "7x22x9\n" +
        "19x5x26\n" +
        "27x29x19\n" +
        "7x13x14\n" +
        "19x10x1\n" +
        "6x22x3\n" +
        "12x21x5\n" +
        "24x20x12\n" +
        "28x2x11\n" +
        "16x18x23\n" +
        "2x13x25\n" +
        "11x7x17\n" +
        "27x21x4\n" +
        "2x10x25\n" +
        "22x16x17\n" +
        "23x22x15\n" +
        "17x13x13\n" +
        "23x24x26\n" +
        "27x18x24\n" +
        "24x7x28\n" +
        "30x12x15\n" +
        "14x28x19\n" +
        "2x15x29\n" +
        "12x13x5\n" +
        "17x22x21\n" +
        "27x10x27\n" +
        "17x6x25\n" +
        "22x2x1\n" +
        "1x10x9\n" +
        "9x7x2\n" +
        "30x28x3\n" +
        "28x11x10\n" +
        "8x23x15\n" +
        "23x4x20\n" +
        "12x5x4\n" +
        "13x17x14\n" +
        "28x11x2\n" +
        "21x11x29\n" +
        "10x23x22\n" +
        "27x23x14\n" +
        "7x15x23\n" +
        "20x2x13\n" +
        "8x21x4\n" +
        "10x20x11\n" +
        "23x28x11\n" +
        "21x22x25\n" +
        "23x11x17\n" +
        "2x29x10\n" +
        "28x16x5\n" +
        "30x26x10\n" +
        "17x24x16\n" +
        "26x27x25\n" +
        "14x13x25\n" +
        "22x27x5\n" +
        "24x15x12\n" +
        "5x21x25\n" +
        "4x27x1\n" +
        "25x4x10\n" +
        "15x13x1\n" +
        "21x23x7\n" +
        "8x3x4\n" +
        "10x5x7\n" +
        "9x13x30\n" +
        "2x2x30\n" +
        "26x4x29\n" +
        "5x14x14\n" +
        "2x27x9\n" +
        "22x16x1\n" +
        "4x23x5\n" +
        "13x7x26\n" +
        "2x12x10\n" +
        "12x7x22\n" +
        "26x30x26\n" +
        "28x16x28\n" +
        "15x19x11\n" +
        "4x18x1\n" +
        "20x14x24\n" +
        "6x10x22\n" +
        "9x20x3\n" +
        "14x9x27\n" +
        "26x17x9\n" +
        "10x30x28\n" +
        "6x3x29\n" +
        "4x16x28\n" +
        "8x24x11\n" +
        "23x10x1\n" +
        "11x7x7\n" +
        "29x6x15\n" +
        "13x25x12\n" +
        "29x14x3\n" +
        "26x22x21\n" +
        "8x3x11\n" +
        "27x13x25\n" +
        "27x6x2\n" +
        "8x11x7\n" +
        "25x12x9\n" +
        "24x30x12\n" +
        "13x1x30\n" +
        "25x23x16\n" +
        "9x13x29\n" +
        "29x26x16\n" +
        "11x15x9\n" +
        "11x23x6\n" +
        "15x27x28\n" +
        "27x24x21\n" +
        "6x24x1\n" +
        "25x25x5\n" +
        "11x1x26\n" +
        "21x4x24\n" +
        "10x5x12\n" +
        "4x30x13\n" +
        "24x22x5\n" +
        "26x7x21\n" +
        "23x3x17\n" +
        "22x18x2\n" +
        "25x1x14\n" +
        "23x25x30\n" +
        "8x7x7\n" +
        "30x19x8\n" +
        "17x6x15\n" +
        "2x11x20\n" +
        "8x3x22\n" +
        "23x14x26\n" +
        "8x22x25\n" +
        "27x1x2\n" +
        "10x26x2\n" +
        "28x30x7\n" +
        "5x30x7\n" +
        "27x16x30\n" +
        "28x29x1\n" +
        "8x25x18\n" +
        "20x12x29\n" +
        "9x19x9\n" +
        "7x25x15\n" +
        "25x18x18\n" +
        "11x8x2\n" +
        "4x20x6\n" +
        "18x5x20\n" +
        "2x3x29\n" +
        "25x26x22\n" +
        "18x25x26\n" +
        "9x12x16\n" +
        "18x7x27\n" +
        "17x20x9\n" +
        "6x29x26\n" +
        "17x7x19\n" +
        "21x7x5\n" +
        "29x15x12\n" +
        "22x4x1\n" +
        "11x12x11\n" +
        "26x30x4\n" +
        "12x24x13\n" +
        "13x8x3\n" +
        "26x25x3\n" +
        "21x26x10\n" +
        "14x9x26\n" +
        "20x1x7\n" +
        "11x12x3\n" +
        "12x11x4\n" +
        "11x15x30\n" +
        "17x6x25\n" +
        "20x22x3\n" +
        "1x16x17\n" +
        "11x5x20\n" +
        "12x12x7\n" +
        "2x14x10\n" +
        "14x27x3\n" +
        "14x16x18\n" +
        "21x28x24\n" +
        "14x20x1\n" +
        "29x14x1\n" +
        "10x10x9\n" +
        "25x23x4\n" +
        "17x15x14\n" +
        "9x20x26\n" +
        "16x2x17\n" +
        "13x28x25\n" +
        "16x1x11\n" +
        "19x16x8\n" +
        "20x21x2\n" +
        "27x9x22\n" +
        "24x18x3\n" +
        "23x30x6\n" +
        "4x18x3\n" +
        "30x15x8\n" +
        "27x20x19\n" +
        "28x29x26\n" +
        "2x21x18\n" +
        "1x23x30\n" +
        "1x9x12\n" +
        "4x11x30\n" +
        "1x28x4\n" +
        "17x10x10\n" +
        "12x14x6\n" +
        "8x9x24\n" +
        "8x3x3\n" +
        "29x8x20\n" +
        "26x29x2\n" +
        "29x25x25\n" +
        "11x17x23\n" +
        "6x30x21\n" +
        "13x18x29\n" +
        "2x10x8\n" +
        "29x29x27\n" +
        "27x15x15\n" +
        "16x17x30\n" +
        "3x3x22\n" +
        "21x12x6\n" +
        "22x1x5\n" +
        "30x8x20\n" +
        "6x28x13\n" +
        "11x2x23\n" +
        "14x18x27\n" +
        "6x26x13\n" +
        "10x24x24\n" +
        "4x24x6\n" +
        "20x8x3\n" +
        "23x11x5\n" +
        "29x5x24\n" +
        "14x15x22\n" +
        "21x17x13\n" +
        "10x10x8\n" +
        "1x11x23\n" +
        "21x19x24\n" +
        "19x9x13\n" +
        "21x26x28\n" +
        "25x11x28\n" +
        "2x17x1\n" +
        "18x9x8\n" +
        "5x21x6\n" +
        "12x5x2\n" +
        "23x8x15\n" +
        "30x16x24\n" +
        "7x9x27\n" +
        "16x30x7\n" +
        "2x21x28\n" +
        "5x10x6\n" +
        "8x7x1\n" +
        "28x13x5\n" +
        "11x5x14\n" +
        "26x22x29\n" +
        "23x15x13\n" +
        "14x2x16\n" +
        "22x21x9\n" +
        "4x20x3\n" +
        "18x17x19\n" +
        "12x7x9\n" +
        "6x12x25\n" +
        "3x30x27\n" +
        "8x19x22\n" +
        "1x9x27\n" +
        "23x20x12\n" +
        "14x7x29\n" +
        "9x12x12\n" +
        "30x2x6\n" +
        "15x7x16\n" +
        "19x13x18\n" +
        "11x8x13\n" +
        "16x5x3\n" +
        "19x26x24\n" +
        "26x8x21\n" +
        "21x20x7\n" +
        "15x1x25\n" +
        "29x15x21\n" +
        "22x17x7\n" +
        "16x17x10\n" +
        "6x12x24\n" +
        "8x13x27\n" +
        "30x25x14\n" +
        "25x7x10\n" +
        "15x2x2\n" +
        "18x15x19\n" +
        "18x13x24\n" +
        "19x30x1\n" +
        "17x1x3\n" +
        "26x21x15\n" +
        "10x10x18\n" +
        "9x16x6\n" +
        "29x7x30\n" +
        "11x10x30\n" +
        "6x11x2\n" +
        "7x29x23\n" +
        "13x2x30\n" +
        "25x27x13\n" +
        "5x15x21\n" +
        "4x8x30\n" +
        "15x27x11\n" +
        "27x1x6\n" +
        "2x24x11\n" +
        "16x20x19\n" +
        "25x28x20\n" +
        "6x8x4\n" +
        "27x16x11\n" +
        "1x5x27\n" +
        "12x19x26\n" +
        "18x24x14\n" +
        "4x25x17\n" +
        "24x24x26\n" +
        "28x3x18\n" +
        "8x20x28\n" +
        "22x7x21\n" +
        "24x5x28\n" +
        "23x30x29\n" +
        "25x16x27\n" +
        "28x10x30\n" +
        "9x2x4\n" +
        "30x2x23\n" +
        "21x9x23\n" +
        "27x4x26\n" +
        "2x23x16\n" +
        "24x26x30\n" +
        "26x1x30\n" +
        "10x4x28\n" +
        "11x29x12\n" +
        "28x13x30\n" +
        "24x10x28\n" +
        "8x12x12\n" +
        "19x27x11\n" +
        "11x28x7\n" +
        "14x6x3\n" +
        "6x27x5\n" +
        "6x17x14\n" +
        "24x24x17\n" +
        "18x23x14\n" +
        "17x5x7\n" +
        "11x4x23\n" +
        "5x1x17\n" +
        "26x15x24\n" +
        "3x9x24\n" +
        "5x3x15\n" +
        "5x20x19\n" +
        "5x21x2\n" +
        "13x5x30\n" +
        "19x6x24\n" +
        "19x17x6\n" +
        "23x7x13\n" +
        "28x23x13\n" +
        "9x1x6\n" +
        "15x12x16\n" +
        "21x19x9\n" +
        "25x5x5\n" +
        "9x7x9\n" +
        "6x5x8\n" +
        "3x11x18\n" +
        "23x25x11\n" +
        "25x4x6\n" +
        "4x27x1\n" +
        "4x3x3\n" +
        "30x11x5\n" +
        "9x17x12\n" +
        "15x6x24\n" +
        "10x22x15\n" +
        "29x27x9\n" +
        "20x21x11\n" +
        "18x10x5\n" +
        "11x2x2\n" +
        "9x8x8\n" +
        "1x26x21\n" +
        "11x11x16\n" +
        "2x18x30\n" +
        "29x27x24\n" +
        "27x8x18\n" +
        "19x3x17\n" +
        "30x21x26\n" +
        "25x13x25\n" +
        "20x22x1\n" +
        "10x1x12\n" +
        "11x17x15\n" +
        "29x11x30\n" +
        "17x30x27\n" +
        "21x22x17\n" +
        "13x6x22\n" +
        "22x16x12\n" +
        "27x18x19\n" +
        "4x13x6\n" +
        "27x29x10\n" +
        "3x23x10\n" +
        "26x16x24\n" +
        "18x26x20\n" +
        "11x28x16\n" +
        "21x6x15\n" +
        "9x26x17\n" +
        "8x15x8\n" +
        "3x7x10\n" +
        "2x28x8\n" +
        "1x2x24\n" +
        "7x8x9\n" +
        "19x4x22\n" +
        "11x20x9\n" +
        "12x22x16\n" +
        "26x8x19\n" +
        "13x28x24\n" +
        "4x10x16\n" +
        "12x8x10\n" +
        "14x24x24\n" +
        "19x19x28\n" +
        "29x1x15\n" +
        "10x5x14\n" +
        "20x19x23\n" +
        "10x7x12\n" +
        "1x7x13\n" +
        "5x12x13\n" +
        "25x21x8\n" +
        "22x28x8\n" +
        "7x9x4\n" +
        "3x20x15\n" +
        "15x27x19\n" +
        "18x24x12\n" +
        "16x10x16\n" +
        "22x19x8\n" +
        "15x4x3\n" +
        "9x30x25\n" +
        "1x1x6\n" +
        "24x4x25\n" +
        "13x18x29\n" +
        "10x2x8\n" +
        "21x1x17\n" +
        "29x14x22\n" +
        "17x29x11\n" +
        "10x27x16\n" +
        "25x16x15\n" +
        "14x2x17\n" +
        "12x27x3\n" +
        "14x17x25\n" +
        "24x4x1\n" +
        "18x28x18\n" +
        "9x14x26\n" +
        "28x24x17\n" +
        "1x26x12\n" +
        "2x18x20\n" +
        "12x19x22\n" +
        "19x25x20\n" +
        "5x17x27\n" +
        "17x29x16\n" +
        "29x19x11\n" +
        "16x2x4\n" +
        "23x24x1\n" +
        "19x18x3\n" +
        "28x14x6\n" +
        "18x5x23\n" +
        "9x24x12\n" +
        "15x4x6\n" +
        "15x7x24\n" +
        "22x15x8\n" +
        "22x1x22\n" +
        "6x4x22\n" +
        "26x1x30\n" +
        "8x21x27\n" +
        "7x1x11\n" +
        "9x8x18\n" +
        "20x27x12\n" +
        "26x23x20\n" +
        "26x22x30\n" +
        "24x3x16\n" +
        "8x24x28\n" +
        "13x28x5\n" +
        "4x29x23\n" +
        "22x5x8\n" +
        "20x22x3\n" +
        "9x9x17\n" +
        "28x3x30\n" +
        "10x13x10\n" +
        "10x25x13\n" +
        "9x20x3\n" +
        "1x21x25\n" +
        "24x21x15\n" +
        "21x5x14\n" +
        "13x8x20\n" +
        "29x17x3\n" +
        "5x17x28\n" +
        "16x12x7\n" +
        "23x1x24\n" +
        "4x24x29\n" +
        "23x25x14\n" +
        "8x27x2\n" +
        "23x11x13\n" +
        "13x4x5\n" +
        "24x1x26\n" +
        "21x1x23\n" +
        "10x12x12\n" +
        "21x29x25\n" +
        "27x25x30\n" +
        "24x23x4\n" +
        "1x30x23\n" +
        "29x28x14\n" +
        "4x11x30\n" +
        "9x25x10\n" +
        "17x11x6\n" +
        "14x29x30\n" +
        "23x5x5\n" +
        "25x18x21\n" +
        "8x7x1\n" +
        "27x11x3\n" +
        "5x10x8\n" +
        "11x1x11\n" +
        "16x17x26\n" +
        "15x22x19\n" +
        "16x9x6\n" +
        "18x13x27\n" +
        "26x4x22\n" +
        "1x20x21\n" +
        "6x14x29\n" +
        "11x7x6\n" +
        "1x23x7\n" +
        "12x19x13\n" +
        "18x21x25\n" +
        "15x17x20\n" +
        "23x8x9\n" +
        "15x9x26\n" +
        "9x12x9\n" +
        "12x13x14\n" +
        "27x26x7\n" +
        "11x19x22\n" +
        "16x12x21\n" +
        "10x30x28\n" +
        "21x2x7\n" +
        "12x9x18\n" +
        "7x17x14\n" +
        "13x17x17\n" +
        "3x21x10\n" +
        "30x9x15\n" +
        "2x8x15\n" +
        "15x12x10\n" +
        "23x26x9\n" +
        "29x30x10\n" +
        "30x22x17\n" +
        "17x26x30\n" +
        "27x26x20\n" +
        "17x28x17\n" +
        "30x12x16\n" +
        "7x23x15\n" +
        "30x15x19\n" +
        "13x19x10\n" +
        "22x10x4\n" +
        "17x23x10\n" +
        "2x28x18\n" +
        "27x21x28\n" +
        "24x26x5\n" +
        "6x23x25\n" +
        "17x4x16\n" +
        "14x1x13\n" +
        "23x21x11\n" +
        "14x15x30\n" +
        "26x13x10\n" +
        "30x19x25\n" +
        "26x6x26\n" +
        "9x16x29\n" +
        "15x2x24\n" +
        "13x3x20\n" +
        "23x12x30\n" +
        "22x23x23\n" +
        "8x21x2\n" +
        "18x28x5\n" +
        "21x27x14\n" +
        "29x28x23\n" +
        "12x30x28\n" +
        "17x16x3\n" +
        "5x19x11\n" +
        "28x22x22\n" +
        "1x4x28\n" +
        "10x10x14\n" +
        "18x15x7\n" +
        "18x11x1\n" +
        "12x7x16\n" +
        "10x22x24\n" +
        "27x25x6\n" +
        "19x29x25\n" +
        "10x1x26\n" +
        "26x27x30\n" +
        "4x23x19\n" +
        "24x19x4\n" +
        "21x11x14\n" +
        "4x13x27\n" +
        "9x1x11\n" +
        "16x20x8\n" +
        "4x3x11\n" +
        "1x16x12\n" +
        "14x6x30\n" +
        "8x1x10\n" +
        "11x18x7\n" +
        "29x28x30\n" +
        "4x21x8\n" +
        "3x21x4\n" +
        "6x1x5\n" +
        "26x18x3\n" +
        "28x27x27\n" +
        "17x3x12\n" +
        "6x1x22\n" +
        "23x12x28\n" +
        "12x13x2\n" +
        "11x2x13\n" +
        "7x1x28\n" +
        "27x6x25\n" +
        "14x14x3\n" +
        "14x11x20\n" +
        "2x27x7\n" +
        "22x24x23\n" +
        "7x15x20\n" +
        "30x6x17\n" +
        "20x23x25\n" +
        "18x16x27\n" +
        "2x9x6\n" +
        "9x18x19\n" +
        "20x11x22\n" +
        "11x16x19\n" +
        "14x29x23\n" +
        "14x9x20\n" +
        "8x10x12\n" +
        "18x17x6\n" +
        "28x7x16\n" +
        "12x19x28\n" +
        "5x3x16\n" +
        "1x25x10\n" +
        "4x14x10\n" +
        "9x6x3\n" +
        "15x27x28\n" +
        "13x26x14\n" +
        "21x8x25\n" +
        "29x10x20\n" +
        "14x26x30\n" +
        "25x13x28\n" +
        "1x15x23\n" +
        "6x20x21\n" +
        "18x2x1\n" +
        "22x25x16\n" +
        "23x25x17\n" +
        "2x14x21\n" +
        "14x25x16\n" +
        "12x17x6\n" +
        "19x29x15\n" +
        "25x9x6\n" +
        "19x17x13\n" +
        "24x22x5\n" +
        "19x4x13\n" +
        "10x18x6\n" +
        "6x25x6\n" +
        "23x24x20\n" +
        "8x22x13\n" +
        "25x10x29\n" +
        "5x12x25\n" +
        "20x5x11\n" +
        "7x16x29\n" +
        "29x24x22\n" +
        "28x20x1\n" +
        "10x27x10\n" +
        "6x9x27\n" +
        "26x15x30\n" +
        "26x3x19\n" +
        "20x11x3\n" +
        "26x1x29\n" +
        "6x23x4\n" +
        "6x13x21\n" +
        "9x23x25\n" +
        "15x1x10\n" +
        "29x12x13\n" +
        "7x8x24\n" +
        "29x30x27\n" +
        "3x29x19\n" +
        "14x16x17\n" +
        "4x8x27\n" +
        "26x17x8\n" +
        "10x27x17\n" +
        "11x28x17\n" +
        "17x16x27\n" +
        "1x8x22\n" +
        "6x30x16\n" +
        "7x30x22\n" +
        "20x12x3\n" +
        "18x10x2\n" +
        "20x21x26\n" +
        "11x1x17\n" +
        "9x15x15\n" +
        "19x14x30\n" +
        "24x22x20\n" +
        "11x26x23\n" +
        "14x3x23\n" +
        "1x28x29\n" +
        "29x20x4\n" +
        "1x4x20\n" +
        "12x26x8\n" +
        "14x11x14\n" +
        "14x19x13\n" +
        "15x13x24\n" +
        "16x7x26\n" +
        "11x20x11\n" +
        "5x24x26\n" +
        "24x25x7\n" +
        "21x3x14\n" +
        "24x29x20\n" +
        "7x12x1\n" +
        "16x17x4\n" +
        "29x16x21\n" +
        "28x8x17\n" +
        "11x30x25\n" +
        "1x26x23\n" +
        "25x19x28\n" +
        "30x24x5\n" +
        "26x29x15\n" +
        "4x25x23\n" +
        "14x25x19\n" +
        "29x10x7\n" +
        "29x29x28\n" +
        "19x13x24\n" +
        "21x28x5\n" +
        "8x15x24\n" +
        "1x10x12\n" +
        "2x26x6\n" +
        "14x14x4\n" +
        "10x16x27\n" +
        "9x17x25\n" +
        "25x8x7\n" +
        "1x9x28\n" +
        "10x8x17\n" +
        "4x12x1\n" +
        "17x26x29\n" +
        "23x12x26\n" +
        "2x21x22\n" +
        "18x23x13\n" +
        "1x14x5\n" +
        "25x27x26\n" +
        "4x30x30\n" +
        "5x13x2\n" +
        "17x9x6\n" +
        "28x18x28\n" +
        "7x30x2\n" +
        "28x22x17\n" +
        "14x15x14\n" +
        "10x14x19\n" +
        "6x15x22\n" +
        "27x4x17\n" +
        "28x21x6\n" +
        "19x29x26\n" +
        "6x17x17\n" +
        "20x13x16\n" +
        "25x4x1\n" +
        "2x9x5\n" +
        "30x3x1\n" +
        "24x21x2\n" +
        "14x19x12\n" +
        "22x5x23\n" +
        "14x4x21\n" +
        "10x2x17\n" +
        "3x14x10\n" +
        "17x5x3\n" +
        "22x17x13\n" +
        "5x19x3\n" +
        "29x22x6\n" +
        "12x28x3\n" +
        "9x21x25\n" +
        "10x2x14\n" +
        "13x26x7\n" +
        "18x23x2\n" +
        "9x14x17\n" +
        "21x3x13\n" +
        "13x23x9\n" +
        "1x20x4\n" +
        "11x4x1\n" +
        "19x5x30\n" +
        "9x9x29\n" +
        "26x29x14\n" +
        "1x4x10\n" +
        "7x27x30\n" +
        "8x3x23\n" +
        "1x27x27\n" +
        "7x27x27\n" +
        "1x26x16\n" +
        "29x16x14\n" +
        "18x6x12\n" +
        "24x24x24\n" +
        "26x2x19\n" +
        "15x17x4\n" +
        "11x7x14\n" +
        "14x19x10\n" +
        "9x10x1\n" +
        "14x17x9\n" +
        "20x19x13\n" +
        "25x20x8\n" +
        "24x20x21\n" +
        "26x30x2\n" +
        "24x2x10\n" +
        "28x4x13\n" +
        "27x17x11\n" +
        "15x3x8\n" +
        "11x29x10\n" +
        "26x15x16\n" +
        "4x28x22\n" +
        "7x5x22\n" +
        "10x28x9\n" +
        "6x28x13\n" +
        "10x5x6\n" +
        "20x12x6\n" +
        "25x30x30\n" +
        "17x16x14\n" +
        "14x20x3\n" +
        "16x10x8\n" +
        "9x28x14\n" +
        "16x12x12\n" +
        "11x13x25\n" +
        "21x16x28\n" +
        "10x3x18\n" +
        "5x9x20\n" +
        "17x23x5\n" +
        "3x13x16\n" +
        "29x30x17\n" +
        "2x2x8\n" +
        "15x8x30\n" +
        "20x1x16\n" +
        "23x10x29\n" +
        "4x5x4\n" +
        "6x18x12\n" +
        "26x10x22\n" +
        "21x10x17\n" +
        "26x12x29\n" +
        "7x20x21\n" +
        "18x9x15\n" +
        "10x23x20\n" +
        "20x1x27\n" +
        "10x10x3\n" +
        "25x12x23\n" +
        "30x11x15\n" +
        "16x22x3\n" +
        "22x10x11\n" +
        "15x10x20\n" +
        "2x20x17\n" +
        "20x20x1\n" +
        "24x16x4\n" +
        "23x27x7\n" +
        "7x27x22\n" +
        "24x16x8\n" +
        "20x11x25\n" +
        "30x28x11\n" +
        "21x6x24\n" +
        "15x2x9\n" +
        "16x30x24\n" +
        "21x27x9\n" +
        "7x19x8\n" +
        "24x13x28\n" +
        "12x26x28\n" +
        "16x21x11\n" +
        "25x5x13\n" +
        "23x3x17\n" +
        "23x1x17\n" +
        "4x17x18\n" +
        "17x13x18\n" +
        "25x12x19\n" +
        "17x4x19\n" +
        "4x21x26\n" +
        "6x28x1\n" +
        "23x22x15\n" +
        "6x23x12\n" +
        "21x17x9\n" +
        "30x4x23\n" +
        "2x19x21\n" +
        "28x24x7\n" +
        "19x24x14\n" +
        "13x20x26\n" +
        "19x24x29\n" +
        "8x26x3\n" +
        "16x12x14\n" +
        "17x4x21\n" +
        "8x4x20\n" +
        "13x27x17\n" +
        "9x21x1\n" +
        "29x25x6\n" +
        "7x9x26\n" +
        "13x25x5\n" +
        "6x9x21\n" +
        "12x10x11\n" +
        "30x28x21\n" +
        "15x6x2\n" +
        "8x18x19\n" +
        "26x20x24\n" +
        "26x17x14\n" +
        "27x8x1\n" +
        "19x19x18\n" +
        "25x24x27\n" +
        "14x29x15\n" +
        "22x26x1\n" +
        "14x17x9\n" +
        "2x6x23\n" +
        "29x7x5\n" +
        "14x16x19\n" +
        "14x21x18\n" +
        "10x15x23\n" +
        "21x29x14\n" +
        "20x29x30\n" +
        "23x11x5";
    }
}