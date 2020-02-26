package TextGame;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Lokacia hrad = new Lokacia("Hrad", "Stojíš před okovanou branou gotického hradu, která je zřejmě jediným vchodem do pevnosti.\n"
                + "Klíčová dírka je pokryta pavučinami, což vzbuzuje dojem, že je budova opuštěná.");
        Lokacia les1 = new Lokacia("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n"
                + "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokacia rozcesti = new Lokacia("Lesní rozcestí", "Nacházíš se na lesním rozcestí.");
        Lokacia les2 = new Lokacia("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n"
                + "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokacia rybnik = new Lokacia("Rybník", "Došel jsi ke břehu malého rybníka. Hladina je v bezvětří jako zrcadlo. Kousek\n"
                + "od tebe je dřevěná plošina se stavidlem.");
        Lokacia les3 = new Lokacia("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n"
                + "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokacia dum = new Lokacia("Dům", "Stojíš před svým rodným domem, cítíš vůni čerstvě nasekaného dřeva, která se line\n"
                + "z hromady vedle vstupních dveří.");

        dum.SusZ(les3);
        les3.SusV(dum);
        les3.SusS(rozcesti);
        rozcesti.SusV(les2);
        rozcesti.SusZ(les1);
        rozcesti.SusJ(les3);
        les1.SusZ(hrad);
        les1.SusV(rozcesti);
        hrad.SusV(les1);
        les2.SusV(rybnik);
        les2.SusZ(rozcesti);
        rybnik.SusZ(les2);

        Hra hra = new Hra();
        hra.lokacia = rybnik;

        while (hra.volba != "konec"){
            hra.pohyb();
        }
    }
}
