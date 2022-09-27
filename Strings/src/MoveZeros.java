import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {2,5,0,0,7,8};
	System.out.println("The original array is : ");
    printArray(arr);
    // calling the moveZeros() method
    moveZeros(arr);
    
    System.out.println("\nAfter taking all the zeros to last : ");
    printArray(arr);

} 
	static void moveZeros(int[] arr) 
{
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		if(arr[end]==0) {
			end--;
		}
		if(arr[start]!=0) {
			start++;
		}
		else {
			swap(arr,start,end);
		start++;
		end--;
					}
	}
	
	}
	 static void swap(int[] arr, int i, int j) 
	    {
	        // logic to swap
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	    
	    //printArray() method to print the array
	    static void printArray(int[] arr)
	    {
	        // printing array
	        for (int i=0; i<arr.length; i++) 
	        {
	            System.out.print(arr[i] + " ");
	        }
	    }

}
