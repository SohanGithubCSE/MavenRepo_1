

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Arithmetic{

    @Test
    public void testAddition() {
        assertEquals(7, Arithmetic.add(2, 3));
        assertEquals(3, Arithmetic.add(-2, 5));
        
        assertEquals(0, Arithmetic.add(0, 0));
        
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, Arithmetic.subtract(5, 3));
        assertEquals(-7, Arithmetic.subtract(-2, 5));
        assertEquals(0, Arithmetic.subtract(0, 0));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, Arithmetic.multiply(2, 3));
        assertEquals(-10, Arithmetic.multiply(-2, 5));
        assertEquals(0, Arithmetic.multiply(0, 0));
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
