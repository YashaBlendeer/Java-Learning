package View;

import java.util.Locale;
import java.util.ResourceBundle;
import static View.TextConstants.REQUEST_INPUT;
import static View.TextConstants.WRONG_INPUT;

public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
//                    new Locale("ua", "UA"));  // Ukrainian
                    new Locale("en"));        // English

    //Utilities methods

    public void printMessage(String message){
        System.out.println(message);
    }

    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(REQUEST_INPUT),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT),
                bundle.getString(REQUEST_INPUT),
                bundle.getString(message)));
    }

}
