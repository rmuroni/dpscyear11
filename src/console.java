import java.io.*;

public class console {
	
	public static void main (String [] args) throws IOException {
	
        float number1, number2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter first number:");
        String a = br.readLine();

        System.out.println("enter second number:");
        String b = br.readLine();
        try {
        	  number1 = Float.valueOf(a);
              number2 = Float.valueOf(b);
              System.out.println(number1 + number2);
        	}
        	catch(Exception e) {
        		System.out.println("You didn't enter a number");
        	}
        
	}
	
}
