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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author alaas
 */
public class SheepController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\sheep.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }   
    
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
     @FXML
    private Rectangle rec1;

    @FXML
    private ImageView cat;

    @FXML
    private Rectangle rec2;

    @FXML
    private Rectangle rec3;

    @FXML
    private ImageView zar;

    @FXML
    private ImageView sheep;

    @FXML
    private Rectangle rec4;

    @FXML
    private ImageView dog;
   
     @FXML
    private ImageView homebutton;
    
     @FXML
    private ImageView emptyStar1;

    @FXML
    private ImageView emptyStar2;

    @FXML
    private ImageView emptyStar3;
    
    private ImageView Star1;

    
    @FXML
    private Label username;
    
    void setUserName(String name) throws IOException{
     username.setText(name);
     set s = new set();
     s.setScore(emptyStar1,emptyStar2,emptyStar3,name);
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
    
    
    
     
     @FXML
    private void play_wrong_sound(MouseEvent event) throws IOException {
       String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        /****/
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("monkey.fxml"));
           Parent num1234 = loader.load();
           Scene scene = new Scene(num1234);
           
           MonkeyController controller= loader.getController();
            controller.sucssec=sucssec;
           controller.setUserName(username.getText());/****DB*****/
           /***/
           Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
             

    }
   
    
   int sucssec;   
 @FXML
    private void playyaysound(MouseEvent event) throws IOException {
         String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        
        /****/
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("monkey.fxml"));
           Parent num1234 = loader.load();
           Scene scene = new Scene(num1234);
           
           MonkeyController controller= loader.getController();
           controller.sucssec=sucssec+1;
           System.out.println("sheep: "+sucssec);
           controller.setUserName(username.getText());
           /***/
           Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
   
    
    
    
    void scaleEn(Rectangle rec){
      rec.setWidth(228);
      rec.setHeight(305);
    
    }
    
    void scaleEx(Rectangle rec){
      rec.setWidth(222);
      rec.setHeight(299);
    
    }
    
    
    void scaleImEn(ImageView img){
     img.setFitWidth(img.getFitWidth()+5);
     img.setFitHeight(img.getFitHeight()+5);
    
    }
    
    
    @FXML
    void rec1En(MouseEvent event) {
          scaleEn(rec1);
          scaleImEn(cat);
    }

    @FXML
    void rec1Ex(MouseEvent event) {
       scaleEx(rec1);
       
       cat.setFitWidth(186);
       cat.setFitHeight(230);
       
       
       
    }

    @FXML
    void rec2En(MouseEvent event) {
        scaleEn(rec2);
        scaleImEn(zar);
        
    }

    @FXML
    void rec2Ex(MouseEvent event) {
       scaleEx(rec2);
       
       zar.setFitWidth(241);
       zar.setFitHeight(281);
    }

    @FXML
    void rec3En(MouseEvent event) {
        scaleEn(rec3);
        
        scaleImEn(sheep);

    }

    @FXML
    void rec3Ex(MouseEvent event) {
        scaleEx(rec3);
        
       sheep.setFitWidth(222);
       sheep.setFitHeight(219);

    }

    @FXML
    void rec4En(MouseEvent event) {
        scaleEn(rec4);
        scaleImEn(dog);

    }

    @FXML
    void rec4Ex(MouseEvent event) {
        scaleEx(rec4);
        
         dog.setFitWidth(207);
        dog.setFitHeight(195);
        
       

    }
    
}
