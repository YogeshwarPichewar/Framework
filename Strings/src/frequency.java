import java.util.HashMap;
import java.util.Map;

public class frequency {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		char[]c=str.toCharArray();
		// TODO Auto-generated method stub
		Map<Character,Integer>d=new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++) {
		if(d.containsKey(c[i])){
			d.put(c[i],d.get(c[i])+1);
		}else {
			d.put(c[i], 1);
		}
		

	}
System.out.print(d);
}}
