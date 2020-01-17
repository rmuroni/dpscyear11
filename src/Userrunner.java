
public class Userrunner {
	public static void main(String [] args) {
		User u1 = new User("Robert","Muroni","heijifihh");
		
		System.out.println("The assigned username is: " + u1.getusername());
		System.out.println("The length of the password is: " + u1.findlengthofpassword());
		System.out.println("The even chars of the password are:" + u1.returnevenchars());
		System.out.println(u1);
		//u1.username = "111";
	}
}
