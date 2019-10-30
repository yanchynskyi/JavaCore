package Terminal;

public class Terminal {
    public static int money = 1000;

    public static int moneyOut(int value){
        money = money - value;
        return money;
    }

    public static int moneyIn(int value){
        money = value + money;
        return money;
    }

}
