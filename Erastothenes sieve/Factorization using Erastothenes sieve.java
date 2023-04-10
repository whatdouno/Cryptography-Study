package baekjoonSolve;

import java.util.Scanner;

class Main 
{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int [] Eras = new int[5000001];
		for(int i=2; i<=5000000; i++) {
			Eras[i] = i;
		}
		/*에라스토테네스의 체 응용 부분*/
		for(int i = 2; i*i <= 5_000_000; i++) {
			if(Eras[i] == i) {	// i가 소수라면
				for(int j = i*i; j <= 5000000; j += i) {// 그 다음 큰 배수부터 전부 해당 소수로 표시 (각 자연수의 가장 작은 소인수 값이 저장됨)
					if(Eras[j] == j) {
						Eras[j] = i;
					}
				}
			}
		}
		
		int Try = sc.nextInt();
		
		for(int x=0; x<Try; x++) {
			int num = sc.nextInt();

			while(num>1) {
				sb.append(Eras[num] + " ");
				num /= Eras[num];
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}

