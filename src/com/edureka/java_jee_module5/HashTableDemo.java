package com.edureka.java_jee_module5;

import java.util.*;

public class HashTableDemo {

   public static void main(String args[]) {
      // Create a hash map
      Hashtable<String,Double> balance = new Hashtable<String,Double>();
      Enumeration<String> names;
      String str;
      double bal;

      balance.put("Pradeep", new Double(5345345));
      balance.put("Praveen", new Double(33444.2));
      balance.put("Keerthi", new Double(4564.67));
      balance.put("David", new Double(100.256));
     

      // Show all balances in hash table.
      names = balance.keys();
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " +
         balance.get(str));
      }
      System.out.println();
      bal = ((Double)balance.get("Keerthi")).doubleValue();
      balance.put("Keerthi", new Double(bal+1000));
      System.out.println("Keerthi's new balance: " +
      balance.get("Keerthi"));
   }
}
