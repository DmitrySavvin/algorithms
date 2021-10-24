/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomstrings;

import java.io.File;
import java.io.FileWriter;
import java.security.SecureRandom;

/**
 *
 * @author Dmitry Savvin
 */
public class RandomStrings {

    static final String AB = "abcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File outputFile = new File("C:/Users/ntcees/Desktop/output.txt");
            StringBuilder builder = new StringBuilder();
            builder.append("40000").append("\n");
            for (int i = 0; i < 40000; i++) {
                int randomSize = (int) (Math.random() * 20);
                builder.append(randomString(randomSize > 5 ? randomSize : 5)).append("\n");
            }
            FileWriter writter = new FileWriter(outputFile);
            writter.write(builder.toString());
            writter.flush();
            writter.close();
        } catch (Exception ex) {

        }

    }

}
