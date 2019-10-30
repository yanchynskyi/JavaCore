package VerkhovnaRadaMap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VerkhovnaRada.addFaction("Golos", new ArrayList<>());
        VerkhovnaRada.addFaction("Udar", new ArrayList<>());
        VerkhovnaRada.addFaction("ES", new ArrayList<>());
        Faction.addDeputatToFaction(new Deputat(76.5, 177, "Svyatoslav", "Vakarchuk", 43,false), VerkhovnaRada.verkhovnaRada.get("Golos"));
        Faction.addDeputatToFaction(new Deputat(76.5, 177, "Volodymyr", "Klychko", 43,true, 100), VerkhovnaRada.verkhovnaRada.get("Udar"));
        Faction.addDeputatToFaction(new Deputat(76.5, 177, "Petro", "Poroshenko", 43,true, 2000), VerkhovnaRada.verkhovnaRada.get("ES"));
        Faction.addDeputatToFaction(new Deputat(76.5, 177, "Vlad", "Moloko", 43,false), VerkhovnaRada.verkhovnaRada.get("ES"));
        //VerkhovnaRada.deleteOneDeputatFromFaction("ES", "Moloko");
        VerkhovnaRada.printAllbribesDeputatsFromOneFaction("ES");
        VerkhovnaRada.printAllFaction();
    }
}

