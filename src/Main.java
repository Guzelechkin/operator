public class Main {
    /**
     * Сотовый оператор решил сделать своим клиентам приятный бонус: если клиент пополняет счёт более
     чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.
     * @value incomingAmount - сумма на счете.
     * @value depositAmount - сумма пополнения.
     * @value bonusAmount - начисление бонуса.
     */
    public static void main(String[] args) {

        int incomingAmount = 1000;
        int depositAmount = 2500;
        boolean bonusCalc = depositAmount > 1000;

        int bonusAmount;
        if (bonusCalc) {
            bonusAmount = depositAmount / 100;
        } else {
            bonusAmount = 0;
        }

        int account = incomingAmount + depositAmount + bonusAmount;

        System.out.println("Итоговая сумма на счете: " + account + "₽");
        System.out.println("В т.ч. бонус за пополнение: " + bonusAmount + "₽");
    }
}
