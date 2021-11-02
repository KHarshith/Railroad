import java.util.*;
public class MyStack
{
    Integer[] stack;
    int size;
   
    public MyStack()
    {
        size=0;
        stack = new Integer[1];  
    }
    public MyStack(int initCap)
    {
        this();
        stack = new Integer[initCap];
    }
    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        return false;
    }
    public Integer peek()
    {
        if(size == 0)
        {
           throw new EmptyStackException();
        }
        return stack[size-1];
    }
    public Integer pop()
    {
        if(size == 0)
        {
           throw new EmptyStackException();
        }
       
        Integer j = stack[size-1];
        size--;
        Integer[] x = new Integer[size];
        for(int i = 0;i < size;i++)
        {
            x[i] = stack[i];
        }        
        stack = x;
       
        return j;
       
    }
    public void push(Integer item)
    {      
        if (stack.length == size)
        {
            doubleCapacity();
        }
       
        Integer[] h = new Integer[size + 1];
        if (size > 0) {
            for(int i = 0;i <= size;i++)
            {
                h[i] = stack[i];
            }
        }
        h[size] = item;
        stack = h;
        size++;
    }
    private void doubleCapacity()
    {
        Integer[] p = new Integer[size * 2];
        for(int i = 0;i < size;i++)
        {
            p[i] = stack[i];
        }
        stack = p;
       
    }
    public String toString()
    {
        String a = "";
        for(int i = size-1;i >=0;i--)
        {
            if(i == size - 1)
            {
                a = a + stack[i] + "        <----------  TOP";
            }
            else
            {
                a = a + "\n" + stack[i];
            }
           
        }
        a = a +  "\n--------";
       
        return a;
    }
   
   
}

