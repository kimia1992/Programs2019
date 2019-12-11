//https://leetcode.com/problems/verifying-an-alien-dictionary/submissions/
//Lesson 1: for finding min, initialize int with Integer.minvalue and NOT 0;
//https://www.youtube.com/watch?v=qSbJZWENtX4
//https://www.youtube.com/watch?v=KvachM5i6-Q
import java.util.HashMap;

public class AlienDictionary {
//    public boolean isAlienSorted(String[] words, String order)
//    {
//        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
//        char orderArr[]= order.toCharArray();
//        int longestWordLength=Integer.MIN_VALUE;
//        BigInteger numberArray[] = new BigInteger[words.length];
//        for(int i=0;i<orderArr.length;i++)
//        {
//            hm.put(orderArr[i],i+1);
//        }
//        for(int j=0;j<words.length;j++)
//        {
//            int length = words[j].length();
//            longestWordLength = Math.max(longestWordLength,length);
//        }
//        for(int j=0;j<words.length;j++)
//        {
//            char wordCharArr[]=words[j].toCharArray();
//            StringBuilder stbr = new StringBuilder();
//            for(int k=0;k<longestWordLength;k++)
//            {
//                if(k<wordCharArr.length) {
//                    stbr.append(hm.get(wordCharArr[k]));
//                }
//                else
//                {
//                    stbr.append('0');
//                }
//            }
//            BigInteger bi = new BigInteger(stbr.toString());
//            numberArray[j]= bi;
//        }
//        for(int l=0;l<=numberArray.length-2;l++)
//        {
//            if(numberArray[l].compareTo(numberArray[l+1])>0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }
HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
public boolean isAlienSorted(String[] words, String order)
{
    char orderArr[]= order.toCharArray();
    for(int i=0;i<orderArr.length;i++)
    {
        hm.put(orderArr[i],i+1);
    }
    for(int i=0;i<=words.length-2;i++)
    {
        if(compareStrings(words[i],words[i+1])<0)
            return false;
    }
    return true;
}

public int compareStrings(String a, String b)
{
    int i=0;
    int j=0;
    while(i<a.length()&&j<b.length())
    {
        if((hm.get(a.charAt(i))-hm.get(b.charAt(j)))>0)
            return -1;
        else if((hm.get(a.charAt(i))-hm.get(b.charAt(j)))<0)
            return 1;
        else  {
            i++;
            j++;
        }
    }
    return a.length()-b.length();
}

}
