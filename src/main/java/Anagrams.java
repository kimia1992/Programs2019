//https://leetcode.com/problems/valid-anagram/
//https://www.youtube.com/watch?v=oHwDqfz1LGw&list=PLi9RQVmJD2fYckvJZSKA4YcUQ4eyNupuY
//remember new String(arr) to convert arr to Strin
import java.util.Arrays;

public class Anagrams {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char schararr[]=s.toCharArray();
        char tchararr[]=t.toCharArray();
        Arrays.sort(schararr);
        Arrays.sort(tchararr);
        if(new String(schararr).equals(new String(tchararr)))
            return true;
        else
            return false;
    }
}
