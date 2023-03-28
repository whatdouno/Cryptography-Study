package baekjoonSolve;

import java.util.Scanner;

public class Main {
	static int top = -1;
	static int MAX_SIZE = 100;
	static int [] stack = new int[MAX_SIZE];
	/*비었을때 top= -1일때*/
	static boolean isEmpty() {
		if (top < 0) {
			return true;
		}
		else {
			return false;
		}
	}
	/*비었을때 top= maxsize -1일때*/
	static boolean isFull() {
		if (top >= MAX_SIZE-1) {
			return true;
		}
		else {
			return false;
		}
	}
	/*boolean으로 체크하고*/
	static void push(int value) {
		if (isFull()) {
			System.out.println("Stack full.");
		}
		else {
			/*숫자 넣기*/
			stack[++top] = value;
		}
	}
	/*boolean으로 체크하고*/
	static int pop() {
		if (isEmpty()) {
			return -1;
		}
		else {
			/*stack에 있는 숫자 빼고 top도 -1.*/
			return stack[top--];
		}
	}	
	/*비었으면 -1출력, 있으면 맨 위에꺼 출력*/
	static int top() {
		if (isEmpty()) {
			return -1;
		}
		else {
			return stack[top];
		}
	}	
	/*top +1 출력(사이즈는 0부터 시작하지 않으니.)*/
	static int size() {
		if (isEmpty()) {
			return -1;
		}
		else {
			return top+1;
		}
	}	
	static int empty() {
		if (isEmpty()) {
			return 1;
		}
		else {
			return 0;
		}
	}	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int count = scanner.nextInt();
		
		for(int i=0 ; i<count; i++) {
			String str = scanner.next();
			 
			switch (str) {
            
			case "push":
				push(scanner.nextInt());
				break;
                
			case "pop":
				sb.append(pop()).append('\n');
				break;
                
			case "size":
				sb.append(size()).append('\n');
				break;
                
			case "empty":
				sb.append(empty()).append('\n');
				break;
                
			case "top":
				sb.append(top()).append('\n');
				break;
			}

		}
		
		System.out.println(sb);
		
	}
}
