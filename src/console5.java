import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class console5 {
	
	public static void main(String[] Args) throws IOException  {
		
		float store1[] = new float[100];
		float store2[] = new float[100];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter first array");
		String a = br.readLine();
		
		String[] s1 = a.split(",");
		
		for (int i = 0; i < s1.length; i++) {
			store1[i] = Float.valueOf(s1[i]);
		}
		
		float avg1 = Average(store1,s1.length);
		
		System.out.println("enter second array");
		String b = br.readLine();
		
		String[] s2 = b.split(",");
		
		for (int i = 0; i < s2.length; i++) {
			store2[i] = Float.valueOf(s2[i]);
		}
		
		float avg2 = Average(store2,s2.length);
		
		if (avg2 > avg1) {
			System.out.println("Second string has a greater average number");
		}
		else {
			System.out.println("First string has a greater average number");
		}
		
	}
	
	public static float Average(float store[], int len) {
		float sum = 0;
		for (int i = 0; i < len; i++) {
			sum = sum + store[i];
		}
		return sum/len;
	}
}
