package Controller;

import Model.Model;
import View.View;

import java.util.Scanner;
import static Controller.RegexPatterns.*;
import static View.TextConstants.*;

public class Controller {
    private final Model model;
    private final View view;
    private RegexPatterns regex;

    private String name;
    private String surname;
    private String patronymic;
    private String nickname;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_UA_PATTERN : REGEX_ENG_PATTERN;

        name = inputValueWithScanner(sc, NAME, str);
        surname = inputValueWithScanner(sc, SURNAME, str);
        patronymic = inputValueWithScanner(sc, PATRONYMIC, str);
        nickname = inputValueWithScanner(sc, NICKNAME, REGEX_LOGIN_PATTERN);
        model.setUsers(name, surname, patronymic, nickname);
        view.printMessage(model.getUsers().toString());
    }

    // The Utility methods

    private String inputValueWithScanner(Scanner sc, String message, String regex){
        view.printMessage(message);
        String value;

        while (!(sc.hasNext() && !isValid(value = sc.next(), regex))) {
            view.printWrongStringInput(message);
        }

        return value;
    }

    public boolean isValid(String input, String regex) {
        return input.matches(regex);
    }
}
