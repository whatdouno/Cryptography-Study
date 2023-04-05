package baekjoonSolve;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		/*수식에 따른 정석 풀이법*/
//		int count = sc.nextInt();
//		int [] housePos = new int[count];
//		int [] minDistance = new int[count];
//		int min = Integer.MAX_VALUE;
//		int sum = 0;
//		int ans = -1;
//		
//		for(int i=0; i<count; i++) {
//			housePos[i] = sc.nextInt();
//		}
//		for(int i=0; i<count; i++) {
//			for(int j=0; j<count; j++) {
//				minDistance[i] += Math.abs(housePos[i] - housePos[j]);
//			}
//		}
//
//		for(int i=count-1; i>=0; i--) {
//			if(minDistance[i] <=min) {
//				min = minDistance[i];
//				ans = housePos[i];			}
//		}
	//		
	//		System.out.println(ans);


	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			int [] housePos = new int[count];
			for(int i=0; i<count; i++) {
				housePos[i] = sc.nextInt();
			}
			Arrays.sort(housePos);

			if(count% 2 == 0) {
				System.out.println(housePos[count/2-1]);
			}
			else {
				System.out.println(housePos[count/2]);
			}
		}
	
}