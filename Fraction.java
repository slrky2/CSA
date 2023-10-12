public class Fraction {
	private int numerator;		//attributes
	private int denominator;
	
	// constructor
	public Fraction(int n, int d)	// constructor
	{
		numerator = n;
		denominator = d;
	}
	
	//TODO default constructor (no arguments)
    public fraction(){
        numerator = 2;
        denominator = 5;
    }
    

	
	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fraction add(Fraction other)
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();
		
		Fraction result = new Fraction(n,d);
		return result;
    }
	
	// TODO  subtract()
    public fraction subtract(fraction other){
        int n = this.numerator*other.denominator - this.numerator*other.denominator;
        int d = this.denominator * other.getDenom();
        fraction result = new Fraction(n, d);
        return result;


    }
	
	// TODO multiply()
	public fraction multiple(fraction other){
        int n = this.numerator*other.denominator * this.numerator*other.denominator;
        int d = this.denominator * other.getDenom();
        Fraction result = new Fraction(n, d);
        return result;
    }

	// TODO toString()
	   public String toString(){
        string s = numerator + "/" + denominator;
    }
	// TODO reciprocal()
	public fraction reciprocal(){
        int denominator = numerator;
        int numerator = denominator;
        Fraction result = new Fraction(numerator, denominator);
        return result;



    }
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);	// create an instance of fraction
		Fraction f2 = new Fraction(4,5);	
		
		Fraction f3 = f1.add(f2);			// add 2 fractions
		System.out.println("3/4 + 4/5 = " + f3);	// print the answer
		
        Fraction f4 = f1.subtract(f2);
        System.out.println(f1 + " - " + f2 + " = " + f4);
		/*
		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);
		

		Add code to multiply f1 and f2 here
		
		Add code to call reciprocal here
		
		create 2 new fractions and add them here.
		
    */	}}
