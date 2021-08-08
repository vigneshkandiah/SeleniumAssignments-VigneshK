package Week1.Day1.Assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
	int originalNumber=371;	
	int number=371;
	int result=1;
	
	
	while(number!=0) {
		
		int reminder= number%10;
		
		 int newnumber= number/10;
		 
		 
		
   result=result+reminder*reminder*reminder;
		
		number=newnumber;
				
	}

	result=result-1;


	
	if (originalNumber==result) {
		
		System.out.println("The given number is a ArmstrongNumber");
		
		
	}else {
		System.out.println("The given number is Not a ArmstrongNumber");
		
	}
	
	
		
		
	}
	
}


