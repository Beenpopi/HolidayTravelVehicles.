import java.util.ArrayList;

public class Salesperson {
    private int salespersonID;
    private String name;

    private ArrayList<Invoice> invoices;
    private ArrayList<Vehicle> vehicles;

    public Salesperson(int salespersonID, String name) {
        this.salespersonID = salespersonID;
        this.name = name;
    }

}
    