import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class day2 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File("day2.txt"));
        int Total = 0;
        int sum = 0;

        ArrayList<String> good = new ArrayList<>();
        good.add("1 red");
        good.add("2 red");
        good.add("3 red");
        good.add("4 red");
        good.add("5 red");
        good.add("6 red");
        good.add("7 red");
        good.add("8 red");
        good.add("9 red");
        good.add("10 red");
        good.add("11 red");
        good.add("12 red");

        good.add("1 blue");
        good.add("2 blue");
        good.add("3 blue");
        good.add("4 blue");
        good.add("5 blue");
        good.add("6 blue");
        good.add("7 blue");
        good.add("8 blue");
        good.add("9 blue");
        good.add("10 blue");
        good.add("11 blue");
        good.add("12 blue");
        good.add("13 blue");
        good.add("14 blue");

        good.add("1 green");
        good.add("2 green");
        good.add("3 green");
        good.add("4 green");
        good.add("5 green");
        good.add("6 green");
        good.add("7 green");
        good.add("8 green");
        good.add("9 green");
        good.add("10 green");
        good.add("11 green");
        good.add("12 green");
        good.add("13 green");

        boolean found = false;

        while(scan.hasNext())
        {
            String line = scan.nextLine();
            
        }
        System.out.println(Total);
    }
}
