package Java_Brushup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"Prashant", "Nishant", "Divya"};
		
		List nameArraysList =Arrays.asList(str);
		boolean output = nameArraysList.contains("Divya");
		System.out.println("Is Name Present is Array str: "+output);
		
		System.out.println(nameArraysList);
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("================");
		
		for (String string : str) {
			System.out.println(string);
			
		}
		System.out.println("***************************");
		ArrayList<String> a = new ArrayList<String>();
		a.add("Yudhisthir");
		a.add("Bhim");
		a.add("Arjun");
		a.add("Nakul");
		a.add("Sahdev");
		
		System.out.println("Pandavas: ");
		for(int i=0; i<a.size();i++) {
			System.out.print(a.get(i)+ " ");
			
		}
		System.out.println();
		
//		Item is present in ArrayList or not!!
		System.out.println("Contains or Not: "+a.contains("Bhim"));
		
		System.out.println("is Empty or Not: "+a.isEmpty());

	}

}
