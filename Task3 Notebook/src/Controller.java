import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public static final String NAME_PATTERN = "[a-zA-Z]{1,}";
    public static final String SURNAME_PATTERN = "[a-zA-Z]{1,}";
    public static final String PATRONYMIC_PATTERN = "[a-zA-Z]{1,}";
    public static final String NICKNAME_PATTERN = "^[a-zA-Z0-9_]*$"; //"[a-zA-Z](.[a-zA-Z0-9_-]*)"

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        String userName = inputValueWithScanner(sc, View.INPUT_NAME, NAME_PATTERN);
        view.printMessage(userName);
        String userSurname = inputValueWithScanner(sc, View.INPUT_SURNAME, SURNAME_PATTERN);
        view.printMessage(userSurname);
        String userPatronymic = inputValueWithScanner(sc, View.INPUT_PATRONYMIC, PATRONYMIC_PATTERN);
        view.printMessage(userPatronymic);

    }

    // The Utility methods

    private String inputValueWithScanner(Scanner sc, String message, String regex){
        view.printMessage(message);
        String value;

        while (!isValid(value = sc.next(), regex)) {
            view.printMessage(View.WRONG_INPUT + message);
            sc.next();
        }
        return value;
    }

    public boolean isValid(String input, String regex) {
        return input.matches(regex);
    }
}
