package array;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int arr[]= {1,4,34,56,7};
     int key=sc.nextInt();
     int flag=-1;
     for(int i=0;i<arr.length;i++)
     {
    	if(arr[i]==key)
    	{
    	    flag=i;
    	    break;
    	}
     }
    System.out.println(flag);
  }
 }