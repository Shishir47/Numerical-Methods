import java.util.Scanner;

public class NewtonRapson {
	
	private static double FinX1(double x) {
		return ((x*x)-(5*x)+4);
	}
	private static double FinX2(double x) {
		return ((2*x)-5);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Iteration: ");
		int n=sc.nextInt();
		System.out.print("Enter X: ");
		double a1=sc.nextDouble();
		System.out.println();
		double x1,x2;
		for(int i=0; i<n; i++) {
			System.out.println("Iteration No: "+(i+1));
			x1=FinX1(a1);
			x2=FinX2(a1);
			double x0=a1-(x1/x2);
			System.out.println("Function of f(x) is "+String.format("%.3f", x1));
			System.out.println("Function of f'(x) is "+String.format("%.3f", x2));
			System.out.println("The Root, X"+(i+1)+" is "+String.format("%.3f", x0));
			a1=x0;
			System.out.println();
		}
		sc.close();

	}

}
