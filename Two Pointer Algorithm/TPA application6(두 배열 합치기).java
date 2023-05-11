package baekjoonSolve;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int asize = sc.nextInt();
		int bsize = sc.nextInt();
		
		int[] arra = new int[asize];
		int[] arrb = new int[bsize];
		int[] resultarr = new int[asize + bsize];
		for (int i = 0; i < asize; i++) {
			arra[i] = sc.nextInt();
		}
		Arrays.sort(arra);
		for (int i = 0; i < bsize; i++) {
			arrb[i] = sc.nextInt();
		}
		Arrays.sort(arrb);
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < asize && j < bsize) {
			if (arra[i] > arrb[j]) {
				resultarr[k++] = arrb[j++];
			} else {
				resultarr[k++] = arra[i++];
			}
		}

		while (j < bsize) {
			resultarr[k++] = arrb[j++];
		}
		while (i < asize) {
			resultarr[k++] = arra[i++];
		}

		 StringBuilder sb = new StringBuilder();

	        for (int x = 0; x <resultarr.length ; x++) {
	            sb.append(resultarr[x] + " ");
	        }
	        System.out.println(sb.toString());
	}
}
