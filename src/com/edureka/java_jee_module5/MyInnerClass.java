package com.edureka.java_jee_module5;

class OuterClass{
	   private int num = 25;
	   
	   //Accessing he inner class from the method within
	    void display(){
	      Inner inner = new Inner();
	      inner.print();
	      System.out.println("The value of the inner class object is "+inner.value);
	   }
	    
	    
	   //inner class
	     protected class Inner{
	      private int value = 60;
	      private void print(){	   
	      System.out.println("This is inside the inner class");
	      System.out.println("The value of the number is "+num);
	      }
	   }

	}
	   
	public class MyInnerClass{
	   public static void main(String args[]){
	      //Instantiating the outer class 
	      OuterClass outer=new OuterClass();
	      outer.display();
	      //Accessing the display_Inner() method.
	      OuterClass.Inner inner = outer.new Inner();
	     // inner.print();
	   }

	}
