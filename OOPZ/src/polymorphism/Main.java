package polymorphism;

public class Main {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b);
    }
    void sum(String a,String b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
//       Main obj=new Main();
//        obj.sum(1,2);
//        obj.sum(1,3,5);
//        obj.sum("venki","venkatesh");
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square square=new Square();
        square.area();
    }
}
