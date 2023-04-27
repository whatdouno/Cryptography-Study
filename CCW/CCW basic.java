package baekjoonSolve;

import java.util.Scanner;

class Coord{
	int x;
	int y;
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
	public Coord(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
public class Main {
	public static int CCW(Coord c1, Coord c2, Coord c3) {
		return (c2.x-c1.x) * (c3.y - c1.y) - (c3.x - c1.x) * (c2.y - c1.y);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Coord P1 = new Coord(sc.nextInt(), sc.nextInt());
		Coord P2 = new Coord(sc.nextInt(), sc.nextInt());
		Coord P3 = new Coord(sc.nextInt(), sc.nextInt());
		
		if(CCW(P1, P2, P3) > 0) {
			System.out.println(1);
		}
		else if(CCW(P1, P2, P3) == 0) {
			System.out.println(CCW(P1, P2, P3));
		}
		else {
			System.out.println(-1);
		}
		
		
	}
}