import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Use the Java 8 merge() method from Java 8 Note 15.1.
 */
public class StringLengthMap2
{
    public static void main(String[] args)
    {
        String filename = "src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            Map<Integer, Set<String>> map = new TreeMap<>();

            while (in.hasNext())
            {
                String word = clean(in.next());
                Integer c = word.length();

                // Update the map here
                // Modify Worked Example 15.1
                if (map.get(c) == null);
                { 
                    words = new TreeSet<>();
                }
                    map.get(c).add(word);
                    first.put(c, words);
                }


            }

            // Print the map here in this form
            for(Integer a:map.keySet())
                System.out.println(a+": "+map.get(a));
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
