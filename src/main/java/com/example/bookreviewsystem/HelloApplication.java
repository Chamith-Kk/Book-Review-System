package com.example.bookreviewsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        try{

            Parent root = FXMLLoader.load(getClass().getResource("login-main.fxml"));
            Scene scene = new Scene(root,400,400);
            stage.setScene(scene);
            stage.setResizable(false);



        }catch (Exception E){
            E.printStackTrace();
        }



    }




    public static void main(String[] args) {
        launch();
    }
}