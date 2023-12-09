import java.io.*;
import java.util.Scanner;

public class tester {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("tester.txt"));
        long Total = 0;
        while(scan.hasNext())
        {
            int i = scan.nextInt();
            Total+= i;
        }
        System.out.println(Total);
}
}
