class Employee{
	String name;
	String Id;
	String department;
	int age;
	int exprence;
	double salary;
	public void greet(){
		System.out.println("I am a employee.");
	}
}

class Manager extends Employee{
	String managing_Department;
	@Override
	public void greet(){
		System.out.println("I am a manager.");
	} 
}


public class Main {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.greet();
		Employee e1 = new Employee();
		e1.greet();
	}
}


/*OUTPUT
I am a manager.
I am a employee.


NOTE
In Java, inheritance is an is-a relationship. That is, we use inheritance only if there exists an is-a relationship between two classes. For example,
Manager is a employee

->Method overriding
if the same method is present in both the superclass and subclass then that method is 
said to be method overriding.
*/
