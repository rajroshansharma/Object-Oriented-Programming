package importing_class_otherFile.package_class;

public class package2_class {
        public static void main(String[] args) {
            System.out.println("package2 is over here.");
            pack_two p1 = new pack_two();
            p1.print_two();
        }
}

class pack_two{
    void print_two(){
        System.out.println("package 2 is here any problem.");
    }
}
