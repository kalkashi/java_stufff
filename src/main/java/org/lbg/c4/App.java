
//import org.lbg.unreachable.ClassB;
package org.lbg.c4;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        

//    int counter = 0;
//
//    InputStreamReader isr = new InputStreamReader(System.in);
//    LineNumberReader lnr = new LineNumberReader(isr);
//
//        try {
//            while (lnr.readLine() != null)
//                ;
//            System.out.println("Num of lines: " + lnr.getLineNumber());
//        } catch (IOException e) {
//            System.out.println(e);
//        }

        System.out.println("ADD RESULT   " + sum((int)4.3,5));
        int y=44;
        MyInteger mi = new MyInteger();
        fooBar(mi);
        System.out.println("FOOBAR VAL: " + mi.data);
        mi=null;

    }


    public static double sum(int x,int y){
        return x+y;
    }

    public static void fooBar(MyInteger x){
        (x.data)++;
    }


}

