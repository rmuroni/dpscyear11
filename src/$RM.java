import java.util.Arrays;

public class $RM {

	

	public static boolean isVowel(String s) {
		
		String v = "aeiou";
		System.out.println("String");
		s = s.toLowerCase();
		
		if (v.indexOf(s) == -1) {
			return false;
		}
		
		return true;
	}
	
	public static int euler1(int n) {
		int count = 0;
		for (int i = 0; i < n; i ++) {
			if(i % 3 == 0) {
				count = count + i; 
			}
			else if (i % 5 == 0) {
				count = count + i;
			}
		}
		return count;
	}
	
	
	
	public static void print(String s) {
		System.out.println(s);
	}

	/**
	 * This takes two strings a and b and returns a + b
	 * @param a
	 * @param b
	 * @return 
	 * 
	 * preconditions - a and b are valid strings
	 * postconditions - no post conditions 
	 */
	
	public static String addStrings(String a, String b ) {
		
		return a + b;
	}
	
	/** 
	 * This method takes a string as a parameter and returns true
	 * if it is even length and false if it is odd length
	 * 
	 * @param a
	 * @return
	 */
	
	public static boolean isEvenString(String a){
		
		if (a.length() % 2 == 0) {
			return true;
		}
		return false; 
	}
	
	
	/**
	 * This method takes a string as a parameter and returns the 
	 * the first n chars unless n is greater than the length of 
	 * the string and it returns the full string 
	 * @param a
	 * @param n
	 * @return
	 * 
	 * preconditions- n is greater than zero 
	 */
	
	public static String pullN(String a, int n) {
		
		if (n > a.length()) {
			return a;
		}
		
		String result = a.substring(0,n);
		
		return result;
		
		
		
	}
	
	/**
	 * This method takes a string as a parameter and returns the 
	 * middle of the string unless it is odd where it returns
	 * nothing 
	 * @param a
	 * @return
	 */
	
	public static String findMiddleOdd(String a) {
		if (a.length() % 2 != 0){
			return a.substring((a.length()-1)/2,(a.length()-1)/2 + 1);
		}
		
		return "not good";
	}
	
	/**
	 * This method takes a string a string and checks if it is odd or even
	 * if it is even then it returns the middle two numbers else it returns the
	 * middle number
	 * @param a
	 * @return
	 */
	
	public static String findMiddle(String a) {
		if (a.length() % 2 != 0){
			return a.substring((a.length()-1)/2,(a.length()-1)/2 + 1);
		}
		return a.substring((a.length()-1)/2,(a.length()-1)/2 + 1) + "," + a.substring((a.length()-1)/2 + 1,(a.length()-1)/2 + 2);
	}
	
	/**
	 * This method returns the longer of the two strings
	 * @param a
	 * @param b
	 * @return
	 */
	
	public static String findLonger(String a, String b) {
		if (a.length() > b.length()) {
			return a;
		}
		return b;
	}
	
	
	/**
	 * 
	 */
	
	
	public static int printMatrix(int r, int c) {
		int count = 1;
		for(int i = 0; i < r; i ++) {
			System.out.println("");
			for (int p = 0; p < c; p ++) {
				System.out.println(count + "");
				count ++;
			}
		}
		return 0;
	}
	
	
	/**

	 * 

	 * @param a

	 * @param b

	 * @return

	 */

	public static boolean foundElement(int a[], int b) {

		int q = 0;

		int cnt = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == b) {

				q = 1;

				break;

			}

		}

		

		if (q == 1) {

			return true;

		} else {

			return false;

		}

		

		

	}


	
	/** 
	 * This method takes a base 2 value and returns the base 10 value
	 * @param n
	 * @return
	 * pre-condition: n can only contain 1 and 0 values.
	 */
	
	public static int base2To10A(int n) {
		int pwr = 0;
		int r = 0;
		
		while (n > 0) {
			int x = n % 10;
			n = n / 10; //INTEGER DIVISION
			
			// Cast Math.pow(2,pwr) to an int
			// casting is the process of changing type
			// when we cast a double to an int we chop off decimal
			
			r = r + x * (int)Math.pow(2,pwr);
			
			pwr = pwr + 1;
		}
		
		return r;
	}
	
	
	public static int base2To10B(int n) {
		
		/* 
		 * Convert to a string instead of using the mod int div process
		 */
		// Convert n into a string ?
		
		String value =  "" + n;
		
		int pwr = 0;
		int r = 0;
		
		// Bread and butter algorithm: looping through a string and accessing each element
		
		for (int i = value.length() -1; i >= 0; i = i --) {
			
			
			//Step 1: access the right most digit cast to int
			int x = Integer.parseInt(value.substring(i,i + 1));
			
			r = r + x*(int)Math.pow(2,pwr);
			pwr = pwr + 1;
			
		}

		return r;

	}
	
	// Test code for base 10 to base 2
	
	public static int base10toBase2(int n) {
		
		String r = "";
		
		while(n > 0) {
			
			int x = n % 2;
			
			n = n/2; // this is integer division 
			
			r = x + r;
			
		}
		
		return Integer.parseInt(r);
		
	}
	
	// Changing type (called "casting)
	
	public static int base10toBaseN(int n, int base) {
			
			String r = "";
			
			while(n > 0) {
				
				int x = n % base;
				
				n = n/base; // this is integer division 
				
				r = x + r;
				
			}
			
			return Integer.parseInt(r);
			
	}
	
	/**
	 * Class work Oct 15. This function takes an array of strings and finds the
	 * largest value alphabetically. If the array is empty the function returns
	 * null
	 * @param s
	 * @return
	 * 
	 * pre-condition: The array can be any length but must exist
	 * post-condition: The array is left unchanged
	 */
	
	public static String findAlphaSmallest(String[] s) {
		//Bad -Works but violates post condition
		//Arrays.sort(s);
		//return s[0];
		
		String min = s[0];
		
		for(int i = 0; i < s.length; i ++) {
			if(s[i].compareToIgnoreCase(min) < 0) {
				min = s[i];
			}
		}
		return min;
	}
	
	
