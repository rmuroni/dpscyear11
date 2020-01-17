import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculator {

	public static void main(String[]args) throws IOException {
		
		int n = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter values and operation");
		String  a = br.readLine();
		int b = a.indexOf("*");
		int c = a.indexOf("/");
		int d = a.indexOf("-");
		int e = a.indexOf("+");
		
		if (b > 0) {
			n = b;
		}
		
		else if ( c > 0) {
			n = c;
		}
		
		else if (d > 0) {
			n = d;
		}
		
		else if (e > 0) {
			n = e;
		}
		System.out.println(n);
		
		String firstn = a.substring(0,n);
		
		System.out.println(firstn);
		
		String opp = a.substring(n,n + 1);
		
		System.out.println(opp);
		
		String secondn = a.substring(n+1,a.length());
		
		System.out.println(secondn);
		
		float number1;
		float number2;
		float result = 0;
  		 
		number1 = Float.valueOf(firstn);  
  		System.out.println(number1);
  		  
  		number2 = Float.valueOf(secondn);
  		System.out.println(number2);
  		
  		if (opp.contains("*")) {
  			System.out.println( number1 * number2);
  		}		  
  		else if (opp.contains("/")) {
  			System.out.println( number1 / number2);
  		  }
  		  
  		  else if (opp.contains("+")) {
  			System.out.println( number1 + number2);
  		  }
  		  
  		  else if (opp.contains("-")) {
  			System.out.println((number1 - number2));
  		  }
		
	}
	
}
