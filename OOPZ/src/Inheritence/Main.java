package Inheritence;

public class Main {
    public static void main(String[] args) {
//        Box box=new Box(54,4,8);
//        Box box1=new Box(box);
//        System.out.println(box.l+" "+ box.w+" "+ box.h);

//        BoxWeight box3=new BoxWeight();
//        BoxWeight box4=new BoxWeight(2,2,2,4);
//        System.out.println(box4.h+" "+box4.weight);

        BoxPrice box5=new BoxPrice();
        System.out.println(box5.weight+" "+ box5.w+" "+ box5.p);

        BoxPrice box6=new BoxPrice(2,3,4,5,6 );
        System.out.println(box6.weight+" "+ box6.w+" "+ box6.p);


    }
}
