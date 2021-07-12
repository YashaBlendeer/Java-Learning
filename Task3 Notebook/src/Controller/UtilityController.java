package Controller;

import Model.Model;
import View.View;
import Model.ModelDB;
import Model.NotUniqueNicknameException;


import java.util.Scanner;

public class UtilityController {
    private View view;
    private Scanner sc;
    private Model model;

    public UtilityController(View view, Scanner sc, Model model) {
        this.view = view;
        this.sc = sc;
        this.model = model;
    }

    String inputValueWithScanner(Scanner sc, String message, String regex){
        view.printStringInput(message);
        String value;

        while (!(sc.hasNext() && isValid(value = sc.next(), regex))) {
            view.printWrongStringInput(message);
        }

        return value;
    }

    String inputLoginWithScanner(Scanner sc, String message, String regex) throws NotUniqueNicknameException {
//        ModelDB mdb = new ModelDB(model);
        view.printStringInput(message);
        String value;

        while (!(sc.hasNext() && isValid(value = sc.next(), regex))) {
            view.printWrongStringInput(message);
        }
        while (model.NonUniqueNicknameCheck(value)) {
            throw new NotUniqueNicknameException("Non-unique nickname");
        }
        return value;

    }
    private boolean isValid(String input, String regex) {
        return input.matches(regex);
    }
}
