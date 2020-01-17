
public class FractionRunner {

	public static void main(String[]args) {
	
		Fraction f1 = new Fraction(3,4);
		System.out.println(Fraction.getfractioncount());
		Fraction f2 = new Fraction();
		
		f1.setNum(2);
		f1.setDen(7);
		
		f2.setNum(4);
		f2.setDen(6);
				
		//f1.scale(4);
		
		//f1.multiplyfraction(f2);
		
		//f1.simplify();
		
		System.out.println(f1.getDecimal());

		System.out.println(f1.getPercentage());
		
		f1.addfraction(f2);
		
		System.out.println(f1.getNum() + "/" + f1.getDen());
	}
}
