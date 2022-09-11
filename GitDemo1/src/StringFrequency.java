import java.util.HashMap;
import java.util.Map;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "Geek";
     Map<Character,Integer>m=new HashMap<Character,Integer>();
     char[]c=s.toCharArray();
     for(char c2:c) {
    	 if(m.containsKey(c2)) {
    		 m.put(c2, m.get(c2)+1);
    			 }
    	 else {
    		 m.put(c2, 1);
    	 }
     }
     for(Map.Entry entry:m.entrySet()) {
    	 System.out.println(entry.getKey()+" "+entry.getValue());
     }
	}

}
