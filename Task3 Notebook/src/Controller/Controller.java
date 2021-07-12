package Controller;

import Model.Model;
import Model.User;
import Model.ModelDB;
import Model.NotUniqueNicknameException;
import View.View;

import java.util.Scanner;
import static Controller.RegexPatterns.*;
import static View.TextConstants.*;

public class Controller {
    private final Model model;
    private final View view;

    private String name;
    private String surname;
    private String patronymic;
    private String nickname;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        ModelDB mdb = new ModelDB(model);
        UtilityController utilityController =
                new UtilityController(view, sc, model);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_UA_PATTERN : REGEX_ENG_PATTERN;

        mdb.addDB();

        name = utilityController.inputValueWithScanner(sc, NAME, str);
        surname = utilityController.inputValueWithScanner(sc, SURNAME, str);
        patronymic = utilityController.inputValueWithScanner(sc, PATRONYMIC, str);

        try {
            nickname = utilityController.inputLoginWithScanner(sc, NICKNAME, REGEX_LOGIN_PATTERN);

        } catch (NotUniqueNicknameException e) {
            e.printStackTrace();
        }

        model.setUsers(name, surname, patronymic, nickname);
        view.printMessage(model.getUsers().toString());
    }
}
