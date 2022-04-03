/*
Idea of encapsulation -> Protecting the variables and methods from outer word.
making all methods and clases in a one class.
*/

class Student{
	private String name;
	private int roll_no;
	//setters
	//setting for name
	public void setName(String a){
		if (a.length() > 0 && a.length() < 20){
			name = a;
		} 
		else{
			System.out.println("Throw Exception");
		}
    }
	
	//setting for roll Number
	public void setRoll(int b){
		if(b > 0 && b<100){
			roll_no = b;
		}

	}
	//getters
	//getting the values
	public String getName(){
		return name;
	}
	public int getRoll(){
		return roll_no;
	}
}


public class encapsulation{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Raj");
		s1.setRoll(45);
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
	}
}



/*
OUTPUT
Raj
45
*/
