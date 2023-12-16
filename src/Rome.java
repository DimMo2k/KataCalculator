public class Rome {
    // Создаём строковый массив и заполняем его римскими числами от 1 до 100 включительно
    static String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    static String result;
    public Rome(String a, String b, char operation) throws InvalidInputException {
        int str1 = 0;
        int str2 = 0;

        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(a)){        // Сравнивает первое римское число с числами в массиве
                str1 = i;}      // При совпадении сохраняет в перемнную индекс массива roman
        }
        for (int i = 0; i < roman.length; i++) {    // тоже самое со вторым числом
            if (roman[i].equals(b)){
                str2 = i;}
        }

        if(str1 < 1 || str1 > 10 || str2 < 1 || str2 > 10){     // проверяет, чтобы числа были в заданном диапозоне
            throw new InvalidInputException("неизвестное число");       // иначе выдаётся исключение
        }

        if (operation == '+') {             //  проводим вычисления в зависимости от оператора
            result = roman[str1 + str2];
        } else if (operation == '-') {
            result = roman[str1 - str2];
        } else if (operation == '*') {
            result = roman[str1 * str2];
        } else if (operation == '/') {
            result = roman[str1 / str2];
        }
        if( result == roman[0]) {       // если результат равен 0, выдаётся исключение
            throw new InvalidInputException("ответ не может быть меньше 0");
        }

        System.out.println(result);     // выводим результат
        }
}

