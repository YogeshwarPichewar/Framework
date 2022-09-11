import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sorting
		
		List<Integer> a = new ArrayList<Integer>();
		//Set <Integer>s = new HashSet<Integer>();
		//ArrayList b= new ArrayList();
		a.add(6);
		a.add(3);
		a.add(1);
		a.add(2);
		a.add(4);
		System.out.println(a.contains(0));

		Collections.sort(a);
				
		for(Integer i : a)
		System.out.println(i);
		
		

	}

}
