public class Arab {

    static int result;
    public  Arab(int a, int b, char operation) throws InvalidInputException {

        if(a < 1 || a > 10 || b < 1 || b > 10){     // Проверяем, чтобы введенные числа были в диапозоне от 1 до 10 включительно
            throw new InvalidInputException("Пожалуйста введите число от 1 до 10 включительно");    // Если нет, получаем исключение
        }
        if (operation == '+') {         // Считаем результат в зависимости от оператора и запоминаем в переменную result
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else if (operation == '/') {
            result = a / b;
        }
        System.out.println(result);     // Выводим результат на экран
    }
}