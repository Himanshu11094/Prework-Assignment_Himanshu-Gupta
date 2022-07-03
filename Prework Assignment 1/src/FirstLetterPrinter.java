import java.util.Scanner;

public class FirstLetterPrinter {
	static int counter =1;

	static char[] letterPrinter(String data)
	{
		
		char letterCheck;
		char returnStr[] = new char[data.length()];
		
		returnStr[0] = data.charAt(0);
		
		for (int i=1; i<data.length(); i++)
		{
			letterCheck = data.charAt(i);
		
					if (letterCheck == ' ')
					{
						returnStr[counter]	= data.charAt(i+1);  
						counter++;						
					}
		}
		return returnStr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
		String letters;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String data = input.nextLine();
		 letters = String.valueOf(letterPrinter(data));
		
		 
		while(i<counter)
		{
		 
				System.out.print(letters.charAt(i));
		i++;	
		}
	}

}
