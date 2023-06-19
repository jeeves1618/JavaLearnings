package SimpleDemo;

import ImplRunnable.MyRunnable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static Color.ThreadColor.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Properties appProps = new Properties();
        appProps.load(new FileInputStream("application.properties"));
        int count = Integer.parseInt(appProps.getProperty("count"));
        //This is a named class. We can also create threads with anonymous class.
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        //Here is the anonymous class. Anonymous class has to executed right after it is declared.
        new Thread(){
            public void run(){
                for (int i = 0; i< count; i++ ) {
                    System.out.println(ANSI_GREEN + "I am anonymous!" + i);
                }
            }
        }.start();

        //Creating a thread and passing the implementation of runnable as parameter
        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();

        //Overriding the run method in MyRunnable Class with another anonymous class.
        Thread runnableThreadOvrd = new Thread(new MyRunnable(){
            @Override
            public void run() {
                for (int i = 0; i < count; i++) {
                    System.out.println(ANSI_CYAN + "Inside anonymous class");
                    try {
                        anotherThread.join();//This statement will make the runnableThreadOvrd wait indefinitely
                        //anotherThread.join(1000); will wait for anotherThread only for 1 second.
                        System.out.println(ANSI_WHAT + "Another thread completed, so I am starting again");
                    } catch (InterruptedException e) {
                        System.out.println(ANSI_WHAT + "Anonymous thread got INTERRUPTED");
                    }
                }
            }
        });
        runnableThreadOvrd.start();

        //WE CAN'T GUARANTEE THE ORDER OF EXECUTION OF THREADS
        for (int i = 0; i< count; i++ ) {
            System.out.println(ANSI_RED + "SimpleDemo.Main Thread!" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(ANSI_WHAT + "Another Thread Woke me up!");
                return;
            }
            System.out.println(ANSI_GREY + i + " Second(s) has passed and I'm awake");
        }
        anotherThread.interrupt();

        /*
        I M P O R T A N T   P O I N T
        -----------------------------
        In the runnable interface we always implement the run method. But, we call the start method.
        The JVM will call the run method for us.

        Instead of calling the start method, if you call the run method, then the run method of the
        calling method will get implemented. 
         */
    }
}