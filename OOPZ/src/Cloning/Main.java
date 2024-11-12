package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human venki=new Human(23,"Venkatesh");
//        Human twin=new Human(venki);
        Human twin= (Human) venki.clone();
        System.out.println(twin.age+" "+twin.name);
    }
}
