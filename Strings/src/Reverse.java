
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "How Are You" ;
		String strAry[] = str.split(" ");
		for(int i=0;i<strAry.length;i++) {
		
	char[]s1=strAry[i].toCharArray();
	for(int j=s1.length-1;j>=0;j--) {
		System.out.print(s1[j]);
		
	}
	System.out.print(" ");
	
			
			
		}
		
		
		
		
		
		

	}

}
