package baekjoonSolve;

import java.util.Scanner;

public class Main {
	public static void main(String [] args)
	{
		/*Euclidean algorithm 구현*/
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		/*Switch num1 & num2 (비교 쉽게 하기 위해서) - 무조건 앞의 수가 큰 수가 되도록 하기 위함.*/
		if(num1 < num2) {
			int swap = num1;
			num1 = num2;
			num2 = swap;
		}
		int remainder; /*나머지*/
		
		/*num1 = num2 * Quotient + remainder.
		  num2 = remainder * Quotient + remainder2 .... 이 과정의 무한 반복이므로,
		  위 과정에서, num1 = num2, num2 = remainder 과정을 반복하여, 연산하면 쉽게 얻어낼 수 있다.
		*/
		
		while(true) {
			remainder = num1%num2;
			num1 = num2;
			num2 = remainder;
			if(num1 % num2 == 0) {
				System.out.println(num2);
				break;
			}
		}
		
	}	
}

