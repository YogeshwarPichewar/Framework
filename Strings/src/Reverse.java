
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "How Are You" ;
		String strAry[] = str.split(" ");
		for(String su:strAry) {
		
	char[]s1=su.toCharArray();
	for(int j=s1.length-1;j>=0;j--) {
		System.out.print(s1[j]);
		
	}
	System.out.print(" ");
	
			
			
		}
		System.out.println("");
		reverseWord();
		

	}

	private static void reverseWord() {
		String s1= "Geeks for rocks" ;
	String[]sr=s1.split(" ");
	for(int k=sr.length-1;k>=0;k--) {
		System.out.print(sr[k]+" ");
	}
				
		// TODO Auto-generated method stub
		
	}

}
