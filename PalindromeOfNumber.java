package week1.day2;

public class PalindromeOfNumber {

	public static void main(String[] args)
	{
		int num= 454, rem, sum =0;
		int temp = num;
		while(num != 0)
		{
			rem = num%10;
			sum = sum*10 + rem;
			num = num/10;			
		}
		if(temp == sum)
		{
			System.out.println("The given number is palindrome: " + temp);		
		}
		else
			System.out.println("The given number is not a palindrome");

	}

}
