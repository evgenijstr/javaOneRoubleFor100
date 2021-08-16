public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int incomeAmount = 1100;
        double coefficient;
        int bonus;
        if (incomeAmount > 1000) {
            coefficient = 0.01;
        } else {
            coefficient = 0;
        }
        int totalAmount = (int) (initialAmount + incomeAmount + incomeAmount * coefficient);
        if (incomeAmount > 1000) {
            bonus = (int) (incomeAmount * coefficient);
        } else {
            bonus = 0;
        }
        System.out.println(totalAmount);
        System.out.println(bonus);
    }
}
