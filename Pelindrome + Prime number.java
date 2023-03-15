package baekjoonSolve;

import java.util.*;

public class Main{
	/*펠린드롬 체커.*/
	public static boolean pelinChecker(String num) {
		boolean pelin = true;
		for(int i=0; i<num.length()/2; i++) {
			if(num.charAt(i) != num.charAt(num.length()-1-i)) {
				pelin = false;
			}
		}
		return pelin;
	}
	/*소수 판정기.*/
	public static boolean primeChecker(int num) {
		boolean prime = true;
		if(num == 1) {
			return false;
		}
		/*num과 같은 경우도 꼭 생각해야함. */
		for(int i=2; i*i<=num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return prime;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); //화면에 입력을 받는다.
		int N = sc.nextInt();
		for(int i=N; ;i++) {
			/*소수가 1000000을 넘는 경우도 있으니 꼭 체크해야함.*/
			if(pelinChecker(Integer.toString(i)) && primeChecker(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}