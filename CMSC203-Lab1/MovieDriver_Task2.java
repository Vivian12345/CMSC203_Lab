import java.util.Scanner;

public class MovieDriver_Task2 {
	
	
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Movie m = new Movie();
		var ifcontinue = true;
		
		while (ifcontinue)
		{
		System.out.println("Enter the title of a movie: ");
		String title = keyboard.nextLine();
		m.setTitle(title);
		
		System.out.println("Enter the movie’s rating: ");
		String rating = keyboard.nextLine();	
		m.setRating(rating);
		
		System.out.println("the number of tickets sold: ");
		var ticketsSold = keyboard.nextInt();
		keyboard.nextLine();
		m.setSoldTickets(ticketsSold);
		
				
		System.out.println(m.toString());
		
		System.out.println("Enter Y to continue or N to exit: ");
		
		
		while (true)
		{
			String res = keyboard.nextLine();
			if (res.equalsIgnoreCase("N") == true) {
				ifcontinue = false;
				System.out.println("Alright! Have a goooooood day!");
				break;
			}
			else if (res.equalsIgnoreCase("Y") == true){
				break;
			}
			else
				System.out.println("Please Enter Y or N: ");
		}
		}
		
		
		
		
		
		
	}
	
	
}
