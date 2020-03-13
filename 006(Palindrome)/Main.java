import java.util.*;
import java.lang.*;

public class Main
{
    static boolean check(int n){
        int x=n;
        int rev=0;
        while(x>0){
            int r= x%10;
            rev=rev*10+r;
            x/=10;
        }
        if(n==rev) return true;
        else return false;
    }
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
    
    int x=num;
    int rev=0;
    while(x>0){
        int r= x%10;
        rev=rev*10+r;
        x/=10;
    }
	int sum =num+rev;
	while(!check(sum)){
	      x=sum;
         rev=0;
        while(x>0){
            int r= x%10;
            rev=rev*10+r;
            x/=10;
        }
        sum+=rev;
	    
	}
	System.out.println(sum);
	}
	
}
