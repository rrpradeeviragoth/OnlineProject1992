package com.lao.listPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPr1 {
	
	public void pr1()
	{
		List<String> arrayList = new ArrayList<String>();
		List<String> duplicateList = new ArrayList<String>();
		arrayList.add("Muruga");
		arrayList.add("Vinayaga");
		arrayList.add("Ohm");
		arrayList.add("Lakshmi");
		arrayList.add("Saraswathy");
		arrayList.add("Bairava");
		arrayList.add("Last");
		System.out.println(arrayList);
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.indexOf("Bairava"));
		System.out.println(arrayList.lastIndexOf("ohm"));
		System.out.println(duplicateList);
		duplicateList.addAll(arrayList);
		System.out.println(duplicateList);
		duplicateList.clear();
		System.out.println(duplicateList);
		duplicateList.addAll(arrayList);
		System.out.println(duplicateList);
		duplicateList.remove(2);
		System.out.println(duplicateList);
		duplicateList.remove("Ohm");
		System.out.println(duplicateList);
		duplicateList.add(3,"Ohm");
		duplicateList.add(6,"Ohm");
		System.out.println(duplicateList);
		duplicateList.remove("Ohm");
		System.out.println(duplicateList);
		duplicateList.add(null);
		duplicateList.add(null);
		duplicateList.add(null);
		System.out.println(duplicateList);
		duplicateList.set(6, "Updated");
		System.out.println(duplicateList);
		duplicateList.clear();
		System.out.println(duplicateList.isEmpty());
		
		for(String string:arrayList)
		{
			System.out.println(string);
		}
		System.out.println("For----------------------");
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}
		System.out.println("List Iterator forward----------------------");
		ListIterator<String> iterator1 = arrayList.listIterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		System.out.println("List Iterator backward----------------------");
		//ListIterator<String> iterator1 = arrayList.listIterator();
		while(iterator1.hasPrevious())
		{
			System.out.println(iterator1.previous());
		}
		
		/*ListIterator<String> iterator= arrayList.listIterator();
		while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous());
		}*/
		System.out.println("Iterator ----------------------");
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	/* First Update*/

	/first update in branch 1/

	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListPr1 obj1 = new ArrayListPr1();
		obj1.pr1();
		

	}

}
