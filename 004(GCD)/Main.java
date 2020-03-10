import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int min=0;
		if(n1<n2) min=n1;
		else min=n2;
		for(int i=min;i>0;i--){
			if(n1%i==0&&n2%i==0){
			System.out.println(i);
			break;
			}
		}
    }
}