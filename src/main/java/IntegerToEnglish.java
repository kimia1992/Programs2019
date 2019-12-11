import java.util.HashMap;

public class IntegerToEnglish {
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    public String numberToWords(int num)
    {
        if(num==0)
            return "Zero";

        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");

        int billion = num/1000000000;
        int million = (num-billion*1000000000)/1000000;
        int thousands = (num - billion*1000000000 - million*1000000)/1000;
        int hundreds = (num - billion*1000000000 - million*1000000 - thousands*1000);
        //int tens = (num- billion*1000000000 - million*1000000 - thousands*1000 - hundreds*100);

        StringBuilder stbr = new StringBuilder();
        if(billion!=0)
        {
            stbr.append(read(billion)).append(" ").append("Billion").append(" ");
        }
        if(million!=0)
        {
            stbr.append(read(million)).append(" ").append("Million").append(" ");
        }
        if(thousands!=0)
        {
            stbr.append(read(thousands)).append(" ").append("Thousand").append(" ");
        }
        if(hundreds!=0)
        {
            stbr.append(read(hundreds));
        }
//        if(tens!=0)
//        {
//            stbr.append(read(tens));
//        }
        return stbr.toString();
    }

    public String read(int numberDigits)
    {
        StringBuilder stbr2 = new StringBuilder();
        if(map.containsKey(numberDigits))
        {
            return map.get(numberDigits);
        }
        else {
            int hundredDigit = numberDigits / 100;
            int unitsDigit = numberDigits % 10;
            int tensDigit = ((numberDigits - hundredDigit*100 - unitsDigit)/ 10) * 10;
            if (hundredDigit != 0) {
                stbr2.append(map.get(hundredDigit)).append(" Hundred ");
            }
            if (tensDigit != 0) {
                if((tensDigit + unitsDigit) > 10 && (tensDigit + unitsDigit) < 21) {
                    stbr2.append(map.get(tensDigit + unitsDigit));
                    return stbr2.toString();
                } else {
                    stbr2.append(map.get(tensDigit)).append(" ");
                }
            }
            if (unitsDigit != 0) {
                stbr2.append(map.get(unitsDigit));
            }
        }
        return  stbr2.toString().trim();
    }
}
