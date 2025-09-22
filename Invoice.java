import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private int invoiceID;
    private Date date;
    private double finalPrice;
    private double tax;
    private double licenseFee;
    private String customerSignature;
    private double tradeinAllowance;
    private ArrayList<Option> option;
    public Vehicle vehicle;
    public Customer customer;
    public Salesperson salesperson;
    private ArrayList<TradeInVehicle> tradeInVehicles;

    public Invoice(int invoiceID, Date date, double finalPrice, double tax, double licenseFee, String customerSignature, double tradeinAllowance, Vehicle vehicle, Customer customer, Salesperson salesperson, TradeInVehicle tradeInVehicle) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
        this.customerSignature = customerSignature;
        this.tradeinAllowance = tradeinAllowance;
        this.vehicle = vehicle;
        this.customer = customer;
        this.salesperson = salesperson;
        this.tradeInVehicles = tradeInVehicles;
    }



}
