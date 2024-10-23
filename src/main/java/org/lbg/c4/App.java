package org.lbg.c4;

//import org.lbg.unreachable.ClassB;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        

    int counter = 0;

        try {
            while (true){
                int ch=System.in.read();
                if(ch==-1){
                    break;
                }
                System.out.println((char)ch);
                counter++;
            }

            System.out.println("Num of charss: " + counter);
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
