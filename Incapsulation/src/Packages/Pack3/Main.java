package Packages.Pack3;

import static yaBobJonez.Output.*;
import Packages.Pack2.CherkaKirovo;
import Packages.Pack2.Population;
import Packages.Pack2.ZhytoVinny;

public class Main {
    public static void main(String[] args) {
        Population pop = new Population();
        print("Черкаська + Кіровоградська: " + CherkaKirovo.get(pop));
        print("Житомирська + Вінницька: " + ZhytoVinny.get(pop));
        print("Вінницька + Черкаська + Кіровоградська: " + VinnyCherkaKirovo.get(pop));
    }
}
