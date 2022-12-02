import java.util.Scanner;
import java.io.*;
public class Day1
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("calories.txt"));
        int check1=0;
        String check2;
        boolean check = true;
        int sum=0;
        int top1=0;
        int top2=0;
        int top3=0;
        int top;
        while(file.hasNext())
        {
            check = true;
            check2 = file.nextLine();
            /*
            if(check2.equals(""))
            {
                check = false;
            }
            else
                check1 = Integer.parseInt(check2);
                */
            System.out.println(check2+"    "+check);
            if(check2.equals(""))
            {
                
                if (sum>top1)
                {
                    top3 = top2;
                    top2 = top1;
                    top1 = sum;
                }
                if (sum > top2 && sum < top1)
                {
                    top3 = top2;
                    top2 = sum;
                }
                if (sum>top3 && sum < top2)
                {
                    top3 = sum;
                }
                sum = 0;
            }
            else
            {
                check1 = Integer.parseInt(check2);
                sum = sum + check1;
            }
           
        }
        top = top1 + top2 + top3;
        System.out.print(top);
    }
}