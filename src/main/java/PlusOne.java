//https://leetcode.com/problems/plus-one/submissions/
//https://www.youtube.com/watch?v=_sls9AdBymI
//default value if integer is 0
//first return statement is extra important in the first loop

import java.math.BigInteger;

public class PlusOne {
//    public int[] plusOne(int[] digits) {
//        StringBuilder stbr = new StringBuilder();
//        for(int i=0;i<digits.length;i++)
//        {
//            stbr.append(digits[i]);
//        }
//        BigInteger number = new BigInteger(stbr.toString());
//        BigInteger addValue = new BigInteger("1");
//        BigInteger resultNumber = number.add(addValue);
//
//        String resultString = resultNumber.toString();
//        int outputArray[] = new int[resultString.length()];
//        for(int j=0;j<resultString.length();j++)
//        {
//            outputArray[j]=Character.getNumericValue(resultString.charAt(j));
//        }
//        return outputArray;
//
//    }
//public int[] plusOne(int[] digits)
//{
//    StringBuilder stbr = new StringBuilder();
//    int carry = 0;
//    int digit = 0;
//    int finalDigit = 0;
//    for(int i=digits.length-1;i>=0;i--)
//    {
//        if(i==digits.length-1)
//        {
//            digit = digits[i]+1;
//            if(digit>9)
//            {
//                if(digits.length==1)
//                {
//                    stbr.append(0).append(1);
//                }
//                else
//                {
//                    finalDigit=digit%10;
//                    carry=digit/10;
//                    stbr.append(finalDigit);
//                }
//            }
//            else
//            {
//                finalDigit=digit;
//                stbr.append(finalDigit);
//            }
//
//
//        }
//        else
//        {
//            digit = digits[i]+carry;
//            if(digit>9)
//            {
//                finalDigit=digit%10;
//                carry=digit/10;
//            }
//            else
//            {
//                finalDigit=digit;
//            }
//            stbr.append(finalDigit);
//        }
//    }
//    String finalString = stbr.reverse().toString();
//    int op[]= new int[finalString.length()];
//    for(int j=0;j<finalString.length();j++)
//    {
//        op[j]=Character.getNumericValue(finalString.charAt(j));
//    }
//    return op;
//}
public int[] plusOne(int[] digits)
{
    for(int i=digits.length-1;i>=0;i--)
    {
        if(digits[i]<9)
        {
            digits[i]=digits[i]+1;
            return digits;
        }
        else
        {
            digits[i] = 0;
        }

    }
    int result[] = new int[digits.length+1];
    result[0]=1;
    return result;
}

}
