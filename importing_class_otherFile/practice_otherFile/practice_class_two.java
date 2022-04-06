package practice_otherFile;

import javax.sound.sampled.SourceDataLine;

public class practice_class_two {
    public static void main(String[] args) {
        System.out.println("Hello world in practice two");
        
    }
    void greet_method(){
        greet g1 = new greet();
        g1.greet_one();
    }
    
}

class greet{
    void greet_one(){
        System.out.println("Hello manager");
    }
}
