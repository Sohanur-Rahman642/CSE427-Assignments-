package Codes;

public class GenericStack<Object> {
	
	private Object elements[];
	private int size;
	private int top;
	
	public int getSize() {
		return this.size = size;
	}
	
	public void push (Object x) {
		if(top<size) {
			elements[top] = x;
			top++;
			
		}
	}
	

	
	
	
	
	

}
