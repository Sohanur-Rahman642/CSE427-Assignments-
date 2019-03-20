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
	 */
	public void sizeOfStackShouldBeZero() {
		GenericStack<Object> gs = new GenericStack<>();
		assertThat("New Stack Should be Empty", gs.getSize(),is (0));
		
	}

}
