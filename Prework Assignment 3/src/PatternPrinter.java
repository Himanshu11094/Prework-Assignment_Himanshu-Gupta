import java.util.Scanner;

public class PatternPrinter {

	
	static void patternPrinter(int num) {
		// write your code here
		
		for(int i=0; i<num; i++)
		{
			for(int j=num; j>0; j--)

			{
				for(int k=0; k<num-i;k++)
				{
					System.out.print(j);
					}
		
			}
		System.out.println("");
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number for the pattern: ");

	patternPrinter(input.nextInt());
	
	}

}


 