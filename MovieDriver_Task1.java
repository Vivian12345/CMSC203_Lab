import java.util.Scanner;

public class MovieDriver_Task1 {
	
	
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Movie m = new Movie();

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
		
		
	}
	
	
}
