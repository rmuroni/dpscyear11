import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class console4 {

	public static void main(String[] Args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter desired number of numbers:");
		String a = br.readLine();
		float number = 0;
 		float my_array[] = new float[100];
		 
		 try {
			number = Float.valueOf(a);
       	  
       	  	for (int i = 0; i < number; i++) {
       		  System.out.println("enter number:");
       		  String x = br.readLine();
       		  float number1;
    		 
       		  number1 = Float.valueOf(x);       		  
       		  my_array[i] = number1;
       	  }
       	}
       	catch(Exception e) {
       		System.out.println(e.getMessage());
       		
       		System.out.println("You didn't enter a number");
       	}
		 
		printnumbers(my_array,number);
		 		 
		 
	}
	
	public static void printnumbers(float my_arrayprint[], float lengthofarray) {
		String n = "";
		for (int i = 0; i < lengthofarray; i++) {
			if(i <lengthofarray-1) {
				n = n + my_arrayprint[i] + ",";  
			}
			else {
				n = n + my_arrayprint[i];
			}
    	}
		System.out.println(n);
	}
	
}
