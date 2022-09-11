import java.util.ArrayList;
import java.util.List;

public class JavaStream {
		// TODO Auto-generated method stub
		 int id;  
		    String name;  
		    float price;  
		    public JavaStream(int id, String name, float price) {  
		        this.id = id;  
		        this.name = name;  
		        this.price = price;  
		    }  
		 
		    public static void main(String[] args) {  
		        List<JavaStream> productsList = new ArrayList<JavaStream>();  
		        //Adding Products  
		        productsList.add(new JavaStream(1,"HP Laptop",25000f));  
		        productsList.add(new JavaStream(2,"Dell Laptop",30000f));  
		        productsList.add(new JavaStream(3,"Lenevo Laptop",28000f));  
		        productsList.add(new JavaStream(4,"Sony Laptop",28000f));  
		        productsList.add(new JavaStream(5,"Apple Laptop",90000f));  
		        // This is more compact approach for filtering data  
		        productsList.stream()  
		                             .filter(p -> p.price == 30000)  
		                             .forEach(p -> System.out.println(p.name));    
		    }  
		 

	}


