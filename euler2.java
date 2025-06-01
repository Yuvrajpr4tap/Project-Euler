import java.util.*;
import java.lang.*;
import java.io.*;

class efn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int first = 1, second  = 2, third = 0;
		int sum = 2  ;
		
		while(third<4000000) {
		    third = first + second;
		    if(isEven(third)) {
		        sum +=third;
		    }
		    
		    first = second;
		    second = third;
		}
		
		System.out.println(sum);
		
	
	}
	
	public static boolean isEven(int n) {
	    return n%2 == 0;
	}
	
}
