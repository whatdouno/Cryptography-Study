package baekjoonSolve;

import java.util.Scanner;

public class Main {
	/*ASCII 코드값 참조해서 대문자 해독 프로그램 작성하기*/
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String cryptoString = sc.nextLine();
		System.out.println("원문 : "+ cryptoString);
		int [] cryptoIntArr = new int[cryptoString.length()]; 
		/*Repeat 26 times*/
		for(int j=0; j<26; j++) {
			
			for(int i=0; i<cryptoString.length(); i++) {
				if(cryptoString.charAt(i)+j >= 65 && cryptoString.charAt(i)+j <= 90) {
					cryptoIntArr[i] = cryptoString.charAt(i) +j;
				}
				else if(cryptoString.charAt(i)+j > 90){
					cryptoIntArr[i] = cryptoString.charAt(i) +j- 26;
				}
			}
			for(int k=0; k<cryptoString.length(); k++) {
				System.out.print((char)cryptoIntArr[k]);
			}
			System.out.println();
		}
	}	
}

