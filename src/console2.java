import java.io.*;

public class console2 {

	public static void main (String [] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 System.out.println("enter input:");
	     String a = br.readLine();
	     boolean b = IsNumber(a);
	     
	     if (b == false) {
	    	 System.out.println("you haven't entered a number");
	     }
	     else {
	    	 System.out.println("you've entered a number");
	     }
	   
	}
	
	public static boolean IsNumber(String a) {
		
		try {
		
			float abc = Float.valueOf(a);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	

}
