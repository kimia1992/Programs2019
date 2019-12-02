//https://leetcode.com/problems/implement-strstr/
public class Haystack {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
            return haystack.indexOf(needle);
        else
            return -1;
    }
}
