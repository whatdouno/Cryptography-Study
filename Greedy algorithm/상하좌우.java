package baekjoonSolve;

import java.util.Scanner;

class Coord {
	int x;
	int y;
	
	public Coord(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "("+ x + ","+ y + ")";
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String move = sc.nextLine();
		String [] moved = move.split(" ");

		Coord start = new Coord(0, 0);
		for(int i=0; i<moved.length; i++) {
			if(moved[i].equals("R")) {
				if(start.y + 1 < N) {
					start.y += 1;
				}
			}
			else if(moved[i].equals("L")) {
				if(start.y -1 > 0) {
					start.y -= 1;
				}
			}
			else if(moved[i].equals("U")) {
				if(start.x - 1 > 0) {
					start.x -= 1;
				}
			}
			else if(moved[i].equals("D")) {
				if(start.x + 1 < N) {
					start.x += 1;
				}
			}
		}
		start.x += 1;
		start.y += 1;
		
		System.out.println(start.toString());
	}
}
