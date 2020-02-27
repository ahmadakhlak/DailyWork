package array;

public class CalculatorLambda {

	public static void main(String[] args) {
	Hello1 add=(a,b) -> a+b;
	System.out.println(add.calculate(3, 4));
	Hello1 sub=(a,b) -> a-b;
	System.out.println(sub.calculate(3, 4));
	Hello1 mul=(a,b) -> a*b;
	System.out.println(mul.calculate(3, 4));
	Hello1 div=(a,b) -> a%b;
	System.out.println(div.calculate(5, 4));
	
		
	}

}
@FunctionalInterface
interface Hello1
{
	double calculate(double a, double b);
	
	}