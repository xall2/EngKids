/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engkids_adproproject;
import  engkids_adproproject.set;
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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author talla
 */
public class Level3Controller {
    @FXML
    private ImageView homebutton;
       @FXML
    private Button AnimalsCard;
    
    
     //****************************************
    @FXML
    private ImageView imgL;

    @FXML
    private ImageView bott_L;
    
    @FXML
    private ImageView bott_L1;
    
     @FXML
    private ImageView bas;
    
    @FXML
    private Rectangle rec;
    
    @FXML
    private Rectangle rec1;

    @FXML
    private ImageView imgL2;
    
     @FXML
    private ImageView emptyStar1;

    @FXML
    private ImageView emptyStar2;

    @FXML
    private ImageView emptyStar3;

    
    
    @FXML
    private Label username;
    
    void setUserName(String name){
     username.setText(name);
     
     set s = new set();
      s.setScore(emptyStar1,emptyStar2,emptyStar3,name);
    }
    
    //------------------- rec1----------------------
    @FXML
    void recEn(MouseEvent event) {
     String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\moveabove.mp3"; 
     Media sound = new Media(new File(voice).toURI().toString());
     MediaPlayer mediaPlayer = new MediaPlayer(sound);
     mediaPlayer.play();   
        
     rec.setWidth(270);
     rec.setHeight(334);

     imgL.setFitHeight(227);
     imgL.setFitWidth(246);
     
     bott_L.setFitHeight(72);
     bott_L.setFitWidth(208);
    }
    
    @FXML
    void imgLEN(MouseEvent event) {
     rec.setWidth(270);
     rec.setHeight(334);

     imgL.setFitHeight(227);
     imgL.setFitWidth(246);
     
     bott_L.setFitHeight(72);
     bott_L.setFitWidth(208);
    }
    @FXML
    void recEx(MouseEvent event) {
     rec.setWidth(262);
     rec.setHeight(326);
     
     imgL.setFitHeight(218);
     imgL.setFitWidth(238);
     
     bott_L.setFitHeight(64);
     bott_L.setFitWidth(200);
    }
    
    @FXML
    void bottEN(MouseEvent event) {
    rec.setWidth(270);
     rec.setHeight(334);

     imgL.setFitHeight(227);
     imgL.setFitWidth(246);
     
     bott_L.setFitHeight(72);
     bott_L.setFitWidth(208);
     }
    
    @FXML
    void imgLEX(MouseEvent event) {
     rec.setWidth(262);
     rec.setHeight(326);
     
     imgL.setFitHeight(218);
     imgL.setFitWidth(238);
     
     bott_L.setFitHeight(64);
     bott_L.setFitWidth(200);
    }
    
    

    @FXML
    void bottEX(MouseEvent event) {
    rec.setWidth(262);
     rec.setHeight(326);
     
     imgL.setFitHeight(218);
     imgL.setFitWidth(238);
     
     bott_L.setFitHeight(64);
     bott_L.setFitWidth(200);
    }
    
    @FXML
    void goToABC(MouseEvent event) throws IOException{
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        /****/
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("elev.fxml"));
           Parent pen = loader.load();
           Scene scene = new Scene(pen);
           
           ElevController controller= loader.getController();
           controller.setUserName(username.getText());
           /***/
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
   //*******************************************
    @FXML
    void rec1En(MouseEvent event) {
     String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\moveabove.mp3"; 
     Media sound = new Media(new File(voice).toURI().toString());
     MediaPlayer mediaPlayer = new MediaPlayer(sound);
     mediaPlayer.play();   
        
     rec1.setWidth(270);
     rec1.setHeight(334);

      bas.setFitHeight(235);
     bas.setFitWidth(205);
     
     bott_L1.setFitHeight(72);
     bott_L1.setFitWidth(208);
    }
    
    @FXML
    void basEn(MouseEvent event) {
    rec1.setWidth(270);
     rec1.setHeight(334);

     bas.setFitHeight(235);
     bas.setFitWidth(205);
     
     bott_L1.setFitHeight(72);
     bott_L1.setFitWidth(208);
    }
    @FXML
    void rec1Ex(MouseEvent event) {
     rec1.setWidth(262);
     rec1.setHeight(326);
     
    bas.setFitHeight(230);
     bas.setFitWidth(200);
     
     bott_L1.setFitHeight(64);
     bott_L1.setFitWidth(200);
    }
    
    @FXML
    void bott1EN(MouseEvent event) {
     rec1.setWidth(270);
     rec1.setHeight(334);

      bas.setFitHeight(235);
     bas.setFitWidth(205);
     
     bott_L1.setFitHeight(72);
     bott_L1.setFitWidth(208);
     }
    
    @FXML
    void basEx(MouseEvent event) {
     rec1.setWidth(262);
     rec1.setHeight(326);
     
     bas.setFitHeight(230);
     bas.setFitWidth(200);
     
     bott_L1.setFitHeight(64);
     bott_L1.setFitWidth(200);
    }
    
    

    @FXML
    void bott1EX(MouseEvent event) {
     rec1.setWidth(262);
     rec1.setHeight(326);
     
     bas.setFitHeight(230);
     bas.setFitWidth(200);
     
     bott_L1.setFitHeight(64);
     bott_L1.setFitWidth(200);
    }
    
            
    @FXML
    void goToSchool(MouseEvent event) throws IOException{
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
       /****/
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("pencil.fxml"));
           Parent pen = loader.load();
           Scene scene = new Scene(pen);
           
           PencilController controller= loader.getController();
           controller.setUserName(username.getText());
           /***/
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
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
    
      //go to Animals page 
     @FXML
    void goToAnimalsGame(ActionEvent event) throws IOException {
           Parent AnimalsGame = FXMLLoader.load(getClass().getResource("animalsGame.fxml"));
           Scene scene = new Scene(AnimalsGame);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
 
    }
    
    
}
