import java.math.BigInteger;
public class Problem15 {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        BigInteger numerator = BigInteger.valueOf(1);
        BigInteger denom = BigInteger.valueOf(1);
        
        for (int i = num * 2; i > 1; i--) {
            numerator = numerator.multiply(BigInteger.valueOf(i));
        }
        for (int i = num; i > 1; i--) { denom = denom.multiply(BigInteger.valueOf(i)); }
        denom = denom.multiply(denom);
        System.out.println(numerator.divide(denom));
    }
    
}