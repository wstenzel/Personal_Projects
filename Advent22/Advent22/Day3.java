import java.util.Scanner;
import java.io.*;

public class Day3
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("Day3.txt"));
        String item;
        String side1, side2;
        int score=0;
        
        while(file.hasNext())
        {
            //int check1=0,check2=0;
            char char1='a', char2='b';
            item = file.nextLine();
            int len = item.length();
            len = len - 1;
            int len2 = len/2;
            side1 = item.substring(0,len2);
            side2 = item.substring(len2);
            
            for(int check1=0; check1 < len2; check1++)
            {
                char1 = side1.charAt(check1);
                for(int check2=0; check2 < len2; check2++)
                {
                    char2 = side2.charAt(check2);
                    System.out.print(len+"  "+len2+"  "+char1+"  "+char2+"\n");
                    if(char1 == char2)
                    {
                        int up1 = Day3.scoreIt(char1);
                        System.out.print("  "+up1+"  ");
                        score += up1;
                    }
                    check2+=1;
                }
                check1+=1;
            }
            
            
        }
        System.out.print(score);
        }
    public static int scoreIt(char inside)
    {
        if(inside == 'a')
        {
           return 1; 
        }
        else if(inside == 'b')
        {
            return 2; 
        }
        else if(inside == 'c')
        {
            return 3; 
        }
        else if(inside == 'd')
        {
            return 4; 
        }
        else if(inside == 'e')
        {
            return 5; 
        }
        else if(inside == 'f')
        {
            return 6; 
        }
        else if(inside == 'g')
        {
            return 7; 
        }
        else if(inside == 'h')
        {
            return 8; 
        }
        else if(inside == 'i')
        {
            return 9; 
        }
        else if(inside == 'j')
        {
            return 10; 
        }
        else if(inside == 'k')
        {
            return 12; 
        }
        else if(inside == 'l')
        {
            return 12; 
        }
        else if(inside == 'm')
        {
            return 13; 
        }
        else if(inside == 'n')
        {
            return 14; 
        }
        else if(inside == 'o')
        {
            return 15; 
        }
        else if(inside == 'p')
        {
            return 16; 
        }
        else if(inside == 'q')
        {
            return 17; 
        }
        else if(inside == 'r')
        {
            return 18; 
        }
        else if(inside == 's')
        {
            return 19; 
        }
        else if(inside == 't')
        {
            return 20; 
        }
        else if(inside == 'u')
        {
            return 21; 
        }
        else if(inside == 'v')
        {
            return 22; 
        }
        else if(inside == 'w')
        {
            return 23; 
        }
        else if(inside == 'x')
        {
            return 24; 
        }
        else if(inside == 'y')
        {
            return 25; 
        }
        else if(inside == 'z')
        {
            return 26; 
        }
        else if(inside == 'A')
        {
            return 27; 
        }
        else if(inside == 'B')
        {
            return 28; 
        }
        else if(inside == 'C')
        {
            return 29; 
        }
        else if(inside == 'D')
        {
            return 30; 
        }
        else if(inside == 'E')
        {
            return 31; 
        }
        else if(inside == 'F')
        {
            return 32; 
        }
        else if(inside == 'G')
        {
            return 33; 
        }
        else if(inside == 'H')
        {
            return 34; 
        }
        else if(inside == 'I')
        {
            return 35; 
        }
        else if(inside == 'J')
        {
            return 36; 
        }
        else if(inside == 'K')
        {
            return 37; 
        }
        else if(inside == 'L')
        {
            return 38; 
        }
        else if(inside == 'M')
        {
            return 39; 
        }
        else if(inside == 'N')
        {
            return 40; 
        }
        else if(inside == 'O')
        {
            return 41; 
        }
        else if(inside == 'P')
        {
            return 42; 
        }
        else if(inside == 'Q')
        {
            return 43; 
        }
        else if(inside == 'R')
        {
            return 44; 
        }
        else if(inside == 'S')
        {
            return 45; 
        }
        else if(inside == 'T')
        {
            return 46; 
        }
        else if(inside == 'U')
        {
            return 47; 
        }
        else if(inside == 'V')
        {
            return 48; 
        }
        else if(inside == 'W')
        {
            return 49; 
        }
        else if(inside == 'X')
        {
            return 50; 
        }
        else if(inside == 'Y')
        {
            return 51; 
        }
        else
        {
            return 52; 
        }
    }
    }
