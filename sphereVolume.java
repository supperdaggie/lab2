import java.util.Scanner;

public class sphereVolume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the diameter of the sphere");
		double diameter = scan.nextDouble();
		double radius = diameter/2.0;
		double V =(4.0/3.0)*3.14 * Math.pow(radius, 3);
		System.out.println(V);
	}
}
