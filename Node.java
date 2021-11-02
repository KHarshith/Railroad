public class Node
{
   Object data;
   Node next;
   public Node()
   {
        this.next = null;
        this.data = null;
   }
   public Node(Object obj)
   {
       this.data = obj;
       this.next = null;
   }
   public Object get()
   {
       return this.data;
   }
   public void set(Object obj)
   {
       this.data = obj;
   }
   public Node getNextPtr()
   {
       return this.next;
   }
   public void setNextPtr(Node nxtNode)
   {
       this.next = nxtNode;
   }
   public String toString()
   {
       String s = this.data.toString() + "";
       return s;
   }
}