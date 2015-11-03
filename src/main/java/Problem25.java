import java.math.BigInteger;
/**
* Problem 25 - www.projecteuler.net
*
* Index of the 1st fibonacci number
* with 1000 digits
*
* @author Peter Simon
* @version 1.0
*/
public class Problem25 {


    public static void main(String[] args) {
        BigInteger prev = BigInteger.ZERO;
        BigInteger temp;
        BigInteger current = BigInteger.ONE;

        current = current.add(prev);
        
        int index = 1;

        while (getDigitCount(current) < 1000) {
            temp = current;
            current = current.add(prev);
            prev = temp;
            index++;
            System.out.println(getDigitCount(current) + ": " + current);
        }
        System.out.println("Answer: " + index + ": " + current);
    }

    /**
    * Helper method to retrieve the digit count of a BigInteger number
    * @param number     BigInteger number to count digits
    * @return int       Number of digits in number
    */
    public static int getDigitCount(BigInteger number) {
        double factor = Math.log(2) / Math.log(10);
        int digitCount = (int) (factor * number.bitLength() + 1);
        if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
            return digitCount - 1;
        }
        return digitCount;
    }
}