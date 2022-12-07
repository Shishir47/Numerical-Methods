
import java.util.Scanner;

public class BisectionMethod {
	private static double FinX1(double x) {
		return ((x*x)+(3*x)-5);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Iteration: ");
		int n=sc.nextInt();
		System.out.print("Enter X1: ");
		double a1=sc.nextDouble();
		System.out.print("Enter X2: ");
		double b1=sc.nextDouble();
		System.out.println();
		double x1,x2,x0;
		for(int i=0; i<n; i++) {
			System.out.println("Iteration No: "+(i+1));
			x1=FinX1(a1);
			x2=FinX1(b1);
			double avg=(a1+b1)/2;
			x0=FinX1(avg);
			
			System.out.println("Function of f(X1) is "+String.format("%.3f", x1));
			System.out.println("Function of f(X2) is "+String.format("%.3f", x2));
			System.out.println("The Root, Xo is: "+String.format("%.3f", avg));
			System.out.println("Function of f(Xo) is "+String.format("%.3f", x0));
			if((x1*x0)<0) {
				b1=avg;
			}
			else if((x1*x0)>0) {
				a1=avg;
			}
			else if((x1*x0)==0){
				break;
			}
			System.out.println();
		}
		sc.close();
	}

}
