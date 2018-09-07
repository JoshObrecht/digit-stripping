import java.util.ArrayList;
import java.util.Scanner;
public class DigitStripping
	{
		static boolean playAgain=true;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput2= new Scanner(System.in);
		public static void main(String[] args)
		{
			do
				{
			System.out.println("Which challenge would you like to run? "
					+ "\n \n"
					+ "1) Fill Array \n"
					+ "2) Report Digits Text \n"
					+ "3) Report Odd Numbers \n"
					+ "4) Add the Numbers \n"
					+ "5) Round the Added Number."
					+ "\n \n"
					+ "Type the number that corresponds with your choice.");
			int userChoice = userInput.nextInt();
			switch(userChoice)
			{
				case 1:
					fillArray();
					break;
				case 2:
					reportDigits();
					break;
				case 3:
					reportOddNumbers();
					break;
				case 4:
					addNumbers();
					break;
				case 5:
					roundNumber();
					break;
					
				default:
					System.out.println("User input not recognized.");
					break;
			}
			runAgain();
		}
		while(playAgain);
		}
		public static void fillArray()
		{
		int[] numbers = new int [6];
		System.out.println("Give me a six digit integer!");
		int userNumber= userInput2.nextInt();
		for(int i=numbers.length-1; i>=0; i--)
			{
			numbers[i]=userNumber%10;
			userNumber/=10;
			}
		for(int n:numbers)
			{
				System.out.println(n);
			}
		
		}
		public static void reportDigits()
			{
				System.out.println("Give me a number.");
				int userNumber = userInput.nextInt();
				int counter=0;
				boolean repeat=true;
				
				do
					{
					
					if(userNumber==0)
						{
							repeat=false;
						}
					else
						{
						userNumber/=10;
						counter+=1;
						}
					}
				while(repeat);
				System.out.println("That number had "+counter+" digits.");
			}
		public static void reportOddNumbers()
		{
			System.out.println("Give me a number.");
			int userNumber=userInput.nextInt();
			int strippedNumber=0;
			int counter=0;
			boolean repeat=true;
			
			do
				{
					if(userNumber==0)
						{
							repeat=false;
						}
					else
						{
							strippedNumber= userNumber%10;
							if(strippedNumber%2!=0)
								{
									counter+=1;
								}
							userNumber/=10;
						}
				}
			while(repeat);
			System.out.println("Your number had "+counter+" odd number(s).");
			
		}
		public static void addNumbers()
		{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int strippedNumber=0;
		int counter=0;
		boolean repeat=true;
		System.out.println("Give me a number.");
		int userNumber=userInput.nextInt();
			
		do
			{
				if(userNumber==0)
					{
						repeat=false;
					}
				else
					{
						strippedNumber= userNumber%10;
						if(userNumber!=0)
							{
								numbers.add(strippedNumber);
							}
						userNumber/=10;
					}
			}
		while(repeat);
		
		for(int n: numbers)
			{
				counter+=n;
			}
		System.out.println("The stripped digits of the number you gave me added together is "+counter+".");
		
		}
		public static void roundNumber()
			{
				ArrayList<Integer> numbers = new ArrayList<Integer>();
				int strippedNumber=0;
				int counter=0;
				boolean repeat=true;
				int roundedNumber=0;
				System.out.println("Give me a number.");
				int userNumber=userInput.nextInt();
		
					
				do
					{
						if(userNumber==0)
							{
								repeat=false;
							}
						else
							{
								strippedNumber= userNumber%10;
								if(userNumber!=0)
									{
										numbers.add(strippedNumber);
									}
								userNumber/=10;
							}
					}
				while(repeat);
				
				for(int n: numbers)
					{
						counter+=n;
					}
				System.out.println(counter%10);
				if(counter%10>=5)
					{
					System.out.println("The stripped digits of the number you gave me added together is "+counter+".");
				    roundedNumber=counter/10;
					roundedNumber+=1;
					roundedNumber*=10;
				    System.out.println("That number rounded to the nearest tenth is "+roundedNumber+".");
					}
				else
					{
					System.out.println("The stripped digits of the number you gave me added together is "+counter+".");
					roundedNumber=counter/10;
					roundedNumber*=10;
					System.out.println("That number rounded to the nearest tenth is "+roundedNumber+".");
					}

			}
		public static void runAgain()
			{
				System.out.println("");
				System.out.println("Would you like to run another challenge? (Type y/n for yes/no respectively)");
				String userChoice= userInput2.nextLine();
				if((userChoice.equalsIgnoreCase("n")))
				{
				System.out.println("See you later!");
				playAgain=false;
				}
				
			}
		
	}
