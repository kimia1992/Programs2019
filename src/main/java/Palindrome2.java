//https://leetcode.com/problems/valid-palindrome-ii/
public class Palindrome2 {
    public boolean validPalindrome(String s) {
        if(checkPalindrome(s))
            return true;
        for(int i=0;i<s.length();i++)
        {
            String word = s.replace(Character.toString(s.charAt(i)),"");
            if(checkPalindrome(word))
            {
                return true;
            }
        }
        return false;
    }

    public boolean checkPalindrome(String word)
    {
        int i=0;
        int j=word.length()-1;
        while(i<=j)
        {
            if(word.charAt(i)!=word.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
