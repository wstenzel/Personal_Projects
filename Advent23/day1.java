import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class day1 {
    private static final int TENS = 1;
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("day1.txt"));
        long Total = 0;
/*
        while(scan.hasNext()){
            String line = scan.nextLine();
            String lineSum = "";
            for(int i = 0; i < line.length(); i++){
                if(Character.isDigit(line.charAt(i)))
                {
                    lineSum+= line.charAt(i);
                }
            }
            lineSum = lineSum.substring(0,1)+lineSum.substring(lineSum.length()-1);
            Total+= Integer.parseInt(lineSum);
            System.out.println(lineSum);
        }
*/

        ArrayList<String> nums = new ArrayList<>();
        nums.add("one");
        nums.add("two");
        nums.add("three");
        nums.add("four");
        nums.add("five");
        nums.add("six");
        nums.add("seven");
        nums.add("eight");
        nums.add("nine");
        nums.add("1");
        nums.add("2");
        nums.add("3");
        nums.add("4");
        nums.add("5");
        nums.add("6");
        nums.add("7");
        nums.add("8");
        nums.add("9");

        Map<String, String> map = new HashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "9");

        Map<Integer, ArrayList<String>> numbers = new HashMap<>();
        
        int count = 0;

        String firstnum = null;
        String lastnum = null;
        String sum = null;

        while(scan.hasNext())
        {
            String line = scan.nextLine();
            String num = "";
            
            count++;
            ArrayList<String> temp = new ArrayList<>();

            while(line.length() > 0)
            {
                if(Character.isDigit(line.charAt(0)))
                {
                    temp.add(Character.toString(line.charAt(0)));
                }
                else
                {
                    num+= line.charAt(0);
                }
                System.out.println(num);
                for(String s: nums)
                {
                    if(num.contains(s))
                    {
                        temp.add(map.get(s));
                        num = "";
                    }
                }

                line = line.substring(1);
            }

            numbers.put(count, temp);

        }

        for(int i =0; i< numbers.size(); i++)
        {
            ArrayList<String> temp = numbers.get(i+1);
            firstnum = temp.get(0);
            lastnum = temp.get(temp.size()-1);
            sum = firstnum+lastnum;
            Total+= Integer.parseInt(sum);
            System.out.println(sum);
            firstnum = "";
            lastnum = "";
            sum = "";
        }
        System.out.println(Total);
    }
}
