import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;
public class Prob13 {
    
    private static Scanner readFile;
    public static void main(String[] args) {
        
        try {
            File file = new File("digits.txt");
            readFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<BigInteger> bi = new ArrayList<BigInteger>();
        while (readFile.hasNext()) {
            String longInt = readFile.nextLine();
            bi.add(new BigInteger(longInt));
        }
        
        BigInteger sum = BigInteger.valueOf(0);
        for (BigInteger o : bi) {
            System.out.println(o);
            sum = sum.add(o);
        }
        System.out.println(sum);
    }
    
}