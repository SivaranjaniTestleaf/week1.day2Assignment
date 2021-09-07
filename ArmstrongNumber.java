package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int input = 153;
		
		double calculated = 0;
		int original,remainder;
		original = input;	
		while (original != 0)
		{
			remainder = original % 10 ;
			original = original / 10;
			calculated += (Math.pow(remainder,3));

			System.out.println(calculated);
		}
		if(calculated == input)
		{
			System.out.println("The given number is Armstrong: " + input);
		}
		else 
		{
			System.out.println("The given number is not an Armstrong:"+ input);
		}
	

	}

}
