package VerkhovnaRadaMap;

import java.util.ArrayList;

public class Faction {  // mapa key - theName , value - arrayList
    public static ArrayList<Deputat> faction;
    private static Deputat deputat;


    public static void addDeputatToFaction(Deputat deputat, ArrayList<Deputat> deputats) {         //add deputat
        deputats.add(deputat);
    }

    public static void deleteDeputatToFaction(String surname, ArrayList<Deputat> deputats) {       //delete deputat
        for (int i = 0; i < deputats.size(); i++) {
            if(deputats.get(i).getSurrame().equals(surname)){
                deputats.remove(i);
            }
        }
    }

    public static void operationANTICORUPTION (ArrayList<Deputat> deputats) {                   //delete all coruptions deputats!(bitches)
        for (int i = 0; i < deputats.size(); i++) {
             if(deputats.get(i).getBribeTaker() == true){
                 deputats.remove(i);
             }
        }
    }

    public static Deputat theBiggestPriperTaker (ArrayList<Deputat> deputats) {                  //print the bigger priper taker
        DeputatsPripesComparator deputatsPripesComparator = new DeputatsPripesComparator();
        deputats.sort(deputatsPripesComparator);
        return deputats.get(0);
    }

    public static void printAllDeputats (ArrayList<Deputat> deputats) {                           //print all deputats
        for (int i = 0; i < deputats.size(); i++) {
            System.out.println(deputats.get(i));
        }
    }

    public static void printAllBribesDeputats (ArrayList<Deputat> deputats) {                           //print all bribes deputats
        for (int i = 0; i < deputats.size(); i++) {
            if (deputats.get(i).getBribeTaker() == true){
            System.out.println(deputats.get(i));
            }
        }
    }

    public static void deleteAllDeputats (ArrayList<Deputat> deputats) {                          //delete all deputats from fraction
        for (int i = 0; i < deputats.size(); i++) {
             faction.remove(i);
        }
    }

    public static void sumOfAllPripes () {                            //print the sum of the all bribes
        Integer sumOfPripes = 0;
        for (int i = 0; i < faction.size(); i++) {
             Integer bribe = faction.get(i).getBribesSize();
            sumOfPripes = sumOfPripes + bribe;
        }
        System.out.println(sumOfPripes);
    }




}
