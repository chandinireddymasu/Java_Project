package project;

public class BookTitleMisMatchException  extends RuntimeException{
	public String tostring() {
		return getClass()+" : you enter invalid title";
	
	}


}
