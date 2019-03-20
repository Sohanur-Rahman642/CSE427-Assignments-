package Codes;

import java.lang.reflect.Array;

public class GenericStack<Object> {
	
	private Object elements[];
	private int size;
	private int top;
	
	/*......Added Constructor.....*/
	public GenericStack(Class<Object> element,int size) {
		this.size = size;
		top = 0;
		elements = (Object[]) Array.newInstance(element, size);
		
	}
	
	
	
	/*......Added getSize() after a Tdd test.....*/
	public int getSize() {
		return this.size = size;
	}
	
	/*......Added push() after a Tdd test.....*/
	public void push (Object x) {
		if(top<size) {
			elements[top] = x;
			top++;
			
		}
	
		
	
	}
	
	
	/*......Added sizeAfterPush() after a Tdd test.....*/
	public int sizeAfterPush() {
		Object x = null;
		int count=0;
		if(top<size) {
			elements[top] = x;
			count = top++;
			
		}
		
		return count;
	

	}
	
	/*......Added peek() after a Tdd test.....*/
	public Object peek() {
		
		
		if(!this.isEmpty()) {
			return elements[top-1];
		}
		else {
			return null;
		}
		
	}
	
	
	
	
	
	/*......Added isEmpty() after a Tdd test.....*/
	public boolean isEmpty() {
		
	    if(top==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*......Added Pop after a Tdd test.....*/
	public Object pop() {
		
		Object x;
		
		top--;
		x= elements[top];
		elements[top]=null;
		return x;


}
	
	
	
	

}
