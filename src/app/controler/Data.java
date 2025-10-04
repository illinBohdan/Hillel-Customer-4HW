package app.controler;

import app.model.Customer;

public class Data {

    private Customer customer;

    public Data() {
         this.customer = initialCustomer(getData());
    }


    public static String[] getData() {
        return new String[]{"Tom", "555 123-8596"};
    }

    public static Customer initialCustomer(String[] data) {

        return new Customer(data[0], data[1]);
    }

    public Customer getCustomer() {
        return customer;
    }
}
