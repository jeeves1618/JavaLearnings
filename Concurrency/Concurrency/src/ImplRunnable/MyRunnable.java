package ImplRunnable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static Color.ThreadColor.ANSI_PURPLE;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        Properties appProps = new Properties();
        try {
            appProps.load(new FileInputStream("application.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int count = Integer.parseInt(appProps.getProperty("count"));
        for (int i = 0; i< count; i++ ) {
            System.out.println(ANSI_PURPLE + "My runnable thread execution no: " + i);
        }
    }
}
