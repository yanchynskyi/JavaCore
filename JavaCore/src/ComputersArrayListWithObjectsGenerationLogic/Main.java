package ComputersArrayListWithObjectsGenerationLogic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int randYear = (int) (2000 + Math.random() * 19);          //генеруємо: рік випуску
            int randCapacityOfHardDrive = Computer.randomCapacity();   //           об'єм пам'яті
            int price = Computer.price(randCapacityOfHardDrive);       //           ціну(відповідно характеристикам)
            ProducingCountry randCountry = Computer.randomCountry();   //           країну - виробника

            computers.add(new Computer("hp" + i,randYear,randCapacityOfHardDrive,price, new HardDrive("hard drive company",TypeOfHardDrive.HDD,randCapacityOfHardDrive,randCountry),new Processor("Intel Core",7,2.8,randCountry)));
        }

        System.out.println("    Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник дисків Китай\n" +
                "_______________________________________________________________________________________________");
        for (int i = 0; i < computers.size() - 1; i++) {//виводимо на екран список лептопів 2010+ та виробник жорст диску - Китай
            if (computers.get(i).getGraduationYear() > 2010 && computers.get(i).getHardDrive().getCountry().equals(ProducingCountry.CHINA)) {
                System.out.println(computers.get(i));
            }
        }
        System.out.println();
        System.out.println("     Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник дисків не Китай\n" +
                "________________________________________________________________________________________________");
        for (int i = 0; i < computers.size() - 1; i++) {
            if(computers.get(i).getGraduationYear() > 2010 && !computers.get(i).getHardDrive().getCountry().equals(ProducingCountry.CHINA)){
                System.out.println(computers.get(i));
            }
        }
        System.out.println();
        System.out.println("     Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7 посортувати за ціною\n" +
                "________________________________________________________________________________________________");
        ComputerComparatorToPrice computerComparatorToPrice = new ComputerComparatorToPrice();
        computers.sort(computerComparatorToPrice);
        for (int i = 0; i < computers.size() - 1; i++) {
            if(computers.get(i).getHardDrive().getHardDriveVolume() > 500 && computers.get(i).getProcessor().getNumberOCore() == 7){
                System.out.println(computers.get(i));
            }
        }

        //закінчити з логікою автогенерації компів ( процесор, к-сть ядер) та реалізувати логічну генерацію (вищі хар-ки - вища ціна)

    }
}
