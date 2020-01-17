import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class console3 {

	public static void main(String [] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter input:");
		String  a = br.readLine();
		float max = 0;
		
		while (!a.contains("exit")) {
			System.out.println("enter input:");
			a = br.readLine();
			
			try {
				float b = Float.valueOf(a);
				
				if (b > max) {
					 max = b;
				 }
			}
			
			catch(Exception e){
			
			}
			
			
		}
		
		System.out.println(max);
	}
	
}
