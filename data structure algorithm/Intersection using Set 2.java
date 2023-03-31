package baekjoonSolve;

import java.util.HashSet;
import java.util.Scanner;
public class Main {	
	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);    
		long aCount= scanner.nextLong();
		long bCount = scanner.nextLong();
		scanner.nextLine();
		
		/*HashSet을 통한 교집합 설정.*/
		HashSet <Integer> ASet = new HashSet<Integer>();
		HashSet <Integer> BSet = new HashSet<Integer>();
		HashSet <Integer> ABSet = new HashSet<Integer>();
		
		/*듣지 못한 자 Hashset 입력받기.*/
		for(int i=0; i<aCount; i++) {
			int num = scanner.nextInt();
			ASet.add(num);
		}
		/*보지 못한 자 Hashset 입력받기.*/
		for(int j=0; j<bCount; j++) {
			int num = scanner.nextInt();
			BSet.add(num);
		}
		/*듣도 보도 못한 = 교집합. 일단 listenSet의 요소 넣고, (A 집합과 같은 집합 만들고,)*/
		ABSet.addAll(ASet);
		/*A 교집합 B를 구하기 위해 retainAll을 사용.*/
		ABSet.addAll(BSet);
		
		ASet.retainAll(BSet);
		ABSet.removeAll(ASet);
		
		
		System.out.println(ABSet.size());
	}
}