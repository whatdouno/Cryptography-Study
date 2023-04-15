package baekjoonSolve;

import java.util.Scanner;
public class Main {
	/*골드바흐 파티션의 개수 구하기.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		/*Erastothenes' sieve는 이렇게 함수로 설정하지 말고 따로 리스트를 만들어서 하는게 처리 속도가 훨씬 빠르다.*/
		boolean [] primeList = new boolean[33001]; 
		primeList[0] = false;
		primeList[1] = false;
		/*일단 2부터 n까지 전부 소수 설정*/
		for(int i=2; i<33001; i++) {
			primeList[i] = true;
		}
		for(int i=2; i*i<33000; i++) {
			if(primeList[i]){
				for(int j = i*i; j<33000; j+=i) {
					primeList[j] =  false;
				}
				//i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
			}
		}
		int cnt = scanner.nextInt();

		for(int j=0; j<cnt; j++) {
			int num = scanner.nextInt();
			int count = 0;

			if(num == 4) {
				sb.append("4 has 1 representation(s)\n2+2\n");
			}
			else {
				for(int i=3; i<= num/2; i+=2) {
					if(primeList[i] && primeList[num-i]) {
						count++;
					}
				}
				sb.append(num + " has " + count + " representation(s)\n");
				for(int i=3; i<= num/2; i+=2) {
					if(primeList[i] && primeList[num-i]) {
						sb.append(i + "+" + (num-i) + "\n");
					}
				}
				sb.append("\n");
			}

		}
		System.out.println(sb);
	}
}
