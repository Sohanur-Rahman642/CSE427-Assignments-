package Codes;

import java.lang.reflect.Array;

public class GenericStack<Object> {
	
	private Object elements[];
	private int size;
	private int top;
	
	public GenericStack(Class<Object> element,int size) {
		this.size = size;
		top = 0;
		elements = (Object[]) Array.newInstance(element, size);
		
	}
	
	
	
	
	public int getSize() {
		return this.size = size;
	}
	
	public void push (Object x) {
		if(top<size) {
			elements[top] = x;
			top++;
			
		}
	
		
	
	}
	
	
	
	public int sizeAfterPush() {
		Object x = null;
		int count=0;
		if(top<size) {
			elements[top] = x;
			count = top++;
			
		}
		
		return count;
	

	}
	
	public Object peek() {
		
			return elements[top-1];
		
		
	}
	
	
	
	

}
