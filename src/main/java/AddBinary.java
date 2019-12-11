//https://leetcode.com/problems/add-binary/submissions/
//when adding a carry, resetting of carry is very important.
public class AddBinary {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        int digit =0;
        int numa =0;
        int numb =0;
        StringBuilder stbr = new StringBuilder();
        while(Math.max(i,j)>=0)
        {
            if(i>=0)
            {
                numa = Character.getNumericValue(a.charAt(i));
            }
            else
            {
                numa = 0;
            }
            if(j>=0)
            {
                numb = Character.getNumericValue(b.charAt(j));
            }
            else
            {
                numb = 0;
            }
            int sum = numa + numb + carry;
            carry=0;
            if(sum==2)
            {
                digit =0;
                carry =1;
            }
            else if(sum==3)
            {
                digit =1;
                carry =1;
            }
            else
            {
                digit = sum;
            }
            stbr.append(digit);
            i--;
            j--;
        }
        if(carry==1)
        {
            return stbr.append(1).reverse().toString();
        }
        else
        {
            return stbr.reverse().toString();
        }

    }
}
