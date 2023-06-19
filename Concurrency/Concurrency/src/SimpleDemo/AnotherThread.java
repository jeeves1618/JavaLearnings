package SimpleDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static Color.ThreadColor.*;

public class AnotherThread extends Thread{

    public void run(){
        Properties appProps = new Properties();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            appProps.load(new FileInputStream("application.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int count = Integer.parseInt(appProps.getProperty("count"));
        for (int i = 0; i< count; i++ ) {
            System.out.println(ANSI_BLUE + "Another thread here!" + i);

        }
    }
}
