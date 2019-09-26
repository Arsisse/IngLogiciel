package fr.unice.miage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) throws IOException {
        String str;
        System.out.println( "Hello World!" );
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("config.cfg");
        InputStreamReader streamReader = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(streamReader);
        while((str = reader.readLine()) != null) {
            System.out.println(str);
        }
    }
}