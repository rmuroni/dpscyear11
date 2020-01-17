import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculator2 {

	public static void main(String[]args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter values and operation");
		String  a = br.readLine() + "+0";
		String numb = "";
		String[] opp = new String[100];
		int j = 0;
		float result = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if((a.charAt(i) != '+') && (a.charAt(i) != '-')) {
				 numb = numb + a.charAt(i);
				 
				 if(i < a.length() - 1)
				 {
					opp[j] = numb;
					j++;	 
				 }
			}
			else {
				opp[j] = numb;
				j++;
				numb = "";

				opp[j] = "" + a.charAt(i);
				j++;
			}
		}
		
		result = Float.valueOf(opp[0]);
		for(int i = 1; i < j - 1; i++) {
				if (opp[i].contains("+")) {
					result = result + Float.valueOf(opp[i + 1]);
				}
				if (opp[i].contains("-")) {
					result = result - Float.valueOf(opp[i + 1]);
				}
		}
		System.out.println(result);
	}
	
}
