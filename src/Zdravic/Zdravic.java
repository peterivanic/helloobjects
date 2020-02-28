package Zdravic;

import java.io.PrintStream;


public class Zdravic {

    public String text;

    public PrintStream pozdrav(String jmeno){

       return  System.out.printf("%s %s\n",text,jmeno);
    }

}
