package polymorphism;

public class Square extends Shapes{

    public  void area(){
        System.out.println("Area is side * side");
    }

    public static void main(String s) {
        System.out.println(s+" Inside square main");
    }
}
