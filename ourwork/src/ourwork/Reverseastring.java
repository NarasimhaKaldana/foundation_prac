package ourwork;

import java.util.Scanner;

public class Reverseastring {

	   public static void main(String[] arg)
		{
		Reverseastring rev=new Reverseastring();  
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String  str=sc.nextLine();	
		System.out.println("Reverse of a String  is : "+rev.reverse(str));
		}
	static String reverse(String a)
		{
		String rev="";
		for(int j=a.length();j>0;--j)
		{
		rev=rev+(a.charAt(j-1)); 
		}
		return rev;
		}
	}

