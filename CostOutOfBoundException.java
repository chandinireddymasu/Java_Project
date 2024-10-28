package project;

public class CostOutOfBoundException  extends RuntimeException{
	public String tostring() {
		return getClass()+" : you enter the out of range cost";
	
	}


}
