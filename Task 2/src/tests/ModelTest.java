package tests;

import files.GlobalConstants;
import files.Model;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;

public class ModelTest {

    private static Model model;

    @BeforeClass
    public static void init() {
        model = new Model();
        model.setMinValueCurrent(GlobalConstants.MIN_RANGE_VALUE);
        model.setMaxValueCurrent(GlobalConstants.MAX_RANGE_VALUE);
    }

    @Test
    public void generateNumberTest() {
        for(int i = 0; i < 10000; i++) {
            model.generateNumber(model.getMinValueCurrent(), model.getMaxValueCurrent());
            int generatedValue = model.getValue();
            boolean isInRange = generatedValue > model.getMinValueCurrent() &&
                                generatedValue < model.getMaxValueCurrent();
            Assert.assertTrue(isInRange);

        }
    }

//    @Test
//    public void compareValueTest() {
//
//    }
}