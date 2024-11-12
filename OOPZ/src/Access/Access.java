package Access;

public class Access {
    protected int age;
    public String name;
    protected int[] arr;
    public Access(){

    }
    public Access(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[age];
    }
}
