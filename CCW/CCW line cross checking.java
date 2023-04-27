package baekjoonSolve;

import java.util.Scanner;

class Coord{
	long x;
	long y;
	public long getX() {
		return x;
	}
	public long getY() {
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
		/*받는 Coordinate의 값은 int여도 int* int는 overflow가 발생할 수 있으므로, 그 범위를 long 까지 넓혀놓는 것이 좋다.*/
		
		/*이제부터 2차원 평면상에 3개의 점을 p1,p2,p3라고 가정하고, 각각의 좌표는 xi,yi라고 해보면,
		 *  외적의 결과를 다음과 같이 계산할 수 있다.
		 *  S = (x1y2 + x2y3 + x3y1) - (x2y1 + x3y2 + x1y3) */
		return  (c1.x * c2.y + c2.x * c3.y + c3.x * c1.y - c1.y * c2.x - c2.y * c3.x - c3.y * c1.x) < 0 ? 1 : -1;
		
		
	}
	public static void main(String[] args) {
		/*1. 두 개의 값이 곱이 0이 되는 경우.(CD의 한 점이 AB의 연장선상에 위치할 때, 이럴때는 교차 100% 안함.)*/
		Scanner sc = new Scanner(System.in);

		Coord A = new Coord(sc.nextInt(), sc.nextInt());
		Coord B = new Coord(sc.nextInt(), sc.nextInt());
		Coord C = new Coord(sc.nextInt(), sc.nextInt());
		Coord D = new Coord(sc.nextInt(), sc.nextInt());
		
		/*두 선분 AB, CD가 있을 떄, 선분의 교차 공식은, CCW(ABC) * CCW(ABD) < 0인지,
		 * 그 다음 CCW(CDA) * CCW(CDB) < 0인지 모두 확인하는 것이다.*/
		if(CCW(A, B, C) * CCW(A, B, D) < 0 && CCW(C, D, A) * CCW(C, D, B) < 0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}