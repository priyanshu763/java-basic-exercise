package MathsDSA;

import java.math.BigInteger;
import java.math.BigDecimal;
//
// BigInteger
import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        // NOTE: float and double are floating point numbers
        BD();


    }

    static void BD(){
        double x = 0.03;
        double y = 0.04;
        double ans = y-x;
        System.out.println(ans); // it will not give accurate value

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal Ans = Y.subtract(X);
        System.out.println(Ans);

        BigDecimal a = new BigDecimal("456566767676.7878898989");
        BigDecimal b = new BigDecimal("56565565656.67676878787");

        //operations
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());

        // constants
        BigDecimal con = BigDecimal.ONE;




    }



    static void BI() {

        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(56565262);
        BigInteger C = new BigInteger("56357272732787837832");
        BigInteger X = new BigInteger("787897879876");

        // constants
        BigInteger D = BigInteger.TEN;

        // addition
        BigInteger s = A.add(B);
        BigInteger s2 = C.add(X);

        BigInteger m = C.multiply(X);
        BigInteger sub = C.subtract(X);
        BigInteger d = C.divide(X);  // returns Integer Value
        BigInteger rem = C.remainder(X);

        if (X.compareTo(C) <  0) {
            System.out.println("yes");
        }

        System.out.println(s);
        System.out.println(s2);
        System.out.println(m);
        System.out.println(sub);
        System.out.println(d);
        System.out.println(rem);
        System.out.println(Factorial.fact(10));


    }

}
