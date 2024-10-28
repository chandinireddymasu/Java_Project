package project;



import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	private int libId;
	private String location;
	private Book b;
	
	private ArrayList<Book> book = new ArrayList<Book>();
	public void addBook(Book b) {
		book.add(b);
		System.out.println("Books added successfully....");
	}
	public void displaybook() {
		if(book.isEmpty()) {
			System.out.println("Books are Not added yet...");
		}
		else {
			for(Book b:book) {
				b.display();
			}
		}
	}
		public void searchBookBasedOnId(int id) {
			boolean isFound=false;
			if(book.isEmpty()) {
				System.out.println("Books are not added yet");
			}
			else {
				for(Book b: book) {
					if(b.getid()==id) {
						System.out.println("Book Title:"+b.gettitle());
						isFound=true;
					}
				}
				
			}
		  if(isFound == false) {
			  System.out.println("you have entered invalid bookid,,,book is not added");
		  }
		}
		public void searchBasedOnAuthor(String s) {
			boolean isFound=false;
			if(book.isEmpty()) {
				System.out.println("Books are not added yet");
			}
			else {
				for(Book b:book) {
					if(b.getauthor().equals(s)) {
						System.out.println("BookTitle :"+b.gettitle());
					isFound=true;
					}
				}
			}
			if(isFound=false) {
				System.out.println("you have entered invalid book Author,,,book not found");
			}
			
	}
		public void updateBookcostBasedontitle(String s) {
			boolean isFound=false;
			if(book.isEmpty()) {
				System.out.println("Books are not added yet");
			}
			else {
				for(Book b:book) {
					if(b.gettitle().equals(s)) {
						b.setcost(1000);
					System.out.println("cost has been updated successfully");
					isFound=true;
					}
				}
			}
			if(isFound=false) {
				System.out.println("you entered invalid book title,,,book not found");
			}
		}
		public void removeBookBasedOnId(int id) {
			boolean isFound=false;
			if(book.isEmpty()) {
				System.out.println("Books are not added yet");
			}
			else {
				Iterator<Book>itr=book.iterator();
				while(itr.hasNext()) {
					Book b =itr.next();
				if(b.getid()==id) {
					itr.remove();
					System.out.println("book is removed successfully");
					isFound=true;
					
				}
				}
				if(isFound=false) {
					System.out.println("you have entered invalid book id,,,book not found");
				}
			}
		}

}