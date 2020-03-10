import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int max=0;
		if(n1>n2) max=n1;
		else max=n2;
		for(int i=max;i<=n1*n2;i+=max){
			if(i % n1 == 0 && i % n2==0){
				System.out.println(i);
				break;
			}
		}
		

    }
}