//Super helpful a lot of times
public class ConvertIntToArray {
    public int[] convertIntToArr(int num)
    {
       String numString = Integer.toString(num);
       int op[]= new int[numString.length()];
       for(int i=0;i<op.length;i++)
       {
           op[i] = Character.getNumericValue(numString.charAt(i));
       }
       return op;
    }
}
