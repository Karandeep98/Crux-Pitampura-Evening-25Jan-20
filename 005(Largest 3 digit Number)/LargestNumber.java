import java.io.*;
import java.lang.*;
import java.util.*;
public class Main
{
    static int fact(int n){
        if(n==0||n==1) return 1;
        else return n*fact(n-1);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String input=sc.next();
	    char a[]=input.toCharArray();
	    ArrayList<Integer> b=new ArrayList<Integer>(a.length-(a.length/2));
	    int index=0;
	    
	    for(int i=0;i<a.length;i++){
	        if(a[i]!=','){
	            int x=a[i]-'0';
	             b.add(x);
	        }
	    }
	   
	       Collections.sort(b);
	       for(int i=b.size()-1;i>=0;i--){
	           System.out.print(b.get(i));
	       }
	        ArrayList<Integer> c=new ArrayList<Integer>(b.size());
	      
	   //   System.out.println(c);
	        
	        for(int i=0;i<b.size();i++){
	            
	            c.add(0);
	            
	            int count=1;
	        for(int j=i+1;j<b.size();j++){
	            if(b.get(i)==b.get(j)&&b.get(i)!=-1){ 
	                count++;
	                c.set(i,count);
	              
	               b.set(j,-1);
	            }
	        }
	    }
	     int repeat=0;
	    for(int i=0;i<c.size();i++){
	        if(c.get(i)!=0){
	            repeat+=fact(c.get(i));
	        }
	    }
	    int comb=fact(b.size())/repeat;
	   // System.out.println(c);
	    System.out.print(","+comb);
	}
}

