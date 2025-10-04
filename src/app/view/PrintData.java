package app.view;

import app.model.Customer;

public class PrintData {

    public static void getOutput(Customer customer) {
        String output = "Customer: " + customer.getName() +
                ", phone " + customer.getPhone();

        System.out.println(output);
    }
}
