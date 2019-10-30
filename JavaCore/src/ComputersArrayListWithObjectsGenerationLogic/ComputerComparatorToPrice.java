package ComputersArrayListWithObjectsGenerationLogic;

import java.util.Comparator;

public class ComputerComparatorToPrice implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        if(o1.getPrice() == o2.getPrice()){
            return 0;
        }else if(o1.getPrice() < o2.getPrice()){
            return -1;
        }else {
            return 1;
        }
    }
}
