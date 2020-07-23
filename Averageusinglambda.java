package epam;
import java.util.*;
public class AverageusingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println("Average of given list : "+average(list));
	}
	static Double average(List<Integer> list)
	{
		return list.stream().mapToDouble(i -> (double)i).average().getAsDouble();
	}
}

/*
OUTPUT:
 Average of given list : 15.0
*/