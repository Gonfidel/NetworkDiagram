package com.mrulc.api.view;

import com.mrulc.api.Hardware;
import com.mrulc.api.HardwareList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class FxController implements Initializable {

    @FXML
    public TableView<Hardware> table;
    @FXML
    public TableColumn<Hardware, String> hwCol;
    @FXML
    public TableColumn<Hardware, String> ipCol;
    @FXML
    public TableColumn<Hardware, String> subnetCol;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        hwCol = new TableColumn<>("hwCol");
        ipCol = new TableColumn<>("ipCol");
        subnetCol = new TableColumn<>("subnetCol");

        hwCol.setCellValueFactory(new PropertyValueFactory<>("hwCol"));
        ipCol.setCellValueFactory(new PropertyValueFactory<>("ipCol"));
        subnetCol.setCellValueFactory(new PropertyValueFactory<>("subnetCol"));

        /**
         *  CONFIGURE OBSERVABLE TABLE
         */
        ObservableList<Hardware> data;
        try {
            data = FXCollections.observableArrayList(HardwareList.hardwarelist);
            System.out.println("Added hardware to data");
        } catch (Exception e) {
            data = FXCollections.observableArrayList();
            System.out.println(e);
        }


        table.setItems(data);
        System.out.println(data);


    }


}





