import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		
	int a=sc.nextInt();
		int b=sc.nextInt();
			int c=sc.nextInt();
			double d=Math.pow(b,2)-(4*a*c);
			double x1=(-b+Math.sqrt(d))/(2*a);
			double x2=(-b-Math.sqrt(d))/(2*a);
			if(d>0)
			System.out.println("Real and Distinct");			
			else if(d==0)
			    System.out.println("Real and Equal");			
			else
			System.out.println("Imaginary");

			if(d>=0){
				if(x1<x2)
				System.out.println((int)x1+" "+(int)x2);
				else
				System.out.println((int)x2+" "+(int)x1);
			}
	}
}