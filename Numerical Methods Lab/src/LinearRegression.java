import java.util.Scanner;

public class LinearRegression {
	
	static double convert(double x) {
		String s=""+x;
		s=s.substring(0, 5);
		x=Double.parseDouble(s);
		return x;
	}
	
	public static void main(String[] args) {
		Scanner fs= new Scanner(System.in);
		double sumX=0, sumX2=0, sumY=0, sumXY=0, a, b;

		System.out.print("How many data points? ");
		int n=fs.nextInt();
		double [] x=new double [n];
		double [] y=new double [n];
		System.out.println("Enter data:");
		for(int i=0;i<n;i++){
			System.out.print("x["+ (i+1) +"] = ");
			x[i]=fs.nextDouble();
			System.out.print("y["+ (i+1) +"] = ");
			y[i]=fs.nextDouble();
		}

		for(int i=0;i<n;i++){
			sumX = sumX + x[i];
			sumX2 = sumX2 + x[i]*x[i];
			sumY = sumY + y[i];
			sumXY = sumXY + x[i]*y[i];
		}
		 b =(n*sumXY-sumX*sumY)/(n*sumX2-sumX*sumX);
		 a =(sumY - b*sumX)/n;
		 a=convert(a);
		 b=convert(b);
		 System.out.println("Calculated value of a is "+ a +" and b is "+ b );
		 System.out.println("Equation of best fit is: y = "+ a +" + "+ b+"x");
		 fs.close();

	}

}
