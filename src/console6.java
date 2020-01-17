import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class console6 {

	public static void main(String[]Args) throws IOException {
		
		String min = "";
		String max = "";
		
		//String[] strArray1 = new String[100];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter first array");
		
		String a = br.readLine();
		String[] words = a.split(",");
		
		//for (int i = 0; i < words.length; i++) {
		//	strArray1[i] = words[i];
		//}
		
		min = findshortest(words);
		max = findlongest(words);
		
		System.out.println("the smallest number is: " + min);
		System.out.println("the greatest number is: " + max);
	}
	
	public static String findshortest(String array[]) {		
		String min = "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() < min.length()) {
				min = array[i];
			}
			
		}
		
		return min;

	}
	public static String findlongest(String array[]) {
		
		String max = "";
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > max.length()) {
				max = array[i];
			}
			
		}
		
		return max;

	}
}
