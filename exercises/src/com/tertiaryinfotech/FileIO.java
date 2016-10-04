package com.tertiaryinfotech;
import java.io.*;

public class FileIO {

    public static void main(String args[]) throws IOException
    {
        FileOutputStream out = null;

        out = new FileOutputStream("output.txt");

        for (int i =1;i<10;i++) {
            out.write(i);
        }
    }
}
