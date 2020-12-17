package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        FileInputStream in = new FileInputStream("1.txt");
        FileInputStream in2 = new FileInputStream("2.txt");
        int c, d;
        while ((c =  in.read()) != -1 && (d =  in2.read()) != -1) {
            if (c != d) {
                System.out.print((char)(c) + " " + (char)(d));
                System.out.println();
            }
        }
        in.close();
        in2.close();
    }
}
