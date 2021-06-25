package com.yashablendeer;

/**
 * Created by YashaBlendeer on 25.06.2021.
 */

public class View {
    // Text's constants

    public static final String INPUT_HELLO_DATA = "Input word 'Hello': ";
    public static final String INPUT_WORLD_DATA = "Input word 'world!': ";
    public static final String OUR_STRING = "Our sentence is: ";
    public static final String WRONG_INPUT_STRING_DATA = "Wrong input! Repeat please! ";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndString(String message, String value){
        System.out.println(message + value);
    }

}
