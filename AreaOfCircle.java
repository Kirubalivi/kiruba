package firstpro1;

import java.util.Scanner;

public class AreaOfCircle {
	public static double area(int ra) {
		double re=Math.PI*ra*ra;
		return re;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println(area(r));
		// TODO Auto-generated method stub

	}

}
