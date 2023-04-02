package baekjoonSolve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	/*1. 소수인지 판정하는 함수. - 여기서 n^1/2 이론이 사용되었음.*/
	public static boolean isPrime(long num) {
		if(num == 2) {
			return true;
		}
		else if(num % 2 == 0) {
			return false;
		}
		for(int i=3; i*i<=num; i+= 2) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	/*1번 함수를 사용하여, 만약 나누는 n이 소수이고, num의 약수라면, (n-1)/n 실행함.*/
	/**/
	static long eulerPi(long num) {
		if(num == 1) {
			return 0;
		}
		long ret = num;
		for(int i=2; i<=num; i++) {
			if(isPrime(i) && num % i == 0) {
				ret = ret * (i - 1)/i; 
			}
		
		}
		return ret;
	}
	
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            bw.write(eulerPi(N) + "\n");
        }
        bw.flush();
        bw.close();
        
	}	
}

