package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=1,b=0;
        try{
            divide(a,b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will run whatever happens");
        }
    }
    static int divide(int a,int b) throws Exception{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
