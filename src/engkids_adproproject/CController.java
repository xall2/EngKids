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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author mone-
 */
public class CController implements Initializable {
    private Label label;
    
     @FXML
    private ImageView img4;
     
     private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private ImageView banana;
    @FXML
    private ImageView cat;
    @FXML
    private ImageView appel;
    @FXML
    private ImageView c_sound;
    
     @FXML
    private Rectangle rec0;

    @FXML
    private Rectangle rec1;

    @FXML
    private Rectangle rec2;

    @FXML
    private Rectangle rec3;

  
  
    @FXML
    private Button next3;
    
    
    /*********************************/
     @FXML
    private ImageView homebutton;
    
     @FXML
    private ImageView emptyStar1;

    @FXML
    private ImageView emptyStar2;

    @FXML
    private ImageView emptyStar3;
    
    private ImageView Star1;
    
    /***********************************************************/
     @FXML
    private Label username;
     
     void setUserName(String name){
     username.setText(name);
     
     set s = new set();
     s.setScore(emptyStar1,emptyStar2,emptyStar3,name);}
    /************************************/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\C.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    } 
     @FXML
    private void play_wrong_sound(MouseEvent event) {
            String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
             

    }
     @FXML
    private void play_wrong_sound2(MouseEvent event) {
            String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
             

    }
    

     @FXML
    private void play_cat_sound(MouseEvent event) throws IOException {
        
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        
            
        FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("E.fxml"));
           Parent sun = loader.load();
           Scene scene = new Scene(sun);
           
           EController controller= loader.getController();
           controller.setUserName(username.getText());
           
           Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
        
          
    }
     @FXML
    private void play_c_sound(MouseEvent event) {
       /*String voice = "C:\\Users\\talla\\Desktop\\EngKids_AdProProject\\src\\media\\lose2.mp3";  مسار تالة الهبلة*/
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\C.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
         
        
          
    }

 @FXML
    private void handleButtonAction(ActionEvent event) {
       /* JavaFXApplication18.mediaPlayer.play();*/
    }
    @FXML
         private void next3(ActionEvent event) throws IOException {
        
    }
         
         
         
         
    
    @FXML
    void rec0En(MouseEvent event) {
        rec0.setWidth(227);
        rec0.setHeight(142);
         
      c_sound.setFitWidth(142);
        c_sound.setFitHeight(165);
        
        
         
        
    }

    @FXML
    void rec0Ex(MouseEvent event) {
        rec0.setWidth(222);
        rec0.setHeight(137);
        
        
        c_sound.setFitWidth(137);
        c_sound.setFitHeight(160);
        
        
         
    }

    @FXML
    void rec1En(MouseEvent event) {
        rec1.setWidth(526);
        rec1.setHeight(135);
        
        
        appel.setFitWidth(387);
        appel.setFitHeight(95);
    }

    @FXML
    void rec1Ex(MouseEvent event) {
       rec1.setWidth(521);
       rec1.setHeight(130);
        
        appel.setFitWidth(382);
        appel.setFitHeight(90);
    }

    @FXML
    void rec2En(MouseEvent event) {
      rec2.setWidth(526);
      rec2.setHeight(135);
      
      cat.setFitWidth(284);
        cat.setFitHeight(107);
      
      
    }

    @FXML
    void rec2Ex(MouseEvent event) {
        rec2.setWidth(521);
        rec2.setHeight(130);
        
        cat.setFitWidth(279);
        cat.setFitHeight(102);
        
       
    }

    @FXML
    void rec3En(MouseEvent event) {
        rec3.setWidth(526);
        rec3.setHeight(135);
        
        banana.setFitWidth(413);
      banana.setFitHeight(144);
        
    }

    @FXML
    void rec3Ex(MouseEvent event) {
        rec3.setWidth(521);
        rec3.setHeight(130);
        
         banana.setFitWidth(408);
        banana.setFitHeight(139);
        }
    
    
    
    /*********************************************************/
     @FXML
    void homebuttonMouseEnter(MouseEvent event) {
        
        homebutton.setFitWidth(75);
        homebutton.setFitHeight(66);
    }
    
      @FXML
    void homebuttonMouseclic(MouseEvent event) throws IOException {
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        
       FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("levels.fxml"));
           Parent sun = loader.load();
           Scene scene = new Scene(sun);
           
           LevelsController controller= loader.getController();
           controller.setUserName(username.getText());
           
           Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
 
    }

    @FXML
    void homebuttonExite(MouseEvent event) {
       
        homebutton.setFitWidth(70);
        homebutton.setFitHeight(64);
    }
/*******************************************************************/
    
    
    
         


}
    
