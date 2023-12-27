package com.example.inserttabledata.controller;

import com.example.inserttabledata.tm.Customer;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TableColumn<Customer,String> tblName;

    @FXML
    private TableColumn<Customer,Integer> tblAge;

    @FXML
    private TableColumn<Customer,Integer> tblNumber;

    @FXML
    private TableView<Customer> tblViewData;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtMobileNo;

    @FXML
    private TextField txtName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        tblName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tblAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        tblNumber.setCellValueFactory(new PropertyValueFactory<>("number"));

    }

    @FXML
    void btnSubmitOnAction(ActionEvent event) {

        Customer customer = new Customer(
                txtName.getText(),
                Integer.parseInt(txtAge.getText()),
                Integer.parseInt(txtMobileNo.getText())

        );



        ObservableList<Customer> items = tblViewData.getItems();
        items.add(customer);
        tblViewData.setItems(items);

    }

    @FXML
    void btnRemoveOnAction(ActionEvent event) {
        int selectedID = tblViewData.getSelectionModel().getSelectedIndex();
        tblViewData.getItems().remove(selectedID);

    }
}