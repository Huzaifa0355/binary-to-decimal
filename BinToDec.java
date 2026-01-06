import java.util.*;

public class BinToDec{
	// function to change binary number in decimal 
	public static void binaryToDecimal(int binary){
		// Scanner sc = new Scanner(System.in);
		// int binary = sc.nextInt();
		int binarynum = binary;
		int pow = 0;
		int dec = 0;
		
		while( binary > 0 ){
			int lastdigit = binary % 10;
			dec = dec + (lastdigit * (int)Math.pow(2, pow));
			
			pow++;
			binary /= 10;
		}
		System.out.println("binary " + binarynum + " to decimal is : " + dec );
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.pritln(" you entered in program of conversation of binary to decimal");
		System.out.print("enter binary Number : ");
		
		int binary = sc.nextInt();
		binaryToDecimal(binary);
		
	}
}
