package convert;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


import org.junit.Test;

public class ConverterTest
{
    private Converter _converter;

    @Test
    public void testZahlenUeberNull()
    {
        Integer random;
       
        
        for(int i=0; i<= 1000; i++)
        {
            random= (int) (Math.random()* 1000.0)+1;
            assertTrue(_converter.intToString(random).equals(String.valueOf(random)));
        }
       
    }
    
    @Test
    public void testZahlenUnterNull()
    {
        Integer random;
       
        
        for(int i=0; i<= 1000; i++)
        {
            random= (int) (Math.random()* -1000.0) -1;
            assertTrue(_converter.intToString(random).equals(String.valueOf(random)));
        }
    }
    
    @Test
    public void testZahlenGleichNull()
    {
        assertEquals(_converter.intToString(0),"0");
    }

    public ConverterTest()
    {
        _converter = new Converter();
        
    }
}
