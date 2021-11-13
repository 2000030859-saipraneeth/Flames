package flames;
import java.util.*;
import java.lang.*;
import java.io.*;
public class flames
{
	 public int cancel(String m1,String m2) {
			int total=m1.length()+m2.length();
			int canc=0;
			
			for(int i=0;i<m1.length();i++)
			{
				for(int j=0;j<m2.length();j++) 
				{
					if(m1.charAt(i)==m2.charAt(j)) 
					{
						canc++;
						m2=m2.substring(0,j)+m2.substring(j+1,m2.length());
						break;
					}
					
				}
			}
			int tsize=total-(canc*2);
			return tsize;
		}
   
	public static void main (String[] args) {
  
		 flames ob = new flames();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("\nEnter a name");
	        String n1=sc.next();
	        
	        System.out.println("\nEnter the partner name");
	        String n2=sc.next();
	        
	        int tocut=ob.cancel(n1,n2);
	        
	        
	        String f="FLAMES";
	        
	        while(f.length()!=1)
	        {
	            int cut=0;
	            for(int k=0;k<tocut;k++)
	            {
	                if(cut>=f.length())
	                cut=0;
	                
	                ++cut;
	                 
	            }
	            f=f.substring(0,cut-1)+f.substring(cut);
	            f=f.trim();
	           
	        
	  }
switch(f){
case "F":
case "f":
	System.out.println(n1+" & "+n2+" Both are "+" Friends ");
	break;
case "L":
case "l":
	System.out.println(n1+" & "+n2+" Both are "+" Lovers ");
	break;
case "A":
case "a":
	System.out.println(n1+" & "+n2+" Both are "+" Related by Affection  ");
	break;
case "M":
case "m":
	System.out.println(n1+" & "+n2+" Both are "+" Married ");
	break;
case "E":
case "e":
	System.out.println(n1+" & "+n2+" Both are "+" Enimies ");
	break;
case "S":
case "s":
	System.out.println(n1+" & "+n2+" Both are "+" Sister and Brothers ");
	break;
}
	     
	   
	}
}
//By Renduchinthala Sai Praneeth
