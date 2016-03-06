package com.edureka.java_jee.module_4;

public class ThreadInterfaceDemo
{
     public static void main(String args[])
     {
        //Creating an object of the first thread
        FirstThread   firstThread = new FirstThread();
 
        //Creating an object of the Second thread
        SecondThread   secondThread = new SecondThread();
 
        //Starting the first thread
        Thread thread1 = new Thread(firstThread);
        thread1.start();
 
        //Starting the second thread
        Thread thread2 = new Thread(secondThread);
        thread2.start();
     }
}
