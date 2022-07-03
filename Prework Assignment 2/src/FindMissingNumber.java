import java.util.Scanner;

public class FindMissingNumber {

	static int backendwork(int num, int arr[])
	
	{
		int counter =0;
		for(int check =1; check < num; check++)
		 {
			while(check != arr[counter])
		 {
			counter++; 
			if (counter==arr.length)
			{return check;}
		 }
			counter =0;
		 }
	return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size=0;
		int missingNum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the sequence: ");
		size = input.nextInt();
		
		int elements[] = new int[size-1];
		
		System.out.println("Enter the elements(size n-1): ");
		
		for (int i=0; i<size-1; i++)
		{
			elements[i] =  input.nextInt();
		}
	
		missingNum = backendwork(size, elements);
	
		System.out.println("Missing Number from list is: "+ missingNum);
		
	}

}
