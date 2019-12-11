//https://leetcode.com/problems/longest-common-prefix/
//https://www.youtube.com/watch?v=MD4jY5sFGzw&t=208s
//else break is very important in while loop
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null)
            return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++)
        {
            String current = strs[i];
            int j=0;
            while(j<current.length()&&j<prefix.length()) {
                if (current.charAt(j) == prefix.charAt(j)) {
                    j++;
                }
                else
                    break;
            }
            if(j==0)
                return "";

            prefix=current.substring(0,j);

        }
        return prefix;

    }
}
