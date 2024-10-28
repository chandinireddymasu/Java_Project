package project;

public class BookIdMisMatchException  extends RuntimeException{
	public String tostring() {
		return getClass()+" : you enter invalid id";
	
	}


}
