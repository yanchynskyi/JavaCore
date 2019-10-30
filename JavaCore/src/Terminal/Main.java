package Terminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean correct = true;
        do {
            Scanner scr = new Scanner(System.in);
            System.out.println("Доброго дня!");
            System.out.println("Оберіть дію:");
            System.out.println("1.Переглянути баланс");
            System.out.println("2.Зняти кошти");
            System.out.println("3.Поповнити рахунок");
            System.out.println("4.Вихід");
            int scrInt = scr.nextInt();
            if (scrInt == 1) {   // показує баланс
                System.out.println("На вашому рахунку:");
                System.out.println(Terminal.money + "$");
                System.out.println("_____________________");
                System.out.println("1.Повернутись в меню");
                System.out.println("2.Вихід");
                int scrInt1 = scr.nextInt();
                if(scrInt1 == 1){

                }else if(scrInt1 == 2){
                    System.out.println("До побачення!");
                    correct = false;
                }
            } else if (scrInt == 2) {
                System.out.println("Введіть суму, яку бажаєте зняти:");
                int scrInt2 = scr.nextInt();    //зняття з рахунку
                if (scrInt2 <= Terminal.money) {
                    System.out.println("Ви успішно зняли " + scrInt2 + "$");
                    System.out.println("_____________________");
                    System.out.println("Ваш залишок становить: " + Terminal.moneyOut(scrInt2) + "$");
                    System.out.println("1.Повернутись в меню");
                    System.out.println("2.Вихід");
                    int scrInt1 = scr.nextInt();
                    if(scrInt1 == 1){
                        // повертає в меню ( гамнокодіщє)
                    }else if(scrInt1 == 2){
                        System.out.println("До побачення!");
                        correct = false;


                    }
                } else {
                    System.out.println("На рахунку недостатньо коштів для даної операції!");
                    System.out.println("_____________________");
                    System.out.println("1.Повернутись в меню");
                    System.out.println("2.Вихід");
                    int scrInt1 = scr.nextInt();
                    if(scrInt1 == 1){
                        // повертає в меню ( гамнокодіщє)
                    }else if(scrInt1 == 2){
                        System.out.println("До побачення!");
                        correct = false;
                    }
                }
            } else if (scrInt == 3) {             // поповнення рахунку
                System.out.println("Внесіть кошти:");
                int scrInt3 = scr.nextInt();
                System.out.println("Ваш рахунок поповнено на: " + scrInt3 + "$");
                System.out.println("_____________________");
                System.out.println("Ваш баланс тепер становить: " + Terminal.moneyIn(scrInt3) + "$");
                System.out.println("1.Повернутись в меню");
                System.out.println("2.Вихід");
                int scrInt1 = scr.nextInt();
                if(scrInt1 == 1){
                    // повертає в меню ( гамнокодіщє)
                }else if(scrInt1 == 2){
                    System.out.println("До побачення!");
                    correct = false;
                }
            } else if (scrInt == 4) {
                System.out.println("До побачення!");
                correct = false;
                // повертає в меню ( гамнокодіщє)
            }
        }while (correct == true);
    }
}
