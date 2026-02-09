package prob20;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        // 1. Regex to match repeated words and their subsequent occurrences
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        
        // 2. Compile using the Case-Insensitive flag
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // 3. Find and replace matches
            while (m.find()) {
                // Replaces the whole repeated sequence with just the first occurrence
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            System.out.println(input);
        }
        
        in.close();
    }
}