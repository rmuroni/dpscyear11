
public class Fraction {

	  //Attributes/Fields
	// Suggestion: Never use the same variable name that a field is in your class
	
		private int num;
		private int den;
		
		private static int fractioncount = 0;
		
	 // Constructors
		// if no constructor is written, a defult constructor
		// exits. Takes no parameters.
		
		// constructors are special instance methods that are
		// only called once at the time of construction
		//A constructor must be public
		// a constructor is always named used the class name
		// if you write a constructor, the default goes away
		
		public Fraction() {
			
		}
		
		public Fraction (int n, int d) {
			num = n;
				if (d != 0) {
					den = d;
				}
				else {
					den = 1;
				}
		}
		
	// you should always make fields private, this means they cannot be accessed without going through the class
	// private fields that must be modified or accessed need 
	//MUTATOR (SET) and ACESSOR(GET) methods.
	//behaviour
		
		public int getNum() { return num;}
		public int getDen() { return den;}
		public static int getFractionCount() {return fractioncount;}
		
		public void setNum(int n) {
			num = n;
		}
		public void setDen(int d) {
			if (d != 0) {
				den = d;
			}
		}
		
		public void reduce() {
			
			int gcf = 1;
			
			for (int i = 2; i <Math.min(this.num, this.den); i ++){
				if (this.num%i == 0 && this.den%i == 0) {
					gcf = i;
					
				}
			}
			this.num = this.num / gcf;
			this.den = this.den / gcf;
		}
		
		public void scale(int a) {
			num = num * a;

		}
		
		public void multiplyfraction(Fraction f) {
			num = num * f.num;
			den = den * f.den;			
		}
	
		public void simplify() {
			int lowest = num;
			
			if(den < lowest) {
				lowest = den;
			}
			
			for (int i = 2; i <= lowest; i++) {
				if(num % i == 0 && den % i == 0 ) {
					num = num/i;
					den = den/i;					
					// this is included in case a number can be
					// divided to "i" multiple times 
					i = i - 1;
				}
			}			
		}
		
		public double getPercentage() {

			double dec = 1.0*num/den;

			double percent = dec*100;

			return percent;

		}//end getPercentage
		
		public double getDecimal(){

			double dec = 1.0*num/den;

			return dec;

		}//end getDecimal
		
		public void addfraction(Fraction f) {
			num = num * f.den + f.num * den;
			den = den * f.den;
			
			int lowest = num;
			
			if(den < lowest) {
				lowest = den;
			}
			
			for (int i = 2; i <= lowest; i++) {
				if(num % i == 0 && den % i == 0 ) {
					num = num/i;
					den = den/i;					
					// this is included in case a number can be
					// divided to "i" multiple times 
					i = i - 1;
				}
			}
		}

		
			
}