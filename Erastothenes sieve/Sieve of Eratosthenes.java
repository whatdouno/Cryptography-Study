package baekjoonSolve;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void Eratos(int n, int m) {
		ArrayList<Boolean> primeNumList;
		
		/*1도 ArrayList에서 예외처리 했으니 딱히 상관없음.*/
//		if(n<=1) {
//			return;
//		}
		primeNumList = new ArrayList<Boolean>(m-n);
		/*0과 1에 대한 소수 아님 처리.*/
		primeNumList.add(false);
		primeNumList.add(false);
		
		/*일단 2부터 n까지 전부 소수 설정*/
		for(int i=2; i<=m; i++ ) {
			primeNumList.add(i, true);
		}
		for(int i=2; i*i<=m; i++) {
			if(primeNumList.get(i)) {
				if(primeNumList.get(i)){
					for(int j = i*i; j<=m; j+=i) {
						primeNumList.set(j, false);
					}
					//i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
				}
			}
		}
		for(int i=n; i<=m; i++) {
			if(primeNumList.get(i) != false) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		Eratos(num1, num2);
	}	
}