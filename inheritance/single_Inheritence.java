package inheritance;

//Parent class
class Animal{
    void eat(){
        System.out.println("I eat food");
    }
    void walk(){
        System.out.println("I can walk");
    }
    void sleep(){
        System.out.println("I also sleep");
    }
}

//child class
class dog extends Animal{
    void bark(){
        System.out.println("I can bark");
    }
}


class single_Inheritance{
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.eat();
        d1.walk();
        d1.sleep();
        d1.bark();
    }
}

/*
OUTPUT
I eat food
I can walk
I also sleep
I can bark

  _________
 |_________|
     ^
  _________
 |_________|
     ^
*/