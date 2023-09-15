import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /* The addLast method can populate a list. */
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Gamora");

        // The list is currently: TNPG
        /*
         * The listiterator method creates a new list interator that is position at the head. The "|"  to represent the interator position.
         */
        ListIterator<String> iterator = staff.listIterator(); // |TNPG

        /*The net method advances the iterator over the next element in the list. */
        iterator.next(); // T|NPG
        /* The next method also returns the element that the iterator is passing. */
        String avenger = iterator.next(); //TN|PG
        System.out.println(avenger);
        System.out.println("Expected: Natasha");

        /*The add method inserts an element at the iterator position.
         * The iterator is then positioned AFTER the element that was added.
         */
        iterator.add("Bruce"); //TNB|PG
        iterator.add("Rocket"); //TNBR|PG

        /* The remove method removes the element returned by the last call to next or previous
         * The remove method can ONLY be called after calling next or previous.
         * The remove method CANNOT be called after calling add.
         */
        iterator.next(); // TNBRP|G
        iterator.remove(); // TNBR|G

        System.out.println(staff);
        System.out.println("Expected: [Tony, Natasha, Bruce, Rocket, Gamora]");

        /*The set method updates the element returned by the last call to next or previous. */
        iterator.previous(); // TNB|RG
        iterator.set("Scott"); // TNB|SG

        /* The hasNext method is used to determine if there is a next node after the iterator and is often used in the condition of a while loop. */

        iterator = staff.listIterator(); // |TMNSG
        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Natasha")) { // TN|BSG
                iterator.remove();
            }
        }

        /*Enhanced for loops work with linked lists! */
        for (String n : staff) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("Expected: Tony Bruce Scott Gamora");

        iterator = staff.listIterator();
        /*while (iterator.hasNext()){
            String n = iterator.next();
            if (n.equals("Scott")){
                staff.remove("Scott");
            }
        }
        /* The enhanced for loop AUTOMATICALLY creates an iterator!
         * Yields ConcurrentModificationException
         */
        for (String n : staff) {
            if (n.equals("Scott")) {
                staff.add("Rocket");
            }
        }
        
    }    
}