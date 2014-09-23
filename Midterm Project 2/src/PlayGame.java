import java.util.Scanner;


public class PlayGame {
	static String name;
	static int userPlayer;
	static int computerPlayer;
	static boolean keepPlaying;
	
	
	public static void greetPlayer()
		{
		System.out.println("Hello, whats your name?");
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
		System.out.println("Nice to meet you " + name + "!");
		System.out.println("We are going to play PIG Basketball.");
		System.out.println("");
		
		int counter =1;
		System.out.println("Which player would you like to play with. Choose the number according to the player.");
		for (int i=0; i<DataOfPlayers.dataOfPlayers.size(); i++)
		{
			System.out.println(counter);
			//print out names of players to choose from 
			System.out.println();
		}
		Scanner userInput = new Scanner(System.in);
		userPlayer = userInput.nextInt();
		if (userPlayer ==1 )
		{
			computerPlayer=2;
		}
		else
		{
			computerPlayer=1;
		}
		
		}
	public static void shootShots()
	{
		String[] whichShot ={"Free Throw", "Three Pointer", "Mid Range", "Layup", "Backwards Shot"};
		do 
		{
		//generate random number 
			// ask user  which shot want to shoot 
			//if random number is lower than players percentage for that shot then make else miss
			// if usershot = make and computershot = miss then add letter to computer
			//else dont add letter
			//if total misses after a make ==3 then game over rached pig 
		}
		while (keepPlaying);
	}
}
