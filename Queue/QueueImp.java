import java.util.*;
public class QueueImp{
	public static void main(String[] args) {
		Queue<Date> queue=new LinkedList<Date>();
		queue.add(new Date(12,2,19));
		queue.add(new Date(12,4,20));
		System.out.println(queue);
		//stdOut.printf("%d",queue);
		Bag<Integer> bag=new Bag<Integer>();
		bag.add(new Integer(21));
		System.out.println(bag);
	}
}