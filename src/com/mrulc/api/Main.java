package com.mrulc.api;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
        stage1.show();
    }


    public static void main(String[] args) throws Exception{
        /**********************************
         |      ACTIVATES GUI           |
         *********************************/


        CreateFile.createFile();
        Read_File read = new Read_File();
        read.readFile();
        launch(args);

    }





}
