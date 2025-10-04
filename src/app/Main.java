package app;

import app.controler.Data;
import app.view.PrintData;

// Виправте цей клас
public class Main {

    public static void main(String[] args) {

        Data data = new Data();
        PrintData.getOutput(data.getCustomer());
    }
}
