package Codes;

public class MainOfGenericStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericStack<Object> stack1= new GenericStack<>(Object.class, 5);
		stack1.push(15);
		stack1.push(8);
		stack1.push(10);
		stack1.push(20);
		System.out.println("Peek " +stack1.peek());
		
		
		System.out.println("Pop "+stack1.pop());
		System.out.println("Pop "+stack1.pop());
		System.out.println("Pop "+stack1.pop());
		System.out.println("Pop "+stack1.pop());
		
		stack1.show();
		
		GenericStack<Object> stack2= new GenericStack<>(Object.class, 5);
		stack1.push("Lionel");
		stack1.push("Messi");
		stack1.push(10.25);
		stack1.push(-16);
		stack1.push(50);
		
		stack1.show();
		
		System.out.println("Peek " +stack1.peek());
		System.out.println("Pop "+stack1.pop());
		System.out.println("Pop "+stack1.pop());
		System.out.println("Pop "+stack1.pop());
		
		stack1.show();
	}

}
