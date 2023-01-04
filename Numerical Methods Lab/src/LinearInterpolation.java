import java.util.Scanner;
public class LinearInterpolation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x,x1 = 0,y1 = 0,x2 = 0,y2 = 0;
		System.out.println("Enter X: ");
		x=sc.nextInt();
		double position[]={1,2,3,5};
		double height[]={3,4.5,5,6};
		for(int i=0; i<4;i++){
			if(position[i]<x && position[i+1]>x){
				x1=position[i];
				y1=position[i+1];
				x2=height[i];
				y2=height[i+1];
			}
		}
		System.out.println("The value of X1: "+x1);
		System.out.println("The value of Y1: "+y1);
		System.out.println("The value of X2: "+x2);
		System.out.println("The value of Y2: "+y2);
		double y=y1+((x-x1)*((y2-y1)/(x2-x1)));
		System.out.println("The value of Y: "+y);
		sc.close();

	}

}
