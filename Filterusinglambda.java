package epam;

import java.util.*;
import java.util.stream.*;
public class FilterStringsusingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("axe");
		list.add("atlas");
		list.add("bat");
		list.add("ant");
		list.add("ANT");
		list.add("agent");
		list.add("ball");
		list.add("dog");
		list.add("zip");
		list.add("ape");
		System.out.println("Filtered list : "+filter(list));
	}
	static List<String> filter(List<String> list)
	{
		return list.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
	}

}

/*
OUTPUT:
Filtered list : [axe, ant, ape]
*/