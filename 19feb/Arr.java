package cognizant;
import java.util.ArrayList;
import java.util.ListIterator;


public class Arr {
	public static void main(String args[]) {
		ArrayList list=new ArrayList<>();
		list.add("Welcome");
		list.add("to");
		list.add("advance");
		list.add("java");
		list.add("batch");
		list.add("07");
		
	
	ListIterator<String> it=list.listIterator();
		System.out.println("**********Forward direction**********");
		while(it.hasNext())
{
	String element=it.next();
	System.out.println(element);
	if(element.contentEquals("java")) {
		break;
	}
}
		System.out.println("**********Backward direction**********");
		while(it.hasPrevious())
{
	String element=it.previous();
	System.out.println(element);
}
		
		System.out.println("The object at index is :"+list.get(2));
}
}
		
		
		