package com.yashablendeer;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by YashaBlendeer on 25.06.2021.
 */

public class Controller {
    // The Constants
    public static final String CHECK_WORD_HELLO = "Hello";
    public static final String CHECK_WORD_WORLD = "world!";


    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setHelloValue(inputStringHelloValueWithScanner(sc));
        model.setWorldValue(inputStringWorldValueWithScanner(sc));
        String result = model.addStringOurValue();

        view.printMessageAndString(View.OUR_STRING, result);
    }

    // The Utility methods

    public String inputStringHelloValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_HELLO_DATA);
        while (!sc.hasNext(CHECK_WORD_HELLO)) {
            view.printMessage(View.WRONG_INPUT_STRING_DATA + View.INPUT_HELLO_DATA);
            sc.next();
        }
        return sc.next();
    }

    public String inputStringWorldValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_WORLD_DATA);
        while( !sc.hasNext(CHECK_WORD_WORLD)) {
            view.printMessage(View.WRONG_INPUT_STRING_DATA + View.INPUT_WORLD_DATA);
            sc.next();
        }
        return sc.next();
    }
}