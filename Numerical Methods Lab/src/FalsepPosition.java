import java.util.Scanner;

public class FalsepPosition {
	
	private static double FinX1(double x) {
		return ((x*x*x)-x-1);
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
			double avg=a1-((FinX1(a1)*(b1-a1))/(FinX1(b1)-FinX1(a1)));
			x0=FinX1(avg);
			System.out.println("The Root, X0 is "+String.format("%.3f", avg));
			System.out.println("Function of f(x1) is "+String.format("%.3f", x1));
			System.out.println("Function of f(x2) is "+String.format("%.3f", x2));
			System.out.println("Function of f(x0) is "+String.format("%.3f", x0));
			if((x1*x0)<0) {
				b1=avg;
			}
			else if((x1*x0)>0) {
				a1=avg;
			}
			else if((x1*x0)==0){
				//System.out.println("Root "+String.format("%.3f", avg)+ " Found at Interation No: "+(i+1));
				break;
			}
		}
		sc.close();

	}

}
