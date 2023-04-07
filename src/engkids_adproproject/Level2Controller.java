/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engkids_adproproject;
import engkids_adproproject.set;
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
public class Level2Controller {
        @FXML
    private Button clothesCard;

   
     @FXML
    private ImageView emptyStar1;

    @FXML
    private ImageView emptyStar2;

    @FXML
    private ImageView emptyStar3;
    
    private ImageView Star1;

    

    @FXML
    private Label username;
    
    void setUserName(String name){
     username.setText(name);
     
     set s = new set();
      s.setScore(emptyStar1,emptyStar2,emptyStar3,name);
    }

    @FXML
    private ImageView homebutton;
    
    //****************************************
    @FXML
    private ImageView imgL;

    @FXML
    private ImageView bott_L;
    
    @FXML
    private Rectangle rec;
    
    @FXML
    private Rectangle rec2;

    @FXML
    private ImageView imgL2;

    @FXML
    private ImageView bott_L2;
    
    //------------------- rec1----------------------
    @FXML
    void recEn(MouseEvent event) {
     String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\moveabove.mp3"; 
     Media sound = new Media(new File(voice).toURI().toString());
     MediaPlayer mediaPlayer = new MediaPlayer(sound);
     mediaPlayer.play();   
        
     rec.setWidth(298);
     rec.setHeight(369);

     imgL.setFitHeight(208);
     imgL.setFitWidth(228);
     
     bott_L.setFitHeight(72);
     bott_L.setFitWidth(208);
    }
    
    @FXML
    void imgLEN(MouseEvent event) {
     rec.setWidth(298);
     rec.setHeight(369);

     imgL.setFitHeight(208);
     imgL.setFitWidth(228);
     
     bott_L.setFitHeight(72);
     bott_L.setFitWidth(208);
    }
    @FXML
    void recEx(MouseEvent event) {
     rec.setWidth(290);
     rec.setHeight(361);
     
     imgL.setFitHeight(201);
     imgL.setFitWidth(220);
     
     bott_L.setFitHeight(64);
     bott_L.setFitWidth(200);
    }
    
    @FXML
    void bottEN(MouseEvent event) {
     rec.setWidth(298);
     rec.setHeight(369);

     imgL.setFitHeight(208);
     imgL.setFitWidth(228);
     
     bott_L.setFitHeight(72);
     bott_L.setFitWidth(208);
     }
    
    @FXML
    void imgLEX(MouseEvent event) {
     rec.setWidth(290);
     rec.setHeight(361);
     
     imgL.setFitHeight(201);
     imgL.setFitWidth(220);
     
     bott_L.setFitHeight(64);
     bott_L.setFitWidth(200);
    }
    
    

    @FXML
    void bottEX(MouseEvent event) {
     rec.setWidth(290);
     rec.setHeight(361);
     
     imgL.setFitHeight(201);
     imgL.setFitWidth(220);
     
     bott_L.setFitHeight(64);
     bott_L.setFitWidth(200);
    }
    
    

    @FXML
    void goToABC(MouseEvent event) throws IOException{
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("clothes.fxml"));
        Parent levels = loader.load();
        Scene scene = new Scene(levels);

           
        ClothesController controller = loader.getController();
        
        
        controller.setUserName(username.getText());
        
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
    

    @FXML
    void clothesCardMouseEnter(MouseEvent event) {
        clothesCard.setMinSize(405, 209);
        clothesCard.setMaxSize(405,209);

    }

    @FXML
    void clothesCardMouseExite(MouseEvent event) {
        clothesCard.setMinSize(398, 203);
        clothesCard.setMaxSize(398,203);

    }

    
    //go to clothes page 
     @FXML
    void goToClothesGame(ActionEvent event) throws IOException {
           Parent ClothesGame = FXMLLoader.load(getClass().getResource("clothes.fxml"));
           Scene scene = new Scene(ClothesGame);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
 
    }
 
    
}
