import org.testng.annotations.Test;

import junit.framework.TestCase;

public class Test_Fibonacci_print extends TestCase {
	
	
	@Test
	public void test(){
		fibo f = new fibo() ; 
		int number  = f.Fibonacci_print(2) ; 
		assertEquals(1,number) ; 
		
		
		
	}
	

}
