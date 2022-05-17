package simpleCalculator;

public class Calculator {

	int number1,number2;
	
	String operator;
	
	double result;
	
	public Calculator(int number1,int number2,String operator) {
		
		this.number1 = number1;
		this.number2 = number2;
		this.operator = operator;			
	}
	
	void operators() { 
		
		switch (operator){
		case "addition":
			result = number1+number2;
			System.out.println("Result for addition "+result);
			break;
			
		case "subtraction":
			result = number1-number2;
			System.out.println("Result for addition "+result);
			break;
			
		case "multiplication":
			result = number1*number2;
			System.out.println("Result for addition "+result);
			break;
			
		case "division":
			result = number1/number2;
			System.out.println("Result for addition "+result);
			break;
			
		case "modulus":
			result = number1%number2;
			System.out.println("Result for addition "+result);
			break;
			
			default:
				
				System.out.println("Enter the valid operator");
		}
	}
}
