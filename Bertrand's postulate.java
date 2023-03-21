package baekjoonSolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{	
	public static boolean isPrime(long num){
		for(int i=2; i*i<=num ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int Vertrang(long num) {
		int count = 0;
		for(long i=num+1; i <= 2*num; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	
    public static void main(String[] args)
    {
    	/*scanner 정리*/
    	Scanner scanner = new Scanner(System.in);
    	List <Integer> ansList = new ArrayList<>();
    	int num = -1;
    	while(num != 0) {
    		num = scanner.nextInt();
    		ansList.add(Vertrang(num));
    	}
    	/*제발 산수연산 범위 벗어날 것 같은건 long쓰자! BigInteger 쓰던가.*/
    	for(int i=0; i<ansList.size(); i++) {
    		System.out.println(ansList.get(i));
    	}
    	
    }
}