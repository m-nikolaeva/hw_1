package homework.first;



public class Calculator {

    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки
     * @return возвращает сумму покупки с учетом скидки
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double discountedPrice;

        if (purchaseAmount >= 0) {

            if (discountAmount >= 0 && discountAmount <= 100) {
                discountedPrice = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else {
                throw new ArithmeticException("Скидка должна быть в диапозоне от 0 до 100%");
            }
        } else {
            throw new ArithmeticException("Сумма покупки не может быть отрицательной");
        }

        return discountedPrice;
    }
}
