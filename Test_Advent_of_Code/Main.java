import java.io.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanFile2 = new Scanner(new File("day1.txt"));
       Scanner scanFile = new Scanner(new File("day1.txt"));
       Scanner scanFile3 = new Scanner(new File("day1.txt"));
        
        int num2=0;
        int num1=0;
        int num3 = 0;
        boolean check = false;
       while(scanFile.hasNext() && !check)
       {
           num1 = scanFile.nextInt();
           scanFile2 = null;
           scanFile2 = new Scanner(new File("day1.txt"));
           while (scanFile2.hasNext()&& !check)
           {
               num2 = scanFile2.nextInt();
               while (scanFile2.hasNext()&& !check)
                   num2 = scanFile2.nextInt();
            
               if (num1+num2+num3 == 2020)
               {
                   check = true;
               }
                
               //System.out.print(num1+"  "+num2);
           }
       }
       System.out.print(num1*num2*num3);
    }
}