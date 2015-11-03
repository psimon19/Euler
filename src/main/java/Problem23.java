/**
* Problem 23 - www.projecteuler.net
* Find the sum of all numbers that are NOT the sum
* of abundant numbers.
*
* An abundant number is a number that is less than the sum of its
* proper divisors
* 
* @author Peter Simon
* @version 1.0
*/
public class Problem23 {


    public static void main(String[] args) {
        System.out.println(abundant(12));
        for (int i = 24; i < 28123; i++) {
            for (int j = 24; j <= i; j++) {
                if (abundant(i) && abundant(j)) {
                    //System.out.println(i + j);
                }
                
            }
        }
        System.out.println("-Done-");
    }

    /**
    * Checks if a number is abundant
    * @param num        Int number to be checked
    * @return Boolean   true if the number is abundant
    */
    public static boolean abundant(int num) {
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum > num) {
            return true;
        } else {
            return false;
        }
    }

}