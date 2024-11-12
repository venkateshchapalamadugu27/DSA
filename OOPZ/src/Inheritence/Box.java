package Inheritence;

public class Box {
    double l;
    double w;
    double h;
    Box(){
        this.l=-1.0;
        this.w=-1.0;
        this.h=-1.0;
    }

    Box(int s){
        this.l=s;
        this.w=s;
        this.h=s;
    }

    Box( double l,double w, double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
    public static void informationDisplay(){
        System.out.println("Displaying Information");
    }
}
