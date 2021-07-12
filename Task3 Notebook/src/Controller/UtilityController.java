package Controller;

import View.View;

import java.util.Scanner;

public class UtilityController {
    private View view;
    private Scanner sc;

    public UtilityController(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    String inputValueWithScanner(Scanner sc, String message, String regex){
        view.printStringInput(message);
        String value;

        while (!(sc.hasNext() && isValid(value = sc.next(), regex))) {
            view.printWrongStringInput(message);
        }

        return value;
    }

    private boolean isValid(String input, String regex) {
        return input.matches(regex);
    }
}
