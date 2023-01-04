import java.util.Scanner;

public class SecantMethod {

	
	private static double FinX1(double x) {
		return ((x*x*x)-x-1);
	}
	
	public static void main(String[] args) {
		Scanner fs= new Scanner(System.in);
		System.out.println("Enter Number of Iteration: ");
		int n=fs.nextInt();
		System.out.print("Enter X1: ");
		double a1=fs.nextDouble();
		System.out.print("Enter X2: ");
		double b1=fs.nextDouble();
		double x1,x2,fx0;
		System.out.println();
		for(int i=0; i<n; i++) {
			System.out.println("Iteration No: "+(i+1));
			x1=FinX1(a1);
			x2=FinX1(b1);
			double x0=((x2*a1)-(x1*b1))/(x2-x1);
			fx0=FinX1(x0);
			System.out.println("X0 is "+ x0);
			System.out.println("f(x1) is "+x1);
			System.out.println("f(x2) is "+x2);
			System.out.println("f(x0) is "+fx0);
			if(x0==0) {
				break;
			}
			else {
				a1=b1;
				b1=x0;
			}
			System.out.println();
			fs.close();
		}
	}

}
