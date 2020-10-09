package com.edureka.java_jee.module_4.threads;

//This class is made as a thread by implementing "Runnable" interface.
public class SecondThread implements Runnable
{

 //This method will be executed when this thread is executed
 public void run()
 {

    //Looping from 1 to 10 to display numbers from 1 to 10
    for ( int i=1; i<=10; i++)
    {
       System.out.println( "Message from "+Thread.currentThread().getName()+" Thread : " +i);

       try
       {
           Thread.sleep(3000);
       }
       catch (InterruptedException interruptedException)
       {
          /*Interrupted exception will be thrown when a sleeping or waiting
           * thread is interrupted.
           */
           System.out.println( "Second Thread is interrupted when it is sleeping" +interruptedException);
       }
    }
  }
}