//Class work Oct 10th 2019	
	
	/**
	 * This function takes an array of integers and returns
	 * the sum of the digits
	 * @param a
	 * @return
	 * 
	 * pre-condition: All elements are digits in length
	 * post-condition: a is not changed when the function is done.
	 */
	
	public static int findArrayDigitSum(int [] a) {
		return -1;
	}
	
	// Homework for Nov 6th 2019
	
	/**
	 * We are having a party with amounts of tea and candy. Return the int 
	 * outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is 
	 * good (1) if both tea and candy are at least 5. However, if either tea or 
	 * candy is at least double the amount of the other one, the party is great (2). 
	 * However, in all cases, if either tea or candy is less than 5, the party is always
	 *  bad (0).
	 * @param args
	 * pre-condition: tea and candy are ints that range between 0-10
	 * Post-condition: returns a 0, 1, or 2
	 */
	
	public static int teaParty(int tea, int candy) {
		if ((tea >= (candy * 2) || candy >= (tea * 2)) && tea >= 5 && candy >= 5 ){
		    return 2;
		  }
		  if (tea < 5 || candy < 5){
		    return 0;
		  }
		  else return 1;
	}
	
	public static void whileloop(int k, int n) {
		while(k <= n) {
			System.out.println(k);
			k = k + 1;
		}
	}
	
	public int [][] HLP1NOV201714(){
		int [] values = {7, -3, 9, -1, -6, -5, 1};
		int [] rowc = {1, 2, 3, 3, 4, 7};
		int [] col = {0, 2, 4, 2, 1, 4, 5};
		
		// Write the algorithm that will take these three
		// arrays and created the resulting 2D array. When 
		// When you run this it should return the 6 by 6 
		//array given in the question.
		
		return null;
	}
	
	public static void main(String[] args) {
		int k = 1;
		int n = 5;
		whileloop(k,n);
		
		
		int t = 5;
		int c = 5;
		int r = -1;
		
		
		System.out.println("**********"+euler1(1000));
		
		r = teaParty(t, c);
		System.out.println("teaParty = " + r);
		
		String[] arr = {"cat","dog","fish","apple"};
		
		String min = findAlphaSmallest(arr);
		System.out.println(min);
				
		System.out.println("cat".compareToIgnoreCase("dog"));
		
		System.out.println("dog".compareToIgnoreCase("dog"));
		System.out.println("dog".compareToIgnoreCase("cat"));

		
		print("Robert");
		
		//test code addString 
		
		System.out.println(addStrings("Paul","Miskew"));
		
		//test code isEvenString
		
		System.out.println(isEvenString("even"));
		System.out.println(isEvenString("odd"));
		
		//test code findMiddleOdd
		System.out.println(findMiddleOdd("123456789"));
		
		
		//test code findMiddle
		System.out.println(findMiddle("1234567890"));
		
		
		//test code findLonger
		System.out.println(findLonger("Hello","Hiiiiiiii"));
		
		
		//test code Base2ToBase10A
		int x = base2To10A(1011);	
		System.out.println(x);
		x = base2To10A(0);
		System.out.println(x);
		
		//test code Base2ToBase10B
		
		x = base2To10B(1011);	
		System.out.println(x);
		x = base2To10B(0);
		System.out.println(x);
		
		
		// Test code base10toBase2
		
		System.out.println(base10toBase2(233));
		System.out.println(printMatrix(4,3));
		
		

	}

	
}
