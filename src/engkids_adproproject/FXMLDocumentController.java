/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engkids_adproproject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * loading controler
 * @author talla
 */
public class FXMLDocumentController implements Initializable {
       

    @FXML
    private ImageView br11;

    @FXML
    private ImageView br3;

    @FXML
    private ImageView br2;

   
    
   
    @FXML
    void KeyEvent(KeyEvent event) throws IOException {
         if(event.getCode()==KeyCode.ENTER){
            
       FXMLLoader loader = new FXMLLoader();
           
           loader.setLocation(getClass().getResource("start.fxml"));
           Parent start = loader.load();
           Scene scene = new Scene(start);
           
           Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();   
       
    }
  }   
       
   
    
    
       
    
    
    public void TranslateTransition(Duration duration, Node node){
    //Instantiating TranslateTransition class   
        TranslateTransition translate = new TranslateTransition();  
          
        //shifting the X coordinate of the centre of the circle by 400   
        translate.setByY(-50);  
          
        //setting the duration for the Translate transition   
        translate.setDuration(duration);  
          
        //setting cycle count for the Translate transition   
        translate.setCycleCount(500);  
          
        //the transition will set to be auto reversed by setting this to true   
        translate.setAutoReverse(true);  
          
        //setting Circle as the node onto which the transition will be applied  
        translate.setNode(node);  
        
        //playing the transition   
        translate.play();  
    
    
    
    }
    
   
    
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\yaaay.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        
       TranslateTransition(Duration.seconds(0.9),br11);
       TranslateTransition(Duration.seconds(1.2),br2);
       TranslateTransition(Duration.seconds(1.6),br3);
      
    }   
    

}
