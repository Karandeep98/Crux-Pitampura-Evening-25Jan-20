import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		
	int t= sc.nextInt();
	while(t>0){
	    String s=sc.next();
	    int len =s.length();
	   
	   int i=0,sum=0;
	   while(len>0){
	       if(s.charAt(i)=='1')
	       sum+=Math.pow(2,len-1);
	       i++;len--;
	   }
	    System.out.println(sum);
	    t--;
	}
	}
}