package baekjoonSolve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {	
	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);    
		
		/*map은 key, value를 활용하여 문제를 해결한다. 따라서, key를 입력해서 그 key가 있을때 count를 올리는 방식을 활용하면 쉽다.*/
		int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(scanner.nextLine(), 0);
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(scanner.nextLine())) {
            	count++;
            }
        }
        System.out.print(count);
	}
}