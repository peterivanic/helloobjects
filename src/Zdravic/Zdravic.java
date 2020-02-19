package Zdravic;

import java.io.PrintStream;

/**trieda reperezentuje zdravic ktory zdravi uzivatelov*/
public class Zdravic {
    /**text pozdravu*/
    public String text;
    /**
     * Pozdravi uivatela textom pozdravu a jeho menom
     * @param  jmeno  meno uživatele
     * @return      Text s pozdravom
     */
    public PrintStream pozdrav(String jmeno){

       return  System.out.printf("%s %s\n",text,jmeno);
    }

}
