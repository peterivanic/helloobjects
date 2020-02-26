package Bird;

public class AngryBird extends Bird {
    public int vztek = 50;

    public void provokuj(int provokace){
        if (hlad==100){
            vztek = vztek +(2*provokace);
        }else{
            vztek = vztek + provokace;
        }
    }
}
