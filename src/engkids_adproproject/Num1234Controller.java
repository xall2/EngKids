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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.RotateEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author alaas
 */

public class Num1234Controller implements Initializable {

    @FXML
    private ImageView num1;

    @FXML
    private ImageView num7;

    @FXML
    private ImageView num4;

     @FXML
    private Rectangle card7;

    @FXML
    private Rectangle card1;

    @FXML
    private Rectangle card4;
    
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
    
     @FXML
    private Label username;
    String name1;
    
    void setUserName(String name){
     username.setText(name);
     
     set s = new set();
     s.setScore(emptyStar1,emptyStar2,emptyStar3,name);
   /* Session se1 = HibernateUtil1.getSessionFactory().openSession();
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
    /************************************/

   

    @FXML
    void card1En(MouseEvent event) {
        card1.setWidth(158);
         card1.setHeight(196);
         
         num1.setFitWidth(113);
         num1.setFitHeight(154);
    }

    @FXML
    void card1Ex(MouseEvent event) {
         card1.setWidth(148);
         card1.setHeight(186);
         
         num1.setFitWidth(103);
         num1.setFitHeight(144);
    }

    @FXML
    void card4En(MouseEvent event) {
        card4.setWidth(158);
         card4.setHeight(196);
         
         num4.setFitWidth(113);
         num4.setFitHeight(154);
    }

    @FXML
    void card4Ex(MouseEvent event) {
       card4.setWidth(148);
         card4.setHeight(186);
         
         num4.setFitWidth(103);
         num4.setFitHeight(144);
    }

    @FXML
    void card7En(MouseEvent event) {
        card7.setWidth(158);
         card7.setHeight(196);
         
         num7.setFitWidth(113);
         num7.setFitHeight(154);
    }

    @FXML
    void card7Ex(MouseEvent event) {
        card7.setWidth(148);
         card7.setHeight(186);
         
         num7.setFitWidth(103);
         num7.setFitHeight(144);
    }

    @FXML
    void num1Click(MouseEvent event) {
       String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
    
    @FXML
    void num7Click(MouseEvent event) {
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
    
    @FXML
    void num4GoToScene(MouseEvent event) throws IOException {
       /* String voice = "C:\\Users\\talla\\Desktop\\EngKids_AdProProject\\src\\media\\intro3.mp3"; */
       String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

        FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("dino.fxml"));
           Parent sun = loader.load();
           Scene scene = new Scene(sun);
           
           DinoController controller= loader.getController();
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
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\cupcake.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        
    }
    
    
    
    
    
    
    
    @FXML
    void RotateEvent(RotateEvent event) {
       
    }

   
       
    
}
