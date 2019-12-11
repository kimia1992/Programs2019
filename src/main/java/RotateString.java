//https://leetcode.com/problems/rotate-string/submissions/
//Always use brackets
public class RotateString {
    public boolean rotateString(String A, String B) {
        if((A.length()==0||A.isEmpty()||A==null)&&(B.length()==0||B.isEmpty()||B==null))
        {
            return true;
        }
        if(A.length()==0||A.isEmpty()||A==null)
        {
            return false;
        }
        if(B.length()==0||B.isEmpty()||B==null)
        {
            return false;
        }

        if(B.length()<A.length())
        {
            return false;
        }
        StringBuilder stbr = new StringBuilder();
        stbr.append(B).append(B);
        if(stbr.toString().indexOf(A)==-1)
            return false;
        else
            return true;
    }
}
