//https://www.techiedelight.com/check-string-contains-alphanumeric-characters-java/
//https://leetcode.com/problems/valid-palindrome/submissions/
//learning: check if alphanumeric
import java.util.Stack;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        char[] charString = s.toCharArray();
        StringBuilder stbr = new StringBuilder();
        for(int i=0;i<charString.length;i++)
        {
            if(charString[i]>='A'&&charString[i]<='Z'||charString[i]>='a'&&charString[i]<='z'||charString[i]>='0'&&charString[i]<='9')
            {
                stbr.append(Character.toString(charString[i]));
            }
        }
        Stack<Character> stck = new Stack<Character>();
        for(int i=0;i<stbr.toString().length();i++)
        {
            stck.push(stbr.toString().toLowerCase().charAt(i));
        }
        for(int i=0;i<stbr.toString().length();i++)
        {
            if(stbr.toString().toLowerCase().charAt(i)!=stck.pop())
            {
                return false;
            }
        }
        return true;

    }
}
