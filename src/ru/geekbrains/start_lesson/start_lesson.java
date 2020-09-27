package ru.geekbrains.start_lesson;

public class start_lesson {

    public static void main(String[] args) {
        //п.1 и 2 домашнего задания
        System.out.println("1. Типы данных и их значения: ");
        byte firstByte = -115;
        printVariable("1.1 Byte равен: ", firstByte);
        short firstShort = 250;
        printVariable("1.2 Short равен: ", firstShort);
        int firstInt = 500;
        printVariable("1.3 Int равен: ", firstInt);
        long firstLong = - 10000000;
        System.out.println("1.4 Long равен: " + firstLong);
        float firstFloat = 13.75f;
        System.out.println("1.5 Float равен: " + firstFloat);
        double firstDouble = -43.24;
        System.out.println("1.6 Double равен: " + firstDouble);
        char firstChar = 'a';
        System.out.println("1.7 Char имеет значение: " + firstChar);
        boolean firstBoolean = true;
        System.out.println("1.8 Boolean имеет значение: " + firstBoolean);
        int j = 7;
        int h = 35;
        int k = 9;
        int l = 3;
        int result = comparisonNumbers(j, h, k, l);
        System.out.println("2. Сумма чисел равна: " + result);
        int f = 5;
        int g = 13;
        comparisonNumber(f, g);
        rangeNumber(firstShort);
        int showNumber = -40;
        bool (showNumber);
        String str = "Aleksey";
        printHello (str);
        leapYear(2006);
    }

    // п.3 домашнего задания
    static int comparisonNumbers(int a, int b, int c, int d) {
        int e = (int) (a* (b + (c / d)));
        return e;
    }

    // п.4 домашнего задания
    static boolean comparisonNumber (int numberOne, int numberTwo) {
        int sumTwoNumbers = numberOne + numberTwo;
        if (sumTwoNumbers >= 10 && sumTwoNumbers <= 20){
            System.out.println("3. Сумма чисел больше 10 и меньше 20");
            return true;
        } else {
            return false;
        }
    }

    //п.5 домашнего задания
    static void rangeNumber (int e){
        if(e >= 0){
            System.out.println("4. Число положительное.");
        } else{
            System.out.println("4. Число отрицательное.");
        }
    }

    //п.6 домашнего задания
    static boolean bool (int number) {
        if (number < 0) {
            System.out.println("5. Число отрицательное");
            return true;
        } else {
            return false;
        }
    }
        // п.7 домашнего задания
        static void printHello(String name){
            System.out.println ("6. Привет, " + name);
        }

        // вне домашнего задания
        static void printVariable(String name, int number){
            System.out.println(name + number);
        }

        // п.8 домашнего задания (выполняется не верно, не могу найти причину)
        static void leapYear (int year) {
            int t = year / 4;
            int s = year / 100;
            int p = year / 400;
            if (t == year / 4) {
                System.out.println("7. " + year + " год - високосный");
            } else if (t != s && t == p) {
                System.out.println("7. " + year + " год - високосный");
            } else {
                System.out.println("7. " + year + " год - невисокосный");
            }
        }
}

