

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest{

    @Test
    public void testAddition() {
        assertEquals(7, ArithmeticTest.add(2, 3));
        assertEquals(3, ArithmeticTest.add(-2, 5));
        
        assertEquals(0, ArithmeticTest.add(0, 0));
        
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, ArithmeticTest.subtract(5, 3));
        assertEquals(-7, ArithmeticTest.subtract(-2, 5));
        assertEquals(0, ArithmeticTest.subtract(0, 0));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, ArithmeticTest.multiply(2, 3));
        assertEquals(-10, ArithmeticTest.multiply(-2, 5));
        assertEquals(0, ArithmeticTest.multiply(0, 0));
    }
    
    public static int add(int a,int b) {
    	return(a+b);
    }
    public static int subtract(int a,int b) {
    	return(a-b);
    }
    public static int multiply(int a,int b) {
    	return(a*b);
    }
     
}
