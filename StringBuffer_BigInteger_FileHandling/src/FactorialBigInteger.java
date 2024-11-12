import java.math.BigInteger;

public class FactorialBigInteger {
    static BigInteger fact(int num){
        BigInteger res=new BigInteger("1");

        for (int i = 2; i <= num ; i++) {
            res=res.multiply(BigInteger.valueOf(i));
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("factorial of 1000 => "+fact(10000));
    }
}
