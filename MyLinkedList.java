import java.util.*;
import java.io.*;
public class MyLinkedList
{
    private Node head;
    private static int count;
    public MyLinkedList()
    {
        head = null;
        count = 0;
       
    }
    public void addFirst(Object obj)
    {
        Node node = new Node(obj);
        node.next = head;
        head = node;
        count++;
    }
    public Object get(int ind)
    {

        if(ind < 0 || ind >= count)
        {
            throw new IndexOutOfBoundsException();
        }
       
        Node currPoint = head;
        int i = 1;
        while(currPoint != null && i <= ind)
        {
            currPoint = currPoint.next;
            i++;
        }
        return currPoint.data;
    }
    public String toString()
    {
      Node currPntr = head;
      String s = "";
      while (currPntr != null)
      {
           s = s + currPntr.toString() + "\n";
           currPntr = currPntr.next;
      }
      return s;
    }
    public static int getSize()
    {
        return count;
    }
   public Object removeFirst()
   {
	   Node elemantRemoved = head;
	   head = head.next;
	   count--;
	   return elemantRemoved.data;
	   
	   
	   
   }
}