//IMPLEMENTING upcasting
//for IMPLEMENTING run-time polymorphism.

class Bike{
	public void run(){
		System.out.println("Bike is running!");
	}
}

class Pulser extends Bike{
	public void run(){
		System.out.println("Pulser is safley running at 180KM/h.");
	}
}

public class Main {
	public static void main(String[] args) {
		Bike b1 = new Pulser();
		b1.run();
	}
}

/*
OUTPUT
Pulser is safley running at 180KM/h.

from super class we are making object of a child class.
so the object of which is created after new keyword, the method present in that 
class will run.

if we write 
Bike b1 = new Bike();
then the run() method will be run from the bike class, but if we want to make the object of super class 
and run the method of cild class then we will use upcasting.
method overriding is taking place.
*/
