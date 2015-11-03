import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Names {

    private ArrayList<String> names = new ArrayList<String>();
    private File file;
    private Scanner readFile;
    
    public Names(String fileName) {
        try{
            file = new File(fileName);
            readFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public String[] parseFile() {
        readFile.useDelimiter(",");
        while(readFile.hasNext()) {
            String name = readFile.next();
            name = name.substring(1,name.length() - 1);
            names.add(name);
        }
        String[] n = new String[names.size()];
        return names.toArray(n);
    }

    public long calculate(String[] n) {
        long sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += (i + 1) * nameBreakdown(n[i]);
        }
        return sum;
    }

    public int nameBreakdown(String n) {
        int sum = 0;
        char c;
        for (int i = 0; i < n.length(); i++) {
            c = n.charAt(i);
            sum += (c - 64);
        }
        return sum;
    }

    public static void main(String[] args) {
        Names name = new Names("names.txt");
        String[] names = name.parseFile();
        Arrays.sort(names);
        long answer = name.calculate(names);
        System.out.println(answer);
    }
}