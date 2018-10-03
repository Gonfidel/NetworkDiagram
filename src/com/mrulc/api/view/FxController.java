package com.mrulc.api.view;

import com.mrulc.api.Create_File;
import com.mrulc.api.Hardware;
import com.mrulc.api.HardwareList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class FxController implements Initializable {

    @FXML
    //TABLE AND COLUMNS
    public TableView<Hardware> table;
    public TableColumn<Hardware, String> hwCol;
    public TableColumn<Hardware, String> ipCol;
    public TableColumn<Hardware, String> subnetCol;
    public TableColumn<Hardware, String> typeCol;

    //TEXTFIELDS AND COMBOBOX
    public TextField nameTextField = new TextField();
    public TextField ipTextField = new TextField();
    public TextField subnetTextField = new TextField();
    public ComboBox typeComboBox = new ComboBox();

    //BUTTONS
    public Button addButton = new Button();
    public Button delButton = new Button();
    public Button saveButton = new Button();

    //LABELS
    public Label TerminalLabel = new Label();
    public Label KitchenScreenLabel = new Label();
    public Label ReceiptPrinterLabel = new Label();
    public Label VerifoneLabel = new Label();







    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        hwCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
        ipCol.setCellValueFactory(new PropertyValueFactory<>("Ip"));
        subnetCol.setCellValueFactory(new PropertyValueFactory<>("SubNet"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        table.setItems(getData());

        ImageView terminalImage = new ImageView("/com/mrulc/api/images/TERMINAL.png");
        ImageView kitchenScreenImage = new ImageView("/com/mrulc/api/images/KITCHEN_SCREEN.png");
        ImageView receiptPrinterImage = new ImageView("/com/mrulc/api/images/R_PRINTER.png");
        ImageView verifoneImage = new ImageView("/com/mrulc/api/images/VERIFONE.png");

        TerminalLabel.setText("");
        KitchenScreenLabel.setText("");
        ReceiptPrinterLabel.setText("");
        VerifoneLabel.setText("");

        TerminalLabel.setGraphic(terminalImage);
        KitchenScreenLabel.setGraphic(kitchenScreenImage);
        ReceiptPrinterLabel.setGraphic(receiptPrinterImage);
        VerifoneLabel.setGraphic(verifoneImage);



    }

    /**
     * CONFIGURE OBSERVABLE TABLE
     */
    public ObservableList<Hardware> getData() {
        ObservableList<Hardware> data = FXCollections.observableArrayList(HardwareList.hardwarelist);
        System.out.println("Added hardware to data");
        return data;
    }

    /**
     *
     * @param actionEvent
     *
     */
    public void buttonAdd(ActionEvent actionEvent) {
        Hardware hardware;
        boolean isNotIpAddress;
        int numDots=0;
        try {
            InetAddress inet = InetAddress.getByName(ipTextField.getText());
            isNotIpAddress = false;
        } catch (Exception e) {
            System.out.println(e);
            isNotIpAddress = true;
        }
        if(nameTextField.getText().trim().chars().anyMatch(Character::isWhitespace)) {
            JOptionPane.showMessageDialog(null, "Please enter a hardware name without spaces", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Hardware name cannot contain spaces");
        }else if (isNotIpAddress) {
            JOptionPane.showMessageDialog(null, "Please enter a valid IP address", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Enter a valid Ip address");
        }else if(typeComboBox.getSelectionModel().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please select a hardware type", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (nameTextField.getText().trim().isEmpty() == false && ipTextField.getText().trim().isEmpty() == false && subnetTextField.getText().trim().isEmpty() == false && typeComboBox.getSelectionModel().getSelectedItem().toString() != "Hardware Type") {
            hardware = new Hardware(nameTextField.getText().trim(), ipTextField.getText().trim(), subnetTextField.getText().trim(), typeComboBox.getSelectionModel().getSelectedItem().toString());
            HardwareList.hardwarelist.add(hardware);
            nameTextField.clear();
            ipTextField.clear();
            subnetTextField.clear();
            typeComboBox.getSelectionModel().clearSelection();
            table.getItems().add(hardware);
        }
        HardwareList.resetSubLists();
        HardwareList.subCatagorize();
    }

    public void buttonDel(ActionEvent actionEvent){
        String itemName = table.getSelectionModel().getSelectedItem().getName();
        table.getItems().removeAll(table.getSelectionModel().getSelectedItems());

        for(Hardware h:HardwareList.hardwarelist){
            if(itemName==h.getName()){
                HardwareList.hardwarelist.remove(h);
            }
        }
        HardwareList.resetSubLists();
        HardwareList.subCatagorize();
    }


    public void buttonSave(ActionEvent actionEvent) {
        try {
            Create_File.saveConfig();
            JOptionPane.showMessageDialog(null, "Configuration saved!", "Confirmation", 1);
            System.out.println(HardwareList.hardwarelist);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occured!", "Error", 0);
        }
    }
}






