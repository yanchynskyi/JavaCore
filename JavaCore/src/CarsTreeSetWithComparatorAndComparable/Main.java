package CarsTreeSetWithComparatorAndComparable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Car> cars = new TreeSet<>();
        ArrayList<Car> carsFromBiggest = new ArrayList<>();
        ArrayList<Car> carsFromSmallest = new ArrayList<>();

        cars.add(new Car("Reno", 2019,3432,"black", new Enginee("frost",2.4,210),new Wheel("wheeels",35)));
        cars.add(new Car("Mazda", 1980,2432,"red", new Enginee("frost1",3.4,260),new Wheel("wheeels2",40)));
        cars.add(new Car("Ford", 1990,2532,"green", new Enginee("frostDeLux",3.9,290),new Wheel("wheeels5",50)));
        cars.add(new Car("Porshe", 2050,6969,"yellow", new Enginee("frost666",6.4,2160),new Wheel("wheeels42",70)));
        cars.add(new Car("Jip", 1998,6969,"yellow", new Enginee("frost666",6.4,2160),new Wheel("wheeels42",70)));
        cars.add(new Car("BMW", 1990,6969,"yellow", new Enginee("frost666",6.4,2160),new Wheel("wheeels42",70)));
        cars.add(new Car("Mersedes", 1991,6969,"yellow", new Enginee("frost666",6.4,2160),new Wheel("wheeels42",70)));
        //------------------------------------------------------------------------
        for (Car car : cars) {
            if (car.getYear() < 2000){
                int newValue = car.getWheel().getSize() - 1;
                String manufactur = car.getWheel().getManufacturer();
                car.setWheel(new Wheel(manufactur,newValue));
                car.setColor("green");
                carsFromBiggest.add(car);
                carsFromSmallest.add(car);
            }
            System.out.println(car);
        }
        System.out.println();
        System.out.println("-----------------------------In a year of decline----------------------------------------");
        //--------------------------------------------------------------------------
        CarComparatorFromBiggest compFromBig = new CarComparatorFromBiggest();
        CarComparatorFromSmallest compFromSmall = new CarComparatorFromSmallest();

        carsFromSmallest.sort(compFromSmall);
        for (Car car : carsFromSmallest) {
            System.out.println(car);
        }
        System.out.println();
        System.out.println("------------------------------By year of growth------------------------------------------");
        carsFromBiggest.sort(compFromBig);
        for (Car car : carsFromBiggest) {
            System.out.println(car);
        }
        System.out.println();
        System.out.println("-------------------------------Containing two Lists---------------------------------------");
        carsFromSmallest.addAll(carsFromBiggest);
        for (Car car : carsFromSmallest) {
            System.out.println(car);
        }


    }
}