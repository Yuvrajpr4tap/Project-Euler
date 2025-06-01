import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum = 0;
		for(int i = 3; i<1000; i+=3){
		    sum = sum+i;
		}
		for(int j = 5;j<1000; j+=5){
		    sum = sum+j;
		}
		for(int k =15; k<1000; k+=15){
		    sum = sum-k;
		}
		System.out.println(sum);
	
	}
	
}
