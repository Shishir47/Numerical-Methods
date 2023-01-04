import java.util.Scanner;

public class Lagrange {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Table Size: ");
		int n=sc.nextInt();
		double p = 1,xp,yp;
		double [] x= new double [n];
		double [] y=new double [n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter X"+(i+1)+": ");
			x[i]=sc.nextInt();
			System.out.print("Enter Y"+(i+1)+": ");
			y[i]=sc.nextInt();
		}
		System.out.print("Enter X: ");
		xp=sc.nextDouble();
		yp=0;
		
		for(int i=0; i<n; i++) {
			p=1;
			for(int j=0; j<n; j++) {
				if(i!=j) {
					p=p*(xp-x[j])/(x[i]-x[j]);
					//System.out.println("P is "+p);
				}
			}
			yp=yp+p*y[i];
			//System.out.println("YP is: "+yp);
		}
		System.out.println("The Value of Lagrange Interpolation is: "+p);
		sc.close();
	}

}
