package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Anonymous lamda=(x,y)->
		(x+y);
		System.out.println(lamda.addNum(5,5));
		
		Annonymous2 obj=new Annonymous2() {
			
			@Override
			public void show() {
				System.out.println("I am Annonymus2 interface");
			}

			@Override
			public void printNum(int x) {
				System.out.println(x);
				
			}
		};
		obj.show();
		obj.printNum(45);
		
		List<Employee> list=new ArrayList<>();
		list.addAll(Arrays.asList(new Employee(1,"Bhabani"),new Employee(2,"Ashok"),new Employee(3,"Pranaya")));
		
		//using Anonymous class
		/*Collections.sort(list,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}); */
		
		//using lambda expression
		//Collections.sort(list,(e1,e2)->e1.getName().compareTo(e2.getName()));
		
		//using method reference
		Collections.sort(list,Comparator.comparing(Employee::getName));
		System.out.println(list);
		
		
	}

}

