/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engkids_adproproject;

import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author talla
 */
public class StartController {
 
    @FXML
    private Button login;

    @FXML
    private Button start;

 

    @FXML
    void loginenter(MouseEvent event) {
        login.setMinSize(265, 85);
        login.setMaxSize(265,85);

    }

    @FXML
    void loginexite(MouseEvent event) {
       login.setMinSize(257, 78);
        login.setMaxSize(257,78);
    }
    
     @FXML
    void startenter(MouseEvent event) {
        start.setMinSize(265, 85);
        start.setMaxSize(265,85);

    }

    @FXML
    void startexite(MouseEvent event) {
       start.setMinSize(257, 78);
        start.setMaxSize(257,78);
    }
    
    //go to login page 
     @FXML
    void goTologin(ActionEvent event) throws IOException {
         String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
           Parent loginpage = FXMLLoader.load(getClass().getResource("login.fxml"));
           Scene scene = new Scene(loginpage);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
 
    }
    
    //go to signup page 
     @FXML
    void goTosignup(ActionEvent event) throws IOException {
         String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
           Parent signuppage = FXMLLoader.load(getClass().getResource("signup.fxml"));
           Scene scene = new Scene(signuppage);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
 
    }
    
}
