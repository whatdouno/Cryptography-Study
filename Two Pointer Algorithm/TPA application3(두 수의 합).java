package baekjoonSolve;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		long M = scanner.nextLong();
		long [] armorNum = new long[N];
		for(int i=0; i<N; i++) {
			armorNum[i] = scanner.nextLong();
		}
		Arrays.sort(armorNum);
		
		int start = 0;
		int end = N-1;
		int count = 0;
		long sum = 0;
		
		while(start< end) {
			sum = armorNum[start] + armorNum[end];
			System.out.println(sum);
			if(sum == M) {
				count++;
			}
			
			/*이 쪽은 투 포인터를 활용함에 있어서 건들지 않는 것이 좋을 것 같다.(개인적인 생각)*/
			if(sum < M) {
				start++;
			}
			else {
				end--;
			}
		}
		
		System.out.println(count);
	}
}
