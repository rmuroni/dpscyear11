
public class Circle {
	int rad;
	double pi = 3.1415;
	
	
	public Circle(int r) {
		rad = r;
	}
	
	public double findarea() {
		double area = pi * rad * rad;	
		return area;
	}
	
	public void findper() {
		//double per = 2 * pi * rad;
		// return per;
	}
}
