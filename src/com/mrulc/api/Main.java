package com.mrulc.api;

import com.mrulc.api.view.FxController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main  extends Application {

    @Override
    public void start(Stage stage1) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/HardwareGrid.fxml"));
        stage1.setTitle("Network Diagram");
        stage1.setScene(new Scene(root, 1600, 850));
        stage1.getIcons().add(new Image(getClass().getResourceAsStream("logo.jpg")));
        stage1.show();
    }


    public static void main(String[] args) throws Exception{
        /**********************************
         |      ACTIVATES GUI           |
         *********************************/

        Create_File.createFile();
        Read_File.readFile();
        launch(args);

    }





}
