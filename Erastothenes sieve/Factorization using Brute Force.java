package baekjoonSolve;

import java.util.Scanner;

class Main 
{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		int Try = sc.nextInt();
		
		for(int x=0; x<Try; x++) {
			int num = sc.nextInt();
		
			for(int i=2; i<=num; i++) {
				int cnt = 0;
				while(num%i==0) {
					num /= i;
					cnt++;
				}
				if (cnt != 0) {
                    sb.append(i).append(' ').append(cnt).append('\n');
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}

