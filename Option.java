import java.util.ArrayList;

public class Option {
    private String optionCode;
    private String description;
    private double price;
    private Invoice invoice;
    private Customer customer;

    public Option(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

}
