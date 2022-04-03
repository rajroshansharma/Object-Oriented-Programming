abstract class parent2{
	//constructor -> I think this will execute in every situtaion
	public parent2(){
		System.out.println("Hello brother");
	}
	
	//simple methods
	public void say_hello(){
		System.out.println("Hello bol deyain.");
	}
	
	//abstract methods
	abstract public void greet();
}

//Creating a child class because we can't access the methods and the variables of 
//an abstract class untill and unless we make a child class.

class child2 extends parent2{
	@Override
	public void greet(){
		System.out.println("Nameste bol rahe h.");
	}
}

public class Main {
	public static void main(String[] args) {
		child2 ob1 = new child2();   // creating a object and accessing the methods
		ob1.greet();
	}
}

/*
OUTPUT
Hello brother
Nameste bol rahe h.
*/
