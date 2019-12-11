public class DeletionDistance {
    public int deletionDistance(String str1, String str2) {

        int xors1 =1;
        int xors2 =1;

        for(int i=0;i<str1.length();i++)
        {
            int s1char = str1.charAt(i);
            xors1 = xors1^s1char;
        }
        for(int j=0;j<str2.length();j++)
        {
            int s2char = str2.charAt(j);
            xors2 = xors2^s2char;
        }
        return xors1^xors2;

    }

}
