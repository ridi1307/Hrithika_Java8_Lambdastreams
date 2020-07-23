package epam;

import java.util.*;
import java.util.function.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("lol");
		list.add("mad");
		list.add("madam");
		list.add("java");
		list.add("C");
		list.add("level");
		list.add("refer");
		list.add("eagle");
		Predicate<String> p=(String str) -> str.equals(new StringBuilder(str).reverse().toString());
		List<String> palindromelist=filterStrings(list,p);
		System.out.println("List of Palindromes in the given list : "+palindromelist);
	}
	static List<String> filterStrings(List<String> strlist,Predicate<String> p)
	{
		List<String> r=new ArrayList<String>();
		for(String str:strlist)
		{
			if(p.test(str))
				r.add(str);
		}
		return r;
	}
}
/*
 OUTPUT:
 List of Palindromes in the given list : [lol, madam, C, level, refer]
*/