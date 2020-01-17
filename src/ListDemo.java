import java.util.ArrayList;

public class ListDemo {

	public static boolean isVowel(char c) {
		System.out.println("char");
		if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'y' || c== 'i') {
			return true;
		}
		
		return false;
		
	}

	public static void main(String[] args) {
	
		//reference Type = object type (constructing the array list)
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		
		for(int i = list.size()-2; i >= 0; i --) {
			if (list.get(i) == 2) {
				list.remove(i);
				i = i -1;
			}
		}
		
		ArrayList<Character> vow = new ArrayList<Character>();
		
		vow.add('a');
		vow.add('b');
		vow.add('c');
		vow.add('d');
		vow.add('e');
		
		
		String vowels = "";
		
		for (int i = vow.size() - 1; i >= 0; i--) {
			
			//System.out.println(vow.get(i));
		
			if ($RM.isVowel("" + vow.get(i))) {
				
				vowels = vowels + vow.get(i);
				
				vow.remove(i);
			}
		}
		
		System.out.print(vow);
	}
	
	
}
