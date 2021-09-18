public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int bonus = 0;
        int cashIn = 1001;
        balance = balance + cashIn;
        if (cashIn > 1000) {
            bonus = cashIn / 100;
        } else {
            bonus = 0;
        }
        balance = balance + bonus;
        System.out.printf(" Бонус " + bonus);
        System.out.printf(" Балланс " + balance);
    }

}
