
//import org.lbg.unreachable.ClassB;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        

    int counter = 0;

    InputStreamReader isr = new InputStreamReader(System.in);
    LineNumberReader lnr = new LineNumberReader(isr);

        try {
            while (lnr.readLine() != null)
                ;
            System.out.println("Num of lines: " + lnr.getLineNumber());
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}

