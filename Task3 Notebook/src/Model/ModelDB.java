package Model;

public class ModelDB {
    private final Model model;

    public ModelDB(Model model) {
        this.model = model;
    }

    public void addDB() {
        model.setUsers("John", "Pipa",  "Pipovich", "pupka1234456");
        model.setUsers("Jane", "Duglas",  "Mokovina", "tuturu09");
    }
}
