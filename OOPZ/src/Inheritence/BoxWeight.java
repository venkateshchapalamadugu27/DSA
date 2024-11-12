package Inheritence;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
        super();
        this.weight=-1;
    }
    BoxWeight( double l,double w, double h,double weight){
       super(l, w, h);
        this.weight=weight;
//        this.l=l;
//        this.w=w;
//        this.h=h;
    }
}
