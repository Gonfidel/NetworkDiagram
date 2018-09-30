package com.mrulc.api.view;

import com.mrulc.api.Hardware;
import com.mrulc.api.HardwareList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class FxController implements Initializable {

    @FXML
    public TableView<Hardware> table;
    public TableColumn<Hardware, String> hwCol;
    public TableColumn<Hardware, String> ipCol;
    public TableColumn<Hardware, String> subnetCol;
    public TextField nameTextField = new TextField();
    public TextField ipTextField = new TextField();
    public TextField subnetTextField = new TextField();
    public Button addButton = new Button();
    public Button delButton = new Button();




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //hwCol = new TableColumn<>("hwCol");
        //ipCol = new TableColumn<>("ipCol");
        //subnetCol = new TableColumn<>("subnetCol");

        hwCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
        ipCol.setCellValueFactory(new PropertyValueFactory<>("Ip"));
        subnetCol.setCellValueFactory(new PropertyValueFactory<>("SubNet"));



        table.setItems(getData());
        //System.out.println(getData());


    }


    /**
     *  CONFIGURE OBSERVABLE TABLE
     */
    public ObservableList<Hardware> getData() {
        ObservableList<Hardware> data = FXCollections.observableArrayList(HardwareList.hardwarelist);
        System.out.println("Added hardware to data");
        return data;
    }


    public void buttonAdd(ActionEvent actionEvent) {
        Hardware hardware;
        if (nameTextField.getText().trim().isEmpty() == false) {
            if (ipTextField.getText().trim().isEmpty() == false) {
                if (subnetTextField.getText().trim().isEmpty() == false) {
                    hardware = new Hardware(nameTextField.getText().trim(), ipTextField.getText().trim(), subnetTextField.getText().trim());
                    HardwareList.hardwarelist.add(hardware);
                    nameTextField.clear();
                    ipTextField.clear();
                    subnetTextField.clear();
                    table.getItems().add(hardware);
                }
            }
        }
    }

    public void buttonDel(ActionEvent actionEvent) {
        table.getItems().removeAll(table.getSelectionModel().getSelectedItems());

    }

}





