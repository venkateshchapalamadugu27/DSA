package Inheritence;

public class BoxPrice extends BoxWeight{
    double p;
    public BoxPrice(){
        this.p=-1;
    }
    BoxPrice(double l,double w,double h,double weight,double p){
        super(l, w, h, weight);
        this.p=p;
    }

}
