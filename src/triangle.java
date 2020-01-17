
public class triangle {

	private int alength;
	private int blength;
	private int baselength;
	
	
	public triangle() {
		
	}
	public triangle (int a, int b, int c) {
		alength = a;
		blength = b;
		baselength = c;
	}
	
	
	public int Getalength(){
		return alength;
	}
	public int Getblength(){
		return blength;
	}
	public int Getbaselength(){
		return baselength;
	}
	
	public void setalength(int a) {
		if (a > 0) {
			alength = a;
		}
	}
	public void setblength(int b) {
		if (b > 0) {
			blength = b;
		}
	}
		
	public void setbaselength(int c) {
		if (c > 0) {
				baselength = c;
		}
	}
	
	public int getper() {
		return alength + blength + baselength;
	}
	
}
