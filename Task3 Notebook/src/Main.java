
public class Main {

    public static void main(String[] args) {
        // Initialization
        Controller controller = new Controller(new Model(new Notebook()), new View());
        // Run
        controller.processUser();

    }
}