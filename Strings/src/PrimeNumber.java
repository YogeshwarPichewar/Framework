
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;int max=100;
		
		for(int i=a;i<=max;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				
			}
		}

	}

	private static boolean isPrime(int b) {
		
		for(int i=2;i<=b/2;i++) {
			if(b%i==0) {
				return false ;
			}
			
		}
		// TODO Auto-generated method stub
		return true;
	}
}