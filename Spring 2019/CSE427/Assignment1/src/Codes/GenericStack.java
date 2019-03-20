package Codes;

public class GenericStack<Object> {
	
	private Object elements[];
	private int size;
	private int top;
	
	public int getSize() {
		return 0 ;
	}
	
	public void push (Object x) {
		if(top<size) {
			elements[top] = x;
			top++;
			
		}
	}
	

	
	
	
	
	

}
