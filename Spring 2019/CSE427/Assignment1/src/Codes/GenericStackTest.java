package Codes;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class GenericStackTest {

	@Test
	/*
	 * @Test will get a compilation error due to missing of getSize method in the GenericStack Class
	 * That's what we wanted before using Refactoring 
	 * After adding getSize() it will pass the test
	 */
	public void sizeOfStackShouldBeZero() {
		
		GenericStack<Object>  gs = new GenericStack<>(Object.class,5);
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
		
		GenericStack<Object>  gs = new GenericStack<>(Object.class,5);
		gs.push(11);
		assertThat("New Stack Should be One", gs.sizeAfterPush(),is (1));
		
	}
	
	@Test
	/*
	 * Test the size after three new push
	 * expected value = 4
	 * 
	 */
	
public void sizeOfStackAfterThreePush() {
		
		GenericStack<Object>  gs = new GenericStack<>(Object.class,5);
		gs.push("Lionel");
		gs.push("Messi");
		gs.push(10);
		assertThat("New Stack Should be One", gs.sizeAfterPush(),is (3));
		
	}
	

}
