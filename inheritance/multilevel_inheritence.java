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

//child class 1
class dog extends Animal{
    void bark(){
        System.out.println("I can bark");
    }
}

class german_sephard extends dog{
    void black_white(){
        System.out.println("I have balck and white spots");
    }
    void loud_bark(){
        System.out.println("I bark very loud");
    }
}


public class multilevel_inheritence {
    public static void main(String[] args) {
        german_sephard d1 = new german_sephard();
        d1.eat();
        d1.walk();
        d1.sleep();
        d1.bark();
        d1.black_white();
        d1.loud_bark();
    }
}


/*
OUTPUT
I eat food
I can walk
I also sleep
I can bark
I have balck and white spots
I bark very loud

  _________
 |_________|
     ^
  _________
 |_________|
     ^
  _________
 |_________|
*/