package advent1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Josh Wein
 */
public class Advent1 {
    public static void main(String[] args) {
       File file = new File("advent1.txt");
       String content;
        try {
            content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));          
            int answer = 0;
            for(int i = 0; i < content.length(); i++) {
                answer+= content.charAt(i) == '(' ? 1 : -1; // Calculate final floor
                if(answer == -1)
                    System.out.println("First -1 at pos: " + (i+1)); // first print is the first -1 ignore rest
            }
            System.out.println(answer);
        } catch (IOException ex) {
            System.out.println("Load file fail");
        }
    }    
}
