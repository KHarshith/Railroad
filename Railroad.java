import java.io.File;
import java.io.*;
import java.util.Scanner;

public class Railroad {
	
	public static void main(String [] agrs) throws FileNotFoundException
	{
		
		File file = new File("/Users/harshith/eclipse-workspace/Railroad/data/railroad.dat");
		Scanner console = new Scanner(file);
		
		int noOfCoaches = console.nextInt();
		while (noOfCoaches != 0)
		{
			RingBuffer lineBOrder = new RingBuffer(noOfCoaches);
			
			int coachNumber = console.nextInt();
			while (coachNumber != 0)
			{
				lineBOrder.enqueue((double)coachNumber);
				//System.out.println(coachNumber);
				for(int i = 1; i < noOfCoaches; i++)
				{
					coachNumber = console.nextInt();
					
					 lineBOrder.enqueue((double)coachNumber);
					 //System.out.println(coachNumber);
				}
				MyLinkedList station = new MyLinkedList();
				RingBuffer lineB = new RingBuffer(noOfCoaches);
				
				//Add the coaches on Line A to the Line A Queue
				RingBuffer lineA = new RingBuffer(noOfCoaches);		
				for(int i = 1; i <= noOfCoaches; i++)
				{
					lineA.enqueue((double)i);
				}
				
				
				
				
				for(int j = 1; j <= noOfCoaches; j++)
				{
					int requiredCoachNo = (int)lineBOrder.dequeue();
					if(station.getSize() != 0 &&  (int)station.get(0) == requiredCoachNo)
					{
						//Adds the coach from the station if the coach number matches
						int transition =(int) station.removeFirst();
						lineB.enqueue((double)transition);
					}
					else
					{
						boolean coachFound = false;
						while(lineA.isEmpty() == false && lineA.peek() <= requiredCoachNo)
						{
							int transition = (int)lineA.dequeue();
							station.addFirst(transition);
							coachFound = true;
						}
						if(coachFound == true)
						{
							int transition = (int)station.removeFirst();
							lineB.enqueue((double)transition);
						}
						
					}
				}
				if(lineB.size() == noOfCoaches)
				{
					System.out.println("yes");
					
				}
				else
				{
					System.out.println("no");
				}
				coachNumber = console.nextInt();
				
			}
			System.out.println("");
			noOfCoaches = console.nextInt();
		}
	}

}
