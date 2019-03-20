package Codes;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class GenericStackTest {
	
	GenericStack<Object>  gs = new GenericStack<>(Object.class,5);

	@Test
	/*
	 * @Test will get a compilation error due to missing of getSize method in the GenericStack Class
	 * That's what we wanted before using Refactoring 
	 * After adding getSize() it will pass the test
	 */
	public void sizeOfStackShouldBeZero() {
		
		
		assertThat("New Stack Should be Empty", gs.sizeAfterPush(),is (0));
		
	}
	
/*	@Test
	
	 * Test the codes of push 
	 * Implement the same code in the GenericStack class
	 
	public void testANormalPush() {
		Object actual = push(10);
		assertEquals(10,actual);
		
		
	}
	
	public Object push(Object x) {
			int top=0;
			Object[] elements=null;
			int size=5;
		    GenericStack<Object> gs = new GenericStack<>(Object.class,5);
		    if(top<size) {
			elements[top] = x;
			top++;	
		}
		    return x;
	}
	*/
	
	
	
	@Test
	/*
	 * Test the size after a new push
	 * expected value = 1
	 * 
	 */
	public void sizeOfStackAfterAPush() {
		
		
		gs.push(11);
		assertThat("New Stack Should be One", gs.sizeAfterPush(),is (1));
		
	}
	
	@Test
	/*
	 * Test the size after three new push
	 * expected value = 3
	 * 
	 */
	
	public void sizeOfStackAfterThreePush() {
		
		
		gs.push("Lionel");
		gs.push("Messi");
		gs.push(10);
		assertThat("New Stack Should be One", gs.sizeAfterPush(),is (3));
		
	}
	

	@Test
	/*
	 * Implement peek()
	 * Generate a compilation error 
	 * Add peek() into the GenericStack Class to fix
	 */
	
	public void pushOneAndPeek() {
		
		gs.push(1100);
		assertThat("1 was pushed on the stack and 1 should be returned when calling peek.", gs.peek(), is(1100));
	}
	
	
    @Test
    /*
	 * Test of isEmpty method of class GenericStack.
	 * Generate a compilation error 
	 * Add isEmpty() into the GenericStack Class to fix
	 */
    public void testStackIsEmptyTrue() 
    {
        System.out.println("isEmpty");
        assertTrue( gs.isEmpty());
    }
	
    @Test
    /*
	 * Test of isEmpty is false or not after a push class GenericStack.
	 */
    public void testStackIsEmptyFalse() 
    {
      
    	 System.out.println("isEmpty");
         gs.push( 1 );
         assertFalse( gs.isEmpty() );
    }

}
