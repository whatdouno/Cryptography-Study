package baekjoonSolve;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		/*start 포인터가 ++되면 부분배열의 합이 감소되고,
			end 포인터가 ++되면 부분배열의 합이 증가된다.*/
		
		int start = 0;
		int end = 0;
		int count = 0;
		long sum = 0;
		
		while(start <= N) {
			while(++end<=N) { //end 증가
				sum += end; //부분합을 증가
				if(sum>=N) {
					if(sum==N) 
						count++;
						break;
				}
			}
			while(++start<=N) { //start 증가
				sum -= start; //부분합을 감소
				if(sum<=N) {
					if(sum==N) 
						count++;
						break;
				}
			}
		}
		
		System.out.println(count);
	}
}
