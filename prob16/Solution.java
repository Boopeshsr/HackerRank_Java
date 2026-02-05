package prob16;

import java.util.Scanner;

public class Solution {

static boolean isAnagram(String a, String b) {
    // 1. Length check
    if (a.length() != b.length()) {
        return false;
    }

    // 2. Normalize to lowercase
    a = a.toLowerCase();
    b = b.toLowerCase();

    // 3. Create a frequency map (26 letters in the alphabet)
    int[] frequencies = new int[26];

    for (int i = 0; i < a.length(); i++) {
        // Increment for string a
        frequencies[a.charAt(i) - 'a']++;
        // Decrement for string b
        frequencies[b.charAt(i) - 'a']--;
    }

    // 4. Check if all frequencies are zero
    for (int count : frequencies) {
        if (count != 0) {
            return false;
        }
    }

    return true;
}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}