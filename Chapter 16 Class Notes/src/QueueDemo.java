import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
public class QueueDemo
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        ArrayList<String> strings = new Arraylist<String>(
            Arrays.asList("zero","one","two","three","four","five","six","seven","eight","nine"));
        ArrayList<String> split = readWords("Chapter 16 Class Notes/src/words.txt");
        int total = 0; int firstdigit; int seconddigit;
        for(String s : split)
        {
            firstdigit = 11; seconddigit = 11;
            for(int i = 0; i<strings.length();i++)
            {
                if(s.indexOf(strings[1])) > 47 && s.charAt(i) < 58 && firstdigit == 11)
                firstdigit = s.charAt(i)-48;
                else if(s.charAt(i) > 47 && s.charAt(i) < 58)
                seconddigit = s.charAt(i)-48;
            }
            if(seconddigit == 11)
            seconddigit = firstdigit;
            System.out.print(firstdigit+" ");
            System.out.println(seconddigit);
            total+=firstdigit*10;
            total+=seconddigit;
        }
        System.out.print(total);
    }
    public static ArrayList<String> readWords(String filename)
        throws FileNotFoundException
    {
        ArrayList<String> words = new ArrayList<>();

        // Determine the current working directory
        //System.out.println(System.getProperty("user.dir"));
        Scanner in = new Scanner(new File(filename));

        // Use any character that's not a letter as delimeters
        while(in.hasNext()) {
            // Add words to the set (duplicates are ignored)
            words.add(in.next().toLowerCase());
        }
        return words;
    }
}
