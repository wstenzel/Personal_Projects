import java.util.Scanner;
import java.io.*;
public class Day1
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("calories.txt"));
        int check1;
        String check2;
        int check3 = 0;
        boolean check = false;
        int sum=0;
        int top=0;
        
        while(file.hasNext())
        {
            check1 = file.nextInt();
            check2 = file.nextLine();
            if(check2.equals(""))
            {
                check = false;
            }
            else
                check3 = Integer.parseInt(check2);
            if(check1==check3)
            {
                check = true;
            }
            if(check)
            {
                sum = sum + check1;
            }
            else
            {
                sum = 0;
            }
            if (sum>top)
            {
                top = sum;
            }
        }
        System.out.print(top);
    }
}