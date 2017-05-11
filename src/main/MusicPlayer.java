/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;



import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;





public class MusicPlayer extends Application {
    
    
    
    
    
    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane borderPane = (BorderPane) FXMLLoader.load(getClass().getResource("telaPrincipal.fxml"));
            Scene scene = new Scene(borderPane);
            
            
            primaryStage.setTitle("MusicPlayer");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());  
        }
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
