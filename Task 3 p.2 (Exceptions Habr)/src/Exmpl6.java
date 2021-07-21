public class Exmpl6 {
    public static void main(String[] args) throws Exception //Throwable{
        try {
            Throwable t = new Exception(); // и лететь будет Exception
            throw t; // но тут ошибка компиляции
            // COMPILATION ERROR: unhandled exception: java.lang.Throwable
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }


        /*
        try {
            Throwable t = new Exception(); // а лететь будет Exception
            throw t;
        } catch (Exception e) { // и мы перехватим Exception
            System.out.println("Перехвачено!");
        }
        */

    }
}
