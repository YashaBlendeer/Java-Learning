package files;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;
    private int comparableValue;
    private boolean compareResult;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        //[1; 99]
        model.setMinValueCurrent(GlobalConstants.MIN_RANGE_VALUE);
        model.setMaxValueCurrent(GlobalConstants.MAX_RANGE_VALUE);
        model.generateNumber(model.getMinValueCurrent(), model.getMaxValueCurrent());

        view.printMessage(View.DATA_FOR_USER + View.RANGE_TO_GUESS
                + model.getMinValueCurrent() + " - "
                + model.getMaxValueCurrent());
        view.printMessage(View.GENERATED_NUMBER_VALUE + model.getValue());

        processResult(sc);
    }

    // The Utility methods

    private void processResult(Scanner sc) {
        compareResult = false;

        while (!compareResult) {
            comparableValue = inputIntValueWithScannerAndDiapason(sc);
            compareResult = model.compareValue(comparableValue);
            model.setTries(comparableValue);

            if(compareResult)
                break;

            view.printMessage(View.WRONG_NUMBER_VALUE);
            view.printMessage(View.RANGE_TO_GUESS
                    + model.getMinValueCurrent() + " - "
                    + model.getMaxValueCurrent());
            view.printMessage(View.TRIES_INT_SET + model.getTries());
        }
        view.printMessage(View.CORRECT_NUMBER_VALUE);
    }

    public int inputIntValueWithScannerAndDiapason(Scanner sc) {
        int res=0;
        view.printMessage(view.INPUT_INT_DATA);

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT_DATA
                        + view.INPUT_INT_DATA);
                sc.next();
            }
            // check value in diapason
            res = sc.nextInt();
            if (res <= model.getMinValueCurrent() ||
                    res >= model.getMaxValueCurrent()) {
                view.printMessage(view.VALUE_OUT_OF_RANGE
                        + View.INPUT_INT_DATA);
                continue ;
            }
            break;
        }
        return res;
    }

     /*  private int inputIntValueWithScanner(Scanner sc){
            view.printMessage(files.View.INPUT_INT_DATA);
            while( ! sc.hasNextInt()) {
                view.printMessage(files.View.WRONG_INPUT_DATA + files.View.INPUT_INT_DATA);
                sc.next();
            }
            return sc.nextInt();

        }*/

}
