/**
 * 
 */
package collection.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Rishikesh
 *
 */
public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Function <String, String> f = (String s) ->  {return s.toUpperCase();};
		Consumer<String> c = System.out::println;
		Predicate<String> p = (s) -> { return s.startsWith("H");};
		
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("How");
		list.add("Are");
		list.add("You");
		list.add("Friends");
		
		list.forEach(s->System.out.println(s));
		//list.forEach(s->f.apply(s));
		list.forEach(s->c.accept(s));
		
		long cnt = list.stream().count();
		System.out.println(cnt);
		
		List<String> sortedList = list.stream().filter(p.negate()).map(f).sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		List<String> sortedList1 = list.stream().filter(p).map(f).sorted().collect(Collectors.toList());
		System.out.println(sortedList1);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(1);
		intList.add(4);
		intList.add(3);
		
		System.out.println(intList);
		
		Comparator<Integer> comp = (a,a1)->a.compareTo(a1);
		Integer i = intList.stream().max(comp).get();
		System.out.println(i);
		
		List<Employee> eList = new ArrayList<>();
		
		eList.add(new Employee(1,"John", 222.2d));
		eList.add(new Employee(1,"Shyam", 444.2d));
		eList.add(new Employee(1,"Deep", 111.2d));
		eList.add(new Employee(1,"Rock", 333.2d));
		
		Comparator<Employee> com = (e,e1)->e.getSalary().compareTo(e1.getSalary());
		//Comparator<Employee> com = (e,e1)->e.salary.compareTo(e1.salary);
		Employee e = eList.stream().max(com).get();
		
		System.out.println(e.getSalary());
		
		long h=eList.stream().count();
		System.out.println(h);
		
		
	}
}