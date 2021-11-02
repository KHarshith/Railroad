public class Actor
{
   String name;
   Actor next;
   public Actor()
   {
        this.next = null;
   }
   public Actor(String name)
   {
       this.name = name;
       this.next = null;
   }
   public String getName()
   {
       return this.name;
   }
   public void setName(String name)
   {
       this.name = name;
   }
   public Actor getNextPtr()
   {
       return this.next;
   }
   public void setNextPtr(Actor next)
   {
       this.next = next;
   }
   public String toString()
   {
       
       return this.name;
   }
}
