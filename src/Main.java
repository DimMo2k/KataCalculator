import java.util.Scanner;

public class Main {
    static int num1, num2;
    static String num11, num22;
    static char operation;
    static boolean num1Check = true;
    static boolean num2Check = true;




    public static void main(String[] args) throws InvalidInputException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String userKey = scanner.nextLine();    // Вводим данные в консоль

        calc(userKey);
    }

    public static String calc(String input) throws InvalidInputException {
        char[] userKeyArr = input.toCharArray();  // Переводим введенную строку в массив char

        for (char charTest : userKeyArr ){  // Ищем математический символ
            switch (charTest){
                case '+':
                    operation = '+';
                    break;
                case '-':
                    operation = '-';
                    break;
                case '*':
                    operation = '*';
                    break;
                case '/':
                    operation = '/';
                    break;
            }
        }



            num11 = input.substring(0, input.indexOf(operation));   // Отделяем часть строки от начала, до найденного оператора
            num11 = num11.trim();   //  Убираем пробелы, если они есть
            num22 = input.substring(input.indexOf(operation) + 1, userKeyArr.length);   // Вторая часть строки, от оператора и до конца
            num22 = num22.trim();   //  Убираем пробелы, если они есть

        try {
            int a = Integer.parseInt(num11);    // Проверяем является ли первая часть строки числом
            num1Check = true;
        } catch (NumberFormatException e) {        // Если числом не является
            num1Check = false;
        }
        try {
            int a = Integer.parseInt(num22);    // Проверяем является ли вторая часть строки числом
            num2Check = true;
        } catch (NumberFormatException e) {
            num2Check = false;
        }

        if (num1Check != num2Check) {                           // Проверяем, чтобы оба числа были введены в одном формате
           throw new InvalidInputException("неверный ввод") ;   // Если числа разного формата, получаем исключение
        }



        if(num1Check == true && num2Check == true){         // Елси оба значения true, значит числа арабские
            num1 = Integer.parseInt(num11);              // Переводим строки в числа
            num2 = Integer.parseInt(num22);
            Arab arabResult = new Arab(num1,num2, operation);   // Получем результат методом из класса Arab
        }
        else if((num1Check == false && num2Check == false)) {   // Если оба числа false, числа римские
            Rome romeResult = new Rome(num11, num22, operation);    // Получем результат методом из класса Rome
        }
        return input;
    }

}
