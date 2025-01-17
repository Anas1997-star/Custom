import java.util.Scanner;

class StackTests{
	int stack[] =new int[5],top=0;

	public void push(int x) {
		stack[top]=x;
		top++;

	}
	public int pop() {
		int n;
		top--;
		n=stack[top];
		return n;

	}
	public int peek() {
		int n;
		n=stack[top-1];
		return n;

	}

	public void show() {
		for (int n1:stack) {
			System.out.print(n1+" ");
		}
	}



}
public class StackTest {

	public static void main(String[] args) {
		StackTests st=new StackTests();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println("deleted value is "+ st.pop());
		st.push(40);
		System.out.println("peek value is " +st.peek());
		st.show();


	}
}
