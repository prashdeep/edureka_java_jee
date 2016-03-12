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
       System.out.println( "Messag from Second Thread : " +i);

      /*taking a delay of one second before displaying next number
       *
       * "Thread.sleep(1000);" - when this statement is executed,
       * this thread will sleep for 1000 milliseconds (1 second)
       * before executing the next statement.
       *
       * Since we are making this thread to sleep for one second,
       * we need to handle "InterruptedException". Our thread
       * may throw this exception if it is interrupted while it
       * is sleeping.
       */
       try
       {
           Thread.sleep(1000);
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
