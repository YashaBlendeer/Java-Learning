public class Exmpl4 {
    public static void main(String[] args) {
        //правило — нельзя ставить потомка после предка
        //COMPILATION ERROR: Exception 'java.lang.RuntimeException' has alredy been caught
        try {
        } catch (Exception e) {
        } catch (RuntimeException e) {
        }


        //Ставить брата после брата — можно
        try {
        } catch (Error e) {
        } catch (RuntimeException e) {
        }

    }
}
