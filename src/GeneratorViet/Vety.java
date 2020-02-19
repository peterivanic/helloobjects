package GeneratorViet;

import java.util.Random;

public class Vety {
    Random random = new Random();

    private String[] podnety = {" jednorožec"," programátor"," manažer"," hroch"," T-rex"};
    private String[]prisudky= {" spal"," ležel"," vařil"," uklízel"," derivoval"};
    private String privlastky= " modrý, velký, hubený, nejlepší, automatizovaný";
    private String[]priv = privlastky.split(",");
    private String prislovce = " rychle, s oblibou, hodně, málo, se zpožděním";
    private String[] pris = prislovce.split(",");
    private String miesta = " pod stolem, v lese, u babičky, v práci, na stole" ;
    private String[] m = miesta.split(",");

    public String daj(){
        String s1 = podnety[random.nextInt(5)];
        String s2 = prisudky[random.nextInt(5)];
        return priv[random.nextInt(5)] + s1 + pris[random.nextInt(5)] + s2 + m[random.nextInt(5)];
    }
}
