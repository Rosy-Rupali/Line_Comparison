package linecomparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		double result=coordinates();
		System.out.println(result);

	}
	public static double coordinates() {
		System.out.println("Welcome to Line Comparison Computation program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first co-ordinate for x-axis:");
		int x1= sc.nextInt();
		System.out.println("Enter the second co-ordinate for x-axis:");
		int x2=sc.nextInt();
		System.out.println("Enter the first co-ordinate for y-axis:");
		int y1=sc.nextInt();
		System.out.println("Enter the second co-ordinate for y-axis:");
		int y2=sc.nextInt();
		double lengthOfLine=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		return lengthOfLine;
	}

}
