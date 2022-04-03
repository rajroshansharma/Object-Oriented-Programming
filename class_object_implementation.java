class car{
	// State or field
	public int speed;
	public int gear;
	
	//behavior or Method
	public void distance_covred(int speed){
		if (speed < 50){
			System.out.println("Average");
		} 
		else{
			System.out.println("Danger or below average");
		}
		
	}
}

public class Main {
	public static void main(String[] args) {
		car ob1 = new car();   // creating a object and accessing the methods
		ob1.distance_covred(55);
	}
}


/*
OUTPUT
Danger or below average

this is a simple implemtiotion of class and objects
*/