package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human venki=new Human(21,"venkie",10000,false);
        Human Hema=new Human(22,"Hema",15000,true);
        Human sanjay=new Human(23,"sanjay",12000,false);
        Human Heman=new Human(22,"Hema",25000,true);
//        System.out.println(sanjay.salary);
//        System.out.println(venki.population);
        System.out.println(sanjay.salary+" "+Human.population);
    }
}
