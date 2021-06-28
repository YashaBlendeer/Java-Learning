public class View {
    // Text's constants

    public static final String DATA_FOR_USER =
                    "Welcome to the Pictionary - try to guess the generated number. ";
    public static final String RANGE_TO_GUESS = "The set of expected numbers is: ";
    public static final String TRIES_INT_SET = "The set of your tries: ";
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String GENERATED_NUMBER_VALUE = "Generated number = ";

    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String WRONG_NUMBER_VALUE =
                    "That's not the generated number. Try again";
    public static final String CORRECT_NUMBER_VALUE =
                    "That's the correct number. You won!";

    public void printMessage(String message){
        System.out.println(message);
    }

}
