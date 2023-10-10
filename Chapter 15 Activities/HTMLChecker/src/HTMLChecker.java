import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "src/TagSample1.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here
            String nextt; String popped;
            boolean valid = true;
            Stack<String> tags = new Stack<>();
            while(in.hasNext() && valid)
            {
                nextt = in.next();
                if(!nextt.contains("/"))
                    tags.push(nextt);
                else
                {
                    if(!tags.isEmpty())
                    {
                        nextt.replace("/","");
                        popped = tags.pop();
                        if(nextt.equals(popped))
                        {;}
                        else
                            valid = false;
                    }   
                    else
                        valid = false;        
                }

            }
            if(valid)
                System.out.println("The sequence is properly nested");
            else
                System.out.println("The sequence is not properly nested");


        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
