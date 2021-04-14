package firstpro1;

import java.util.*;
public class calculatePercentage{
	/**
	 * this return sq of no.
	 * @param n
	 * @return
	 */
	public static double sq(int n) {
		double sum=Math.sqrt(n);
		return sum;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sq(n));
	}
}
/*public class calculatePercentage {

	public static float calculatep(int mark1, int mark2, int mark3, int mark4, int mark5) {
		int total = mark1 + mark2 + mark3 + mark4 + mark5;
		float per = (float) total / 5;
		return per;
	}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mark1=sc.nextInt();
		int mark2=sc.nextInt();
		int mark3=sc.nextInt();
		int mark4=sc.nextInt();
		int mark5=sc.nextInt();
		System.out.println(calculatep(mark1,mark2,mark3,mark4,mark5));
	}
		// TODO Auto-generated method stub

}*/
