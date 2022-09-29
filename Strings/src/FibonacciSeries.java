
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0;
		int b=1;
		int sum=0 ;
		int  i=1;
		while(i <=3) {
			System.out.print(a+" ");
			sum =a+b;
			a=b;
			b=sum;
			i++;
			
		}
	}

}
