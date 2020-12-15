package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    Tab cashier;

    @FXML
    Tab customer;

    @FXML
    Tab supplier;

    @FXML
    Tab inventory;

    @FXML
    Tab finance;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            AnchorPane anch1 = FXMLLoader.load(getClass().getResource("Cashier.fxml"));
            cashier.setContent(anch1);
        } catch (IOException ex) {
            System.out.println("File not found!");
        }

        try {
            AnchorPane anch2 = FXMLLoader.load(getClass().getResource("Customer.fxml"));
            customer.setContent(anch2);
        } catch (IOException ex) {
            System.out.println("File not found!");
        }

        try {
            AnchorPane anch3 = FXMLLoader.load(getClass().getResource("Supplier.fxml"));
            supplier.setContent(anch3);
        } catch (IOException ex) {
            System.out.println("File not found!");
        }

        try {
            AnchorPane anch4 = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
            inventory.setContent(anch4);
        } catch (IOException ex) {
            System.out.println("File not found!");
        }
        try {
            AnchorPane anch5 = FXMLLoader.load(getClass().getResource("Finance.fxml"));
            finance.setContent(anch5);
        } catch (IOException ex) {
            System.out.println("File not found!");
        }
    }
}
