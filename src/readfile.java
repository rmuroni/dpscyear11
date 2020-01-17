import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class readfile {

	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/robert.muroni/Documents/words.txt"));
		
	    String line = br.readLine();
	    String file = "";

	    while (line != null) {
	    	System.out.println(line);
	    	
	    	file += line + "\n";
	        line = br.readLine();
	    }
	    
	    System.out.print(file);   
	    
	    System.out.println("1\n\t2\n3\n");
	}
	
}
