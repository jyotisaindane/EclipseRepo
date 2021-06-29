package Collection_Examples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al);// []
		al.add(20);
		al.add(50);
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(90);
		al.add(20);
		al.add(50);
		System.out.println(al);// [20, 50, 10, 30, 40, 90, 20, 50]
		al.add(2, 25);
		al.add(1, 85);
		System.out.println("new element is inserted at index 2 and 1");
		System.out.println(al);// [20, 85, 50, 25, 10, 30, 40, 90, 20, 50]
		System.out.println(al.get(5));// 30
		System.out.println("Size of arraylist is " + al.size());// Size of arraylist is 10

		// how to iterate ArrayList(using 3 ways)
		// 1 using for loop
		/*
		 * for (int i = 0; i < al.size(); i++) { int list = al.get(i);
		 * System.out.println(list);// 20 85 50 25 10 30 40 90 20 50 if (list <= 10) {
		 * System.out.println(list); al.remove(i); } }
		 * System.out.println("Size of arraylist is " + al.size());
		 * System.out.println(al);
		 */

		// 2 using for each loop

		/*
		 * for (int i : al) { System.out.print(i + " "); }
		 */
		
		//3 using Iterator
		/*
		 * Iterator<Integer> it=al.iterator(); while(it.hasNext()) { int t=it.next();
		 * System.out.println(t); }
		 */
		
		//4 using ListIterator
		ListIterator<Integer> litr=al.listIterator();
		while(litr.hasNext()) {
			int l=litr.next();
			System.out.print(l+" ");
		}

	}

}
