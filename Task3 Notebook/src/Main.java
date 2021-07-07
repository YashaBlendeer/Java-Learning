import Controller.Controller;
import Model.Model;
import View.View;

public class Main {

    public static void main(String[] args) {
        // Initialization
        Controller controller = new Controller(new Model(), new View());
        // Run
        controller.processUser();

    }
}
