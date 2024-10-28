package project;

public class BookpagesOutofBoundException  extends RuntimeException{
	public String tostring() {
		return getClass()+" : you enter invalid noofpages";
	
	}


}
