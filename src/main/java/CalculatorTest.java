import homework.first.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {

        // HW-1
//        Проверить метод calculateDiscount с использованием библиотеки AssertJ. Если метод calculateDiscount
//        получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
//        Не забудьте написать тесты для проверки этого поведения.

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-100, 50))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапозоне от 0 до 100%");

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапозоне от 0 до 100%");

        assertThat(Calculator.calculatingDiscount(100, 30)).isEqualTo(70);
        assertThat(Calculator.calculatingDiscount(100, 0)).isEqualTo(100);
        assertThat(Calculator.calculatingDiscount(100, 100)).isEqualTo(0);

//        System.out.println(Calculator.calculatingDiscount(-100, 50));
//        System.out.println(Calculator.calculatingDiscount(100, -10));
//        System.out.println(Calculator.calculatingDiscount(100, 101));
        System.out.println(Calculator.calculatingDiscount(100, 30));
        System.out.println(Calculator.calculatingDiscount(100, 0));
        System.out.println(Calculator.calculatingDiscount(100, 100));
    }
}