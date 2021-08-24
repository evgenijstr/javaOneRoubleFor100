public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int incomeAmount = 1100;
        double bonus;
        if (incomeAmount > 1000) {
            bonus = incomeAmount * 0.01;
        } else {
            bonus = 0;
        }
        int totalAmount = (int) (initialAmount + incomeAmount + bonus);

        System.out.println(totalAmount);
        System.out.println(bonus);
    }
}
