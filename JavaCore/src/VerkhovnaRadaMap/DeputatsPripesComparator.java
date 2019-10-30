package VerkhovnaRadaMap;

import java.util.Comparator;

public class DeputatsPripesComparator implements Comparator<Deputat> {
    @Override
    public int compare(Deputat o1, Deputat o2) {
        if(o1.getBribesSize() == o2.getBribesSize()){
            return 0;
        }else if(o1.getBribesSize() < o2.getBribesSize()){
            return 1;
        }else {
            return -1;
        }
    }
}
