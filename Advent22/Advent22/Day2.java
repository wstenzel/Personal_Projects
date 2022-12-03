import java.util.Scanner;
import java.io.*;

public class Day2
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("RockPaperScissors.txt"));
        String line;
        char spot1;
        char spot2;
        int score=0;
        while (file.hasNext())
        {
            line = file.nextLine();
            spot1 = line.charAt(0);
            spot2 = line.charAt(2);
            /*X=L
             *Y=D
              Z=W*/
            if(spot1 == 'A' && spot2 == 'X')
            {
                score += 3;
            }
            if(spot1 == 'A' && spot2 == 'Y')
            {
                score += 4;
            }
            if(spot1 == 'A' && spot2 == 'Z')
            {
                score += 8;
            }
            if(spot1 == 'B' && spot2 == 'X')
            {
                score += 1;
            }
            if(spot1 == 'B' && spot2 == 'Y')
            {
                score += 5;
            }
            if(spot1 == 'B' && spot2 == 'Z')
            {
                score += 9;
            }
            if(spot1 == 'C' && spot2 == 'X')
            {
                score += 2;
            }
            if(spot1 == 'C' && spot2 == 'Y')
            {
                score += 6;
            }
            if(spot1 == 'C' && spot2 == 'Z')
            {
                score += 7;
            }
        }
        System.out.print(score);
    }
}