public class Main {
    public static void main(String[] args) {
        int balanceBefore = 589;
        int balanceUp = 1721;
        int newBalance = balanceBefore + balanceUp;
        String message1 = "Счет пополнен на ";
        String message2 = " рублей";
        String message3 = "Баланс составляет ";


        if (balanceUp > 1000) {
            int bonus = balanceUp / 100;
            System.out.println(message1 + (balanceUp + bonus) + message2);
            System.out.println(message3 + (balanceBefore + balanceUp + bonus) + message2);
        } else {
            System.out.println(message1 + balanceUp + message2);
            System.out.println(message3 + (balanceBefore + balanceUp) + message2);
        }
    }
}