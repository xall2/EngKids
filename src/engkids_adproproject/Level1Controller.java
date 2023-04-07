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
import java.util.List;
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
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author talla
 */
public class Level1Controller implements Initializable {
    
    @FXML
    private Button AlphaCard;

    @FXML
    private Button numCard;
    
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
    
    void setUserName(String name){
     username.setText(name);
    
      set s = new set();
      s.setScore(emptyStar1,emptyStar2,emptyStar3,name);
     
   /*  Session se1 = HibernateUtil1.getSessionFactory().openSession();
         //1 retrave from DB
           se1.beginTransaction();
           List<score> sList = null;
           String queryStr = "from score";
           Query query = se1.createQuery(queryStr);
           sList = query.list();
           se1.getTransaction().commit();
         
           for(score i:sList){ System.out.println("level_1="+(i.getLevel()==1));
           if(i.getUsername().equals(name)){
           if(i.getLevel()==1)emptyStar1.setVisible(true); 
           if(i.getLevel()==2)emptyStar2.setVisible(true); 
           if(i.getLevel()==3)emptyStar3.setVisible(true); 
           }
      }*/

   
    }
    
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
        
     rec.setWidth(270);
     rec.setHeight(334);

     imgL.setFitHeight(225);
     imgL.setFitWidth(246);
     
     bott_L.setFitHeight(72);
     bott_L.setFitWidth(208);
    }
    
    @FXML
    void imgLEN(MouseEvent event) {
     rec.setWidth(270);
     rec.setHeight(334);

     imgL.setFitHeight(225);
     imgL.setFitWidth(246);
     
     bott_L.setFitHeight(72);
     bott_L.setFitWidth(208);
    }
    @FXML
    void recEx(MouseEvent event) {
     rec.setWidth(262);
     rec.setHeight(326);
     
     imgL.setFitHeight(217);
     imgL.setFitWidth(238);
     
     bott_L.setFitHeight(64);
     bott_L.setFitWidth(200);
    }
    
    @FXML
    void bottEN(MouseEvent event) {
     rec.setWidth(270);
     rec.setHeight(334);

     imgL.setFitHeight(225);
     imgL.setFitWidth(246);
     
     bott_L.setFitHeight(72);
     bott_L.setFitWidth(208);
     }
    
    @FXML
    void imgLEX(MouseEvent event) {
     rec.setWidth(262);
     rec.setHeight(326);
     
     imgL.setFitHeight(217);
     imgL.setFitWidth(238);
     
     bott_L.setFitHeight(64);
     bott_L.setFitWidth(200);
    }
    
    

    @FXML
    void bottEX(MouseEvent event) {
     rec.setWidth(262);
     rec.setHeight(326);
     
     imgL.setFitHeight(217);
     imgL.setFitWidth(238);
     
     bott_L.setFitHeight(64);
     bott_L.setFitWidth(200);
    }
    
   //------------------- rec2----------------------
    @FXML
    void recEn2(MouseEvent event) {
     String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\moveabove.mp3"; 
     Media sound = new Media(new File(voice).toURI().toString());
     MediaPlayer mediaPlayer = new MediaPlayer(sound);
     mediaPlayer.play();
     
     
     
     rec2.setWidth(270);
     rec2.setHeight(334);

     imgL2.setFitHeight(211);
     imgL2.setFitWidth(235);
     
     bott_L2.setFitHeight(72);
     bott_L2.setFitWidth(208);
    }
    
    @FXML
    void imgLEN2(MouseEvent event) {
     rec2.setWidth(270);
     rec2.setHeight(334);

     imgL2.setFitHeight(211);
     imgL2.setFitWidth(235);
     
     bott_L2.setFitHeight(72);
     bott_L2.setFitWidth(208);
    }
    
    
     @FXML
    void bottEN2(MouseEvent event) {
     rec2.setWidth(270);
     rec2.setHeight(334);

     imgL2.setFitHeight(211);
     imgL2.setFitWidth(235);
     
     bott_L2.setFitHeight(72);
     bott_L2.setFitWidth(208);
    }
    
    @FXML
    void bottEX2(MouseEvent event) {
     rec2.setWidth(262);
     rec2.setHeight(326);
     
     imgL2.setFitHeight(203);
     imgL2.setFitWidth(227);
     
     bott_L2.setFitHeight(64);
     bott_L2.setFitWidth(200);
    }
    
    @FXML
    void imgLEX2(MouseEvent event) {
     rec2.setWidth(262);
     rec2.setHeight(326);
     
     imgL2.setFitHeight(203);
     imgL2.setFitWidth(227);
     
     bott_L2.setFitHeight(64);
     bott_L2.setFitWidth(200);
    }
    
    @FXML
    void recEx2(MouseEvent event) {
    rec2.setWidth(262);
     rec2.setHeight(326);
     
     imgL2.setFitHeight(203);
     imgL2.setFitWidth(227);
     
     bott_L2.setFitHeight(64);
     bott_L2.setFitWidth(200);
    }
    
    @FXML
    void goTo123(MouseEvent event) throws IOException {
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
           /****/
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("num1234.fxml"));
           Parent num1234 = loader.load();
           Scene scene = new Scene(num1234);
           
           Num1234Controller controller= loader.getController();
           controller.setUserName(username.getText());
           /***/
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void goToABC(MouseEvent event) throws IOException{
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
       /****/
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("B.fxml"));
           Parent num1234 = loader.load();
           Scene scene = new Scene(num1234);
           
           BController1 controller= loader.getController();
           controller.setUserName(username.getText());
           /***/
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
   //*******************************************
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
    }
    
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
    

    @FXML
    void AlphaCardMouseEnter(MouseEvent event) {
        AlphaCard.setMinSize(405, 209);
        AlphaCard.setMaxSize(405,209);

    }

    @FXML
    void AlphaCardMouseExite(MouseEvent event) {
        AlphaCard.setMinSize(398, 203);
        AlphaCard.setMaxSize(398,203);

    }

    @FXML
    void numcardMouseEnter(MouseEvent event) {
        numCard.setMinSize(405, 209);
        numCard.setMaxSize(405,209);
    }

    @FXML
    void numcardMouseExite(MouseEvent event) {
        numCard.setMinSize(398, 203);
        numCard.setMaxSize(398,203);

    }
    
    //go to ABCD page 
     @FXML
    void goToABCDAgame(ActionEvent event) throws IOException {
        
        
           Parent goToleval = FXMLLoader.load(getClass().getResource("B.fxml"));
           Scene scene = new Scene(goToleval);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
 
    }
    
       //go to number page 
     @FXML
    void goToNumGame(ActionEvent event) throws IOException {
           Parent NumGame = FXMLLoader.load(getClass().getResource("num1234.fxml"));
           Scene scene = new Scene(NumGame);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
 
    }
}
