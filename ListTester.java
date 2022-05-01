package Java110Lab;
import ADT.ListArrayBased;
import ADT.ListInterface;
import ADT.ListReferenceBased;
import java.util.Random;
/**
 *   isEmpty( )- returns true of the list is empty, false otherwise
 *  size( ) - returns the number of elements in the list
 *  add(index, item) - add the specified item at specified index.
 *  get(index) - get the element at the specified index
 *  remove(index) - remove the element at the specified index
 *  removeAll( ) - remove all items from the list.
 */
public class ListTester
{
    public static void main(String [] args)
    {
        //initialize and create our variables
        final int N = 100;
        long time1,time2, diff;
        Random r = new Random();
        int i = 1;
        //create our two linked lists
        ListInterface<Integer> list1 = new ListArrayBased<>();
        ListInterface<Integer> list2 = new ListReferenceBased<>();
/**
        //take time stamp and add() to the end of the list to compare runtimes of  list1 & list2
        time1 = System.currentTimeMillis();
        for(int index = 1; index <= N; index++)
            list1.add(index, r.nextInt());
        time2 = System.currentTimeMillis();
        diff = time2-time1;
        System.out.println("Runtime for adding to end list1 (array-based): " + diff);

        time1 = System.currentTimeMillis();
        for(int index = 1; index <= N; index++)
            list2.add(index, r.nextInt());
        time2 = System.currentTimeMillis();
        diff = time2-time1;
        System.out.println("Runtime for adding to end of list2 (reference-based): " + diff);
 */
        //take time stamp and add() to the beginning of the list to compare runtimes of list1 & list2
        time1 = System.currentTimeMillis();
        for(int index = 1; index <= N; index++)
            list1.add(1, r.nextInt());
        time2 = System.currentTimeMillis();
        diff = time2-time1;
        System.out.println("Runtime for adding to beg of list1 (array-based): " + diff);

        time1 = System.currentTimeMillis();
        for(int index = 1; index <= N; index++)
            list2.add(1, r.nextInt());
        time2 = System.currentTimeMillis();
        diff = time2-time1;
        System.out.println("Runtime for adding to beg of list2 (reference-based): " + diff);

/**
        //take time stamp and remove() to the beginning of the list to compare runtimes of list1 & list2
        time1 = System.currentTimeMillis();
        for(int index = 1; index <= N; index++)
            list1.remove(1);
        time2 = System.currentTimeMillis();
        diff = time2-time1;
        System.out.println("Runtime for remove() from beg of list1 (array-based): " + diff);

        time1 = System.currentTimeMillis();
        for(int index = 1; index <= N; index++)
            list2.remove(1);
        time2 = System.currentTimeMillis();
        diff = time2-time1;
        System.out.println("Runtime for remove() from beg of list2 (reference-based): " + diff);

        //take time stamp and remove() from the end of the list to compare runtimes of list1 & list2
        time1 = System.currentTimeMillis();
        for(int index = 1; index <= 1000; index++)
            list1.remove(index);
        time2 = System.currentTimeMillis();
        diff = time2-time1;
        System.out.println("Runtime for remove() from end of list1 (array-based): " + diff);

        time1 = System.currentTimeMillis();
        for(int index = 1; index <= 1000; index++)
            list2.remove(index);
        time2 = System.currentTimeMillis();
        diff = time2-time1;
        System.out.println("Runtime for remove() from end of list2 (reference-based): " + diff);
*/

        /** What's left:
         * List traversal
         */

        //displayList(list1);
        //System.out.println();
        //displayList(list2);

    }
    // Traverse list displaying data in each item
    // I supressed the output for your testing.
    public static void displayList(ListInterface<Integer> list)
    {
        for (int i = 1; i<=list.size();i++)
            //System.out.println(list.get(i));
            list.get(i);
    }
}
