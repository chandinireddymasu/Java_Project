package project;



public class Book {

	
	private static final boolean Validtaenoofpages = false;
	private String title;
	private int id;
	private int cost;
	private int noOfPages;
	private String author;
	private boolean validateauthor;
	public Book() {
	}
		public Book(String title,int id,int noOfPages,int cost,String author) {
			
			if(Validatetitle(title)) 
				
				this.title=title;
	
			if(validatecost(cost)) {
				this.cost=cost;
				
			}
			if(validtaeid(id)) {
				this.id=id;
			}
            
			if(Validtaenoofpages) {
				this.noOfPages=noOfPages;
				
			}
			if(validateauthor) {
				this.author=author;
				
			}
			
		
			
		}
		public void settitle(String title) {
			this.title=title;

	}
		public String gettitle() {
			return title;
		}
		public void setauthor(String author) {
			this.author=author;
		}
		public String getauthor() {
			return author;
		}
		public int getid() {
			return id;
		}
		public void setnoOfPages(int noOfPages) {
			this.noOfPages=noOfPages;
		}
		public int getnoOfPages() {
			return noOfPages;
		}
		public void setcost(int cost) {
			this.cost=cost;
		}
		public int getcost() {
			return cost;
		}
		public void display() {
			System.out.println("BookTitle:"+gettitle());
			System.out.println("Bookid:"+getid()); 
			System.out.println("Bookcost:"+getcost());   
			System.out.println("BooknoOfPages:"+getnoOfPages()); 
			System.out.println("Bookauthor:"+getauthor());  
			
		}
		@Override
		public String toString() {
			
				return " \n title "+title+ "\nid"+id+ "\n author" +author+ "\n noOfPages------->" +noOfPages + "\n cost" +cost +"\n id="+id+"\n-------------------------->";
			}
		
		public boolean Validatetitle(String title) {
			if(title.equals("java")|| title.equals("sql") || title.equals("python")) {
				return true;
			}
			else {
				BookTitleMisMatchException e=new BookTitleMisMatchException();
				throw e ;

			}
			
		}
		
		public boolean validtaeid(int id) {
			if(id%2==0) {
				return true;
			}
			else {
				BookIdMisMatchException e1=new BookIdMisMatchException();
				throw e1;
			}
			
		}
		
		public boolean validatecost(int cost) {
			if(cost >300 && cost <2000) {
				return true;
			}
			else {
				CostOutOfBoundException e2= new CostOutOfBoundException() ;
				throw e2;
			}
		}
		public boolean validatenoofpages(int nofpages) {
			if(nofpages >500 && cost <3000) {
				return true;
			}
			else {
				 BookpagesOutofBoundException e3= new  BookpagesOutofBoundException();
				 throw e3;
			}
		}
		
		public boolean validateAuthor(String Author) {
			if(Author.equals("James")|| Author.equals("Scott")||Author.equals("alen"));
			{
			    return  true;
			}
			
			
		}
			
				
			
				
		}
				
		
		
		
		
			


	