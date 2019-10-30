package VerkhovnaRadaMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VerkhovnaRada {
    public static HashMap<String, ArrayList<Deputat>> verkhovnaRada = new HashMap<>();
    public static ArrayList<Deputat> negidnyky = new ArrayList<>();


    public static void addFaction (String nameOfFaction, ArrayList<Deputat> faction) {   //add faction
        while (true) {
            if (!nameOfFaction.equals("")) {
                verkhovnaRada.put(nameOfFaction, new ArrayList<>());
                break;
            }else {
                break;
            }
        }
    }

    public static void printAllFaction () {                                              //print all faction
        Iterator<Map.Entry<String, ArrayList<Deputat>>> iterator = verkhovnaRada.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, ArrayList<Deputat>> pair = iterator.next();
            String theNameOfFraction = pair.getKey();
            ArrayList<Deputat> faction = pair.getValue();
            System.out.println(theNameOfFraction);
            System.out.println("_____________");
            Faction.printAllDeputats(faction);
            System.out.println();
            System.out.println();
        }
    }

    public static void printOneFaction (String faction) {                                 //print one faction
        Iterator<Map.Entry<String, ArrayList<Deputat>>> iterator = verkhovnaRada.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, ArrayList<Deputat>> pair = iterator.next();
            String keyFaction = pair.getKey();
            ArrayList<Deputat> deputats = pair.getValue();
            if(faction.equals(keyFaction)) {
                System.out.println(keyFaction);
                System.out.println("___________");
                Faction.printAllDeputats(deputats);
            }
        }
    }

    public static void deleteOneDeputatFromFaction (String faction, String deputatSurname) {//deleteOneDeputatFromFaction
        Iterator<Map.Entry<String, ArrayList<Deputat>>> iterator = verkhovnaRada.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, ArrayList<Deputat>> pair = iterator.next();
            String keyFaction = pair.getKey();
            ArrayList<Deputat> deputats = pair.getValue();
            if (faction.equals(keyFaction)) {
                Faction.deleteDeputatToFaction(deputatSurname, deputats);
            }
        }
    }

    public static void printAllbribesDeputatsFromOneFaction (String faction) {                    //printAllbribesDeputats
        Iterator<Map.Entry<String, ArrayList<Deputat>>> iterator = verkhovnaRada.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, ArrayList<Deputat>> pair = iterator.next();
            String keyFaction = pair.getKey();
            ArrayList<Deputat> deputatsFromFaction = pair.getValue();
            if (keyFaction.equals(faction)) {
                for (int i = 0; i < deputatsFromFaction.size(); i++) {
                    if (deputatsFromFaction.get(i).getBribeTaker() == true){
                        System.out.println(deputatsFromFaction.get(i));
                    }
                    }
            }
        }
    }





}
