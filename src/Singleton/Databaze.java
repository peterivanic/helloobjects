package Singleton;

public class Databaze {
    public String meno = "MySQL";
   private Databaze(){}
   public static Databaze getInstance(){
       Databaze databaze = new Databaze();
       return databaze;
   }
}
