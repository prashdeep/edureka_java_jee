package com.edureka.java_jee_module5;

import java.util.*;

public class Collections {
	public static void main(String[] args) {
		/*
		 * PriorityQueue < Integer > pq = new PriorityQueue < Integer > () ;
		 * 
		 * for ( int i = 10; i > 0; i-- ){ pq.add (new Integer (i)) ; }
		 * 
		 * for ( int i = 1; i <= 10; i++ ){ Integer c = pq.poll();
		 * System.out.println(c); }
		 * 
		 */

		/*
		 * ArrayList <String> al = new ArrayList<String>();
		 * 
		 * al.add("Pavas"); al.add("Charan"); al.add ("Sameer"); al.add
		 * ("Java"); al.add ("Rohit");
		 * 
		 * System.out.println(al);
		 * 
		 * for (String str: al) { System.out.println("Welcome : "+str); }
		 * 
		 * al.remove("Rohit"); al.remove(2); al.remove("Charan");
		 * System.out.println(al);
		 * 
		 * al.add(1, "Collections");
		 * 
		 * System.out.println(al);
		 */

		/*
		 * LinkedList <String> li = new LinkedList<String>();
		 * 
		 * li.add("ArrayList"); li.add ("Linked List"); li.add("Set");
		 * li.add("map"); li.add ("Hashtable");
		 * 
		 * System.out.println(li);
		 * 
		 * li.addFirst("java"); li.addLast ("All are collections...");
		 * System.out.println(li);
		 */

		/*
		 * HashSet hs = new HashSet(); hs.add (1); hs.add (1); hs.add (2);
		 * hs.add (3); hs.add (4);
		 * 
		 * System.out.println(hs); Iterator it = hs.iterator();
		 * 
		 * while (it.hasNext()) { int i = (Integer) it.next();
		 * System.out.println(i); }
		 */

		/*
		 * TreeSet ts = new TreeSet(); ts.add("Pavas"); ts.add("Pavas");
		 * ts.add("Charan"); ts.add ("Rohit"); ts.add ("Sameer"); ts.add
		 * ("Java");
		 * 
		 * 
		 * System.out.println(ts);
		 */

		/*
		 * HashMap<String, Double> hm = new HashMap<String, Double>();
		 * 
		 * // Put elements to the map hm.put("Surendra", new Double(3434.00));
		 * hm.put("Charan", new Double (1235.22)); hm.put("Divya", new
		 * Double(1378.00)); hm.put("Wei_Shao", new Double(99.22));
		 * hm.put("Xingmeng", new Double(19.08)); hm.put(null, new Double
		 * (20.30));
		 * 
		 * // Get a set of the entries. Set<Map.Entry<String, Double>> set =
		 * hm.entrySet(); // Display the set. for(Map.Entry<String, Double> me :
		 * set) { System.out.print(me.getKey() + ": ");
		 * System.out.println(me.getValue()); } System.out.println();
		 * 
		 * // Deposit 1000 into John Doe's account. double balance =
		 * hm.get("Charan"); hm.put("Charan", balance + 4000);
		 * System.out.println("Charan's new balance: " + hm.get("Charan"));
		 * 
		 */

		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		Enumeration<String> names;
		String str;
		double bal;
		balance.put("Charan", 3434.00);
		balance.put("Kiran", 123.22);
		balance.put("Divya", 1378.00);
		balance.put("Pradeep", 99.22);
		balance.put("Rama", -19.08);
		// balance.put(null, 100.20);

		// Show all balances in hashtable.
		names = balance.keys();
		while (names.hasMoreElements()) {
			str = names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}

		System.out.println();
		// Deposit 1,000 into Charan's account.
		bal = balance.get("Charan");
		balance.put("Charan", bal + 7000);
		System.out.println("Charan's new balance: " + balance.get("Charan"));

	}
}
