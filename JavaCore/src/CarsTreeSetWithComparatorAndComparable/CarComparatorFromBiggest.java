package CarsTreeSetWithComparatorAndComparable;

import java.util.Comparator;

public class CarComparatorFromBiggest implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getYear() == car2.getYear()){
            return 0;
        }else if (car1.getYear() > car2.getYear()){
            return -1;
        }else {
        return 1;
        }
    }
}
