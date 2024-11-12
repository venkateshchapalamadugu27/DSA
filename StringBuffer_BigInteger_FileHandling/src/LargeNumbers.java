import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        // BI();
        BD();
    }

    static void BI(){
        int a=1234567890;
        int b=20;

        BigInteger A=BigInteger.valueOf(1234567890);

        BigInteger X=new BigInteger("12312345678987654321234567876");
        BigInteger Y=new BigInteger("67584756385983593637396396394");

        System.out.println(A);
        System.out.println(a);

        System.out.println(X.add(Y));

        BigInteger B=X.multiply(Y);

//        System.out.println(FactorialBigInteger.fact(99999));
    }

    static void BD(){
        double x=0.03;
        double y=0.04;
        double ans=y-x;

        System.out.println(ans);

        BigDecimal X=new BigDecimal("0.0357386593562055587565899253");
        BigDecimal Y=new BigDecimal("0.0456789098765432345678987654");
        BigDecimal ANS=Y.subtract(X);

        System.out.println(ANS);
        System.out.println(Y.multiply(X));
        System.out.println(Y.pow(10));
        System.out.println(Y.negate());

        BigDecimal Z=BigDecimal.ONE;
        System.out.println(Z);

    }


}
