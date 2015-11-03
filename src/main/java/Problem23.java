import java.util.HashSet;
/**
* Problem 23 - www.projecteuler.net
* Find the sum of all numbers that are NOT the sum
* of abundant numbers.
*
* An abundant number is a number that is less than the sum of its
* proper divisors
*
* @author Peter Simon
* @version 2.0
*/
public class Problem23 {


    public static void main(String[] args) {
        System.out.println(abundant(12));
        int count = 0; //Counting the abundant numbers
        int[] abundantNum = new int[6965]; //Size gotten from previous check
        int sum = 0; //Sum of all numbers
        HashSet<Integer> abundantSum = new HashSet<Integer>();

        for (int i = 12; i < 28123; i++) {
            if (abundant(i)) {// && i % 2 == 1) {
                abundantNum[count] = i;
                count++;
            }
        }
        for (int i = 0; i < abundantNum.length; i++) {
            for (int j = i; j < abundantNum.length; j++) {
                if ((abundantNum[i] + abundantNum[j]) <= 28123) { 
                    abundantSum.add(abundantNum[i] + abundantNum[j]);
                }
            }
        }

        boolean checkFlag = false;
        for (int i = 0; i <= 28123; i++) {
            for (Integer j : abundantSum) {
                if (i == j.intValue()){
                    checkFlag = true;
                }
            }
            if (checkFlag == false) {
                sum += i;
            }
            checkFlag = false;
        }
        System.out.println(sum);
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