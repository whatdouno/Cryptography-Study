package baekjoonSolve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class Main {	
	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);    
		long listen = scanner.nextLong();
		long see = scanner.nextLong();
		scanner.nextLine();
		
		/*HashSet을 통한 교집합 설정.*/
		HashSet <String> listenSet = new HashSet<String>();
		HashSet <String> seeSet = new HashSet<String>();
		HashSet <String> listenSeeSet = new HashSet<String>();
		
		/*듣지 못한 자 Hashset 입력받기.*/
		for(int i=0; i<listen; i++) {
			String name = scanner.nextLine();
			listenSet.add(name);
		}
		/*보지 못한 자 Hashset 입력받기.*/
		for(int j=0; j<see; j++) {
			seeSet.add(scanner.nextLine());
		}
		/*듣도 보도 못한 = 교집합. 일단 listenSet의 요소 넣고, (A 집합과 같은 집합 만들고,)*/
		listenSeeSet.addAll(listenSet);
		/*A 교집합 B를 구하기 위해 retainAll을 사용.*/
		listenSeeSet.retainAll(seeSet);
		
		/*내용물 정렬을 위해 ArrayList로 변환.*/
		ArrayList<String> listenSeeArr = new ArrayList<>(listenSeeSet);
		Collections.sort(listenSeeArr);
		
		
		System.out.println(listenSeeArr.size());
		for(String name : listenSeeArr) {
			System.out.println(name);
		}
	}
}