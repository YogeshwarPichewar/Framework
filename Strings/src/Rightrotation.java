
public class Rightrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,50,70,90};
		int temp=arr[arr.length-1];
		 
		 
		 for(int i=arr.length-1;i>0;i--) {
			 arr[i]=arr[i-1];
		 }
		 arr[0]=temp;
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
