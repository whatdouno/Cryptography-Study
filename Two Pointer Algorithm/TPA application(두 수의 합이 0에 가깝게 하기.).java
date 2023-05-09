package baekjoonSolve;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long [] solution = new long[N];
		
		for(int i=0; i<N; i++) {
			solution[i] = scanner.nextLong();
		}
		
		int start = 0;
		int end = N-1;
		long sum = 0;
		
		/*0과의 차이를 설정한 이유는, 두 수의 합을 0에 가깝게 만들고 싶기 때문이다.*/
		long gapBetZero = Integer.MAX_VALUE;
		int startPoint =0;
		int endPoint = N-1;
		
		while(start< end) {
			sum = solution[start] + solution[end];
			if(Math.abs(sum) < gapBetZero) {
				gapBetZero = Math.abs(sum);
				startPoint = start;
				endPoint = end;
			}
			
			/*이 쪽은 투 포인터를 활용함에 있어서 건들지 않는 것이 좋을 것 같다.(개인적인 생각)*/
			if(sum < 0) {
				start++;
			}
			else {
				end--;
			}
		}
		
		System.out.println(solution[startPoint] + " " + solution[endPoint]);
	}
}
