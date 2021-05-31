package linecomparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program");
		Scanner sc = new Scanner(System.in);
		LineComparision lc = new LineComparision();
		lc.coordinates(1, 3, 2, 4);

	}
	public double coordinates(int x1, int y1, int x2, int y2) {
		double lengthOfLine=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		System.out.println(lengthOfLine);
		return lengthOfLine;
	}

}
