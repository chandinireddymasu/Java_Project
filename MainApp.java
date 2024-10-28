package project;



import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Library l = new Library();
		Scanner s = new Scanner(System.in);
		boolean isStart=true;
		while(isStart) {
			System.out.println("Enter the choice:\n 1.To Add the book\n 2.Display book details\n 3.Search book based on id\n 4.Search book based on Author\n 5.Update cost of the book based on title \n 6.Remove book details by Id \n 7.Exit");
			int ch=s.nextInt();
			switch(ch) {
			case 1:
				
			{
				while(true) {
					try {
						System.out.println("Enter the title of book");
						String s1=s.next();
						System.out.println("Enter the id of book");
						int i1=s.nextInt();
						System.out.println("Enter the pages of book");
						int i2=s.nextInt();
						System.out.println("Enter the cost of book");
						int i3=s.nextInt();
						System.out.println("Enter the author of the book");
						String s2 =s.next();
					
						l.addBook(new Book(s1,i1,i2,i3,s2));
						
					}
					catch(BookTitleMisMatchException e ) {
						System.out.println("Enter the valid title");
						 String title =s.next();
								}
					catch(CostOutOfBoundException e1) {
						System.out.println("Enter the valid cost");
						 int cost=s.nextInt();

					}
					catch(BookIdMisMatchException e2) {
						System.out.println("Enter the valid id");
						int id=s.nextInt();

					}
					catch( BookpagesOutofBoundException e3) {
						System.out.println("Enter the valid noof pages");
						int id=s.nextInt();

					}
					catch(AuthorNameMisMatchException e4) {
						System.out.println("enter the valid author name");
						String author=s.next();
						
					}
				}
				
			}
			
			case 2:
				
			{
				
				l.displaybook();
				
				
			}
			break;
			case 3:
			{
				System.out.println("enter the id");
				int i=s.nextInt();
				l.searchBookBasedOnId(i);
			}
			break;
			case 4:
			{
				System.out.println("Enter the author name");
				String s1 = s.next();
				l.searchBasedOnAuthor(s1);
			}
			 break;
			case 5:
			{
				System.out.println("Enter the title of the book");
				String s1=s.next();
				l.updateBookcostBasedontitle(s1);
			}
			break;
			case 6:
			{
				System.out.println("Enter the id");
				int i=s.nextInt();
				l.removeBookBasedOnId(i);
			}
			break;
			case 7:
			{
				isStart=false;
				System.out.println("Thank you...!");
			}
			break;
			default:
				System.out.println("Entered invalid choice");
				
			}
		}
	}

}
