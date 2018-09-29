package com.mrulc.api;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.UnknownHostException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/HardwareGrid.fxml"));
        primaryStage.setTitle("Network Diagram");
        primaryStage.setScene(new Scene(root, 1600, 850));
        primaryStage.show();
    }


    public static void main(String[] args){

        /**********************************
         |      ACTIVATES GUI           |
         *********************************/
        launch(args);
    }
}
