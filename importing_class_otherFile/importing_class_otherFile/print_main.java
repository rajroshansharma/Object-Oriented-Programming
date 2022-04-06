package importing_class_otherFile;
import importing_class_otherFile.package_class.package_class;
import importing_class_otherFile.package_class.package2_class;

class print_main{
    public static void main(String[] args) {
        System.out.println("hello world twice");
        package_class p1;
        p1 = new package_class();
        p1.print_line();
    }
}