import java.util.Scanner;

public class PlayGame
	{
	static String name;
	static int userPlayer;
	static int computerPlayer;
	static boolean keepPlaying;
	static int userShotChoice;
	static double userShotPercentage;
	static int computerShotChoice;

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
				} else
				{
				System.out.println("Sorry you missed.");
				}
			
			computerShotChoice = userShotChoice;
			switch (userShotChoice)
			{
			case 1:
				{
				userShotPercentage = DataOfPlayers.dataOfPlayers.get(
						computerPlayer - 1).getFreeThrowPercentage();
				break;
				}
			case 2:
				{
				userShotPercentage = DataOfPlayers.dataOfPlayers.get(
						computerPlayer - 1).getThreePointPercentage();
				break;
				}
			case 3:
				{
				userShotPercentage = DataOfPlayers.dataOfPlayers.get(
						computerPlayer - 1).getMidRangePercentage();
				break;
				}
			case 4:
				{
				userShotPercentage = DataOfPlayers.dataOfPlayers.get(
						computerPlayer - 1).getLayupPercentage();
				break;
				}
			case 5:
				{
				userShotPercentage = DataOfPlayers.dataOfPlayers.get(
						computerPlayer - 1).getBackwardsShotPercentage();
				break;
				}
			
			// then make else miss
			// if usershot = make and computershot = miss then add letter to
			// computer
			// else dont add letter
			// if total misses after a make ==3 then game over rached pig
			} 
		
			}while (keepPlaying);
	}
	}
