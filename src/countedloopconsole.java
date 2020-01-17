import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countedloopconsole {
	
	public static void main(String [] Args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 System.out.println("enter lines wanted:");
	     String a = br.readLine();
	     
	     try {
	 		
	    	 String y = "";
	    	 float b = Float.valueOf(a);
	    	 
	    	 for (int i = 0; i < b; i ++) {
	    		 System.out.println("Enter Text");
	    	     String x = br.readLine();
	    	     y = y + x;
	    	 }
	    	 
	    	 System.out.println(y);
	    	 
			}
			catch(Exception e) {
				System.out.println("Please enter a number");
			}
	     
	}
}
