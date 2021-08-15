public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int minIncomeAmount = 5000;
        double bonus;
        if (minIncomeAmount > 1000) {
            bonus = 0.01;
        } else {
            bonus = 0;
        }
        int totalAmount = (int) (initialAmount + minIncomeAmount + minIncomeAmount * bonus);

        System.out.println(totalAmount);
     }
    }
