import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class consoleloop {

	public static void main (String [] args) throws IOException {
		
		int x = Loop();    
		System.out.println(x);
	}


	public static int Loop() throws IOException {
		int ctr = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("enter input:");
		String  a = br.readLine();
	
		while (!a.contains("exit")) {
			System.out.println("enter input:");
			a = br.readLine();
			ctr = ctr + 1;
		}
	 
		return ctr;			 
	}
}
