package com.mrulc.api.view;

import com.mrulc.api.Hardware;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

public class FxController implements Initializable{

    @FXML
    private Label label;

    @FXML
    private TableView myTable;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Button clicked");
        label.setText("Button clicked");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        TableColumn hardware = new TableColumn("Hardware");
        TableColumn ipAddress = new TableColumn("IP Address");
        TableColumn subnet = new TableColumn("Subnet");



    }

}




