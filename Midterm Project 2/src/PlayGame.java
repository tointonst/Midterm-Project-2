import java.util.Scanner;

public class PlayGame
	{
	static String name;
	static int userPlayer, computerPlayer;
	static boolean keepPlaying;
	static int userShotChoice , computerShotChoice;
	static double userShotPercentage, computerShotPercentage;
	static String userShotOutcome, computerShotOutCome;
	static int userTotalMisses, computerTotalMisses;
	

	public static void greetPlayer()
		{
		System.out.println("Hello, whats your name?");
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
		System.out.println("Nice to meet you " + name + "!");
		System.out.println("We are going to play PIG Basketball.");
		System.out.println("");

		}

	public static void shootShots()
		{
		int counter = 1;
		System.out
				.println("Which player would you like to play with. Choose the number according to the player.");
		for (Player showPlayers : DataOfPlayers.dataOfPlayers)
			{
			System.out.println(counter);
			System.out.println(showPlayers.getNameOfPlayer());
			counter++;
			}
		Scanner userInput = new Scanner(System.in);
		userPlayer = userInput.nextInt();
		
		if (userPlayer == 1)
			{
			computerPlayer = 2;
			} else
			{
			computerPlayer = 1;
			}

		String[] whichShot =
			{ "Free Throw", "Three Pointer", "Mid Range", "Layup",
					"Backwards Shot" };
		int counter2 = 1;
		do
			{
			double userShotRandomNumber = (Math.random() * 100);
			double computerShotRandomNumber = (Math.random() * 100);
			System.out.println("Which shot would you like to take?");
			for (String printShot : whichShot)
				{
				System.out.print("(" + counter2 + ")" + printShot + "   ");
				counter2++;
				}
			Scanner userInput1 = new Scanner(System.in);
			userShotChoice = userInput1.nextInt();
			
			switch (userShotChoice)
				{
				case 1:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer - 1).getFreeThrowPercentage();
					break;
					}
				case 2:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer - 1).getThreePointPercentage();
					break;
					}
				case 3:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer - 1).getMidRangePercentage();
					break;
					}
				case 4:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer - 1).getLayupPercentage();
					break;
					}
				case 5:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer - 1).getBackwardsShotPercentage();
					break;
					}
				}
			if (userShotPercentage >= userShotRandomNumber)
				{
				System.out.println("Nice you made it!");
				userShotOutcome = "make";
				} 
				else
				{
				System.out.println("Sorry you missed.");
				userShotOutcome = "miss";
				}
			
			
			switch (computerShotChoice)
			{
			case 1:
				{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
						computerPlayer - 1).getFreeThrowPercentage();
				break;
				}
			case 2:
				{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
						computerPlayer - 1).getThreePointPercentage();
				break;
				}
			case 3:
				{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
						computerPlayer - 1).getMidRangePercentage();
				break;
				}
			case 4:
				{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
						computerPlayer - 1).getLayupPercentage();
				break;
				}
			case 5:
				{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
						computerPlayer - 1).getBackwardsShotPercentage();
				break;
				}
			
			if (computerShotPercentage>= computerShotRandomNumber)
				{
				System.out.println("Your opponent shot and made it.");
				computerShotOutCome ="make";
				}
			else
				{
				System.out.println("Your opponent shot and missed it.");
				computerShotOutCome = "miss";
				}
			
			if (userShotOutcome.equals("make") && computerShotOutCome.equals("make"))
			{
				System.out.println("Since you both make the shot no one gets a Letter");
			}
			else if(userShotOutcome.equals("make") && computerShotOutCome.equals("miss"))
			{
				System.out.println("Since you made it and he missed. He gets a Letter");
			}
			else if (userShotOutcome.equals("miss") && computerShotOutCome.equals("make"))
			{
				System.out.println("Since you missed it and he made the shot. You get a Letter.");
			}
			else
			{
				System.out.println("Both of you missed it. So neither gets a letter.");
			}
			
			switch (userTotalMisses)
			{
			case 1:
			{
			System.out.println("You gained the Letter- P");
			break;
			}
			case 2:
			{
				System.out.println("You gained another letter and you now have - PI");
				break;
			}
			case 3:
			{
				System.out.println("Dang man. Sorry but that was your last letter. You have PIG and lost the game.");
				keepPlaying = false;
				break;
			}
			}
			} 
			
			}while (keepPlaying);

	}
	}
