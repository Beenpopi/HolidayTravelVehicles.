import java.util.*;

public class Customer {   
    private int customerID;
    private String name;
    private String address;
    private String phone;
    private ArrayList<TradeInVehicle> tradeInVehicles;
    private ArrayList<Option> option;

    public Customer(int customerID, String name, String address, String phone) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}

