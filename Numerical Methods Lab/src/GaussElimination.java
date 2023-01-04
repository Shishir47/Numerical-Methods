import java.util.Scanner;

public class GaussElimination {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 double [][] arr= new double [4][5];
		 double [] solution= new double [5];
	     double factor=0.0;
		 int n=3;
		 System.out.println("Matrix: ");
		 for(int i=1;i<=n;i++)
		 {
			  for(int j=1;j<=n+1;j++)
			  {
				   arr[i][j]=sc.nextDouble();
			  }
		 }
		 for(int i=1;i<=n-1;i++)
		 {
			  for(int j=i+1;j<=n;j++)
			  {
				   factor = arr[j][i]/arr[i][i];
				   for(int k=1;k<=n+1;k++)
				   {
				  		arr[j][k] = arr[j][k] - factor*arr[i][k];
				   }
			  }
		 }
		 solution[n] = arr[n][n+1]/arr[n][n];

		 for(int i=n-1;i>=1;i--)
		 {
			  solution[i]=arr[i][n+1];
			  for(int j=i+1;j<=n;j++)
			  {
			  		solution[i]=solution[i]-arr[i][j]*solution[j];
			  }
			  solution[i] = solution[i]/arr[i][i];
		 }

		 System.out.println("Solution is: ");
		 for(int i=1;i<=n;i++)
		 {
			 System.out.println("X"+ i+"=" + solution[i]);
		  	
		 }
		sc.close();

	}

}
