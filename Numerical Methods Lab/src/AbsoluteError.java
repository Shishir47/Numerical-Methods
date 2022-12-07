
import java.util.Scanner;

public class AbsoluteError {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter Real Value: ");
		double av=sc.nextDouble();
		System.out.print("Enter Measured Value: ");
		double mv=sc.nextDouble();
		System.out.println("Absolute Error: "+Math.abs(av-mv));
		System.out.println("Relative Error: "+Math.abs((av-mv)/av));
		sc.close();
	}

}



