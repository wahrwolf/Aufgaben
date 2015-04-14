package convert;

import static org.junit.Assert.assertTrue;

public class Converter
{

    public static String intToString(int x) 
    { 
        StringBuilder sb = new StringBuilder(); 
        
        String sign = ""; 
        if (x < 0) 
        { 
            sign = "-"; 
            x = -x; 
        }
 
        do 
        { 
            sb.append((char)('0' + x % 10)); 
            x = x / 10; 
        }while (x != 0); 

        sb.reverse();
 
        return sb.insert(0, sign).toString(); 
    }
    
    
    public static void main(String[] args)
    {
        System.out.println(intToString(0));
        System.out.println(intToString(1337));
        System.out.println(intToString(42));
        System.out.println(intToString(-1337));
        
            

    }

}
