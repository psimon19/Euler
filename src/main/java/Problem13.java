import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;
public class Prob13 {
    
    public static void main(String[] args) {
        
        try {
            File file = new File("digits.txt");
            Scanner readFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<BigInteger> bi = new ArrayList<BigInteger>();
        while (readFile.hasNext()) {
            String longInt = readFile.nextLine();
            bi.add(new BigInteger(longInt));
        }
    }
    
}