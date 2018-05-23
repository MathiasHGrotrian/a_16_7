package Chapter16;

import java.util.NoSuchElementException;

public class Exercise7
{
    /*
        Write a method called deleteBack that deletes the last value (the value at the back of the list)
         and returns the deleted value. If the list is empty, throw a NoSuchElementException.
     */

    public static ListNode front;

    public static void main(String[] args)
    {

        addNodeToList(0,1);
        addNodeToList(1,1);
        addNodeToList(2,3);
        addNodeToList(3,4);

        addNodeToList(4,5);
        addNodeToList(5,6);

        System.out.println(deleteBack());

    }

    public static int deleteBack()
    {
        Integer back = 0;

        if(front == null)
        {
            throw new NoSuchElementException();
        }

        for(ListNode current = front; current != null; current = current.next)
        {
            if(current.next.next == null)
            {
                back = current.next.data;
                current.next = null;
            }
        }

        return back;
    }


    public static void addNodeToList(int index, int value)
    {
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1 ; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }
}
