public class S {
    int rollno;
    String name;
    int[] arr;
    public S(int rollno) {
        this.rollno = rollno;
    }
    public S(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
}
class Soln{
    public static void main(String[] args) {
        S venki=new S(23,"Venkatesh");
        System.out.println("RollNo:"+venki.rollno+",Name:"+venki.name);
    }
}
