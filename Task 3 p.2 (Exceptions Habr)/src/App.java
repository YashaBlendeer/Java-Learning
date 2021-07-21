public class App {

    //механизм исключений позволяет ничего не возвращать
    public static double sqr1(double arg) {
        throw new RuntimeException();
    }

    //можно ничего не возвращать, а «повесить метод»
    public static double sqr2(double arg) {
        while (true); // компилируется
    }

    //три варианта для компилятора
    public static double sqr3(double arg) {// согласно объявлению метода ты должен вернуть double
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;             // ок, вот твой double
        } else if (time % 2 == 1) {
            while (true);                 // не, я решил "повиснуть"
        } else {
            throw new RuntimeException(); // или бросить исключение
        }
    }

    //COMPILATION ERROR: Missing return statement - компилятор не может удостовериться, что возврат будет
    public static double sqr4(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg; // если currentTimeMillis() - четное число, то все ОК
        }
        // а если нечетное, что нам возвращать?
    }
}
