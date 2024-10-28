package project;

public class AuthorNameMisMatchException  extends RuntimeException{
	public String tostring() {
		return getClass()+" : you enter invalid authorname";
	
	}


}
