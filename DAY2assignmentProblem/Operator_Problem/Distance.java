//This program is to find the Euclidean distance.

package DAY2assignmentProblem.Operator_Problem;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the x co-ordinate value : "+"\n");
		x = scan.nextDouble();
		System.out.println("Enter the y co-ordinate value : "+"\n");
		y = scan.nextDouble();
		scan.close();
		double euclideanDistance = euclideanDistance(x,y);
		System.out.printf("The Euclidean Distance from(x=%g ,y=%g) to origin(0,0) is: %g %n",x,y,euclideanDistance);

	}

	public static double euclideanDistance(double x, double y) {
		// TODO Auto-generated method stub
		
		double distance = (double)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		return distance;
	}

}
