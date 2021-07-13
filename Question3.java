/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Question3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tn = sc.nextInt();
		while(tn-- > 0) {
		    int size = sc.nextInt();
		    long sum = 0;
		    int arr[] = new int[size];
		    for (int i=0; i<size; i++) {
		        arr[i] = sc.nextInt();
		        sum += arr[i];
		    }
		    //left/right array computation
		    int lArray[] = new int[size];
		    int rArray[] = new int[size];
		    int temp = 0;
		    for (int i=0; i<size; i++) {
		        if(arr[i] >= temp+1) {
		            temp++;
		        } else {
		            temp = arr[i];
		        }
		        lArray[i] = temp;
		    }
		    temp = 0;
		    for (int i=size-1; i>=0; i--) {
		        if(arr[i] >= temp+1) {
		            temp++;
		        } else {
		           temp = arr[i];
		        }
		        rArray[i] = temp;
		    }
		    long res = Integer.MIN_VALUE;
		    for (int i=0; i<size; i++) {
		        res = Math.max(res, Math.min(lArray[i], rArray[i]));
		    }
		    System.out.println(sum - (res*res));
		    
		}
	}
}
