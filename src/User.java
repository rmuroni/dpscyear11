
public class User extends Object{
	private String password;
	private String username;
	private String Firstname;
	private String Lastname;
	
	public User(String fn, String ln, String pwd) {
		Firstname = fn;
		Lastname = ln;
		password = pwd;
		
		username = Firstname.substring(0,1) + "." + Lastname;
	}
	
	
	
	public String getusername() {
		return username;
	}
	
	public int findlengthofpassword() {
		return password.length();
	}
	
	public String toString(){
		return "buf";
	}
	public String returnevenchars() {
		String certainnums = "";

		for (int i = 0; i < password.length(); i++) {
			if ( i % 2 == 0) {
				certainnums = certainnums + password.substring(i, i + 1);
			}
		}
		return certainnums;
	}
}
