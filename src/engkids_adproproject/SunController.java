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
public class SunController implements Initializable {
    @FXML
    private Rectangle card2;
    
    @FXML
    private Rectangle card5;
    
    @FXML
    private Rectangle card9;
    
    @FXML
    private ImageView num2;
    

    @FXML
    private ImageView num9;

    @FXML
    private ImageView num5;
    
    /*********************************/
    @FXML
    private ImageView homebutton;
    
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
    // s.setScore(emptyStar1,emptyStar2,emptyStar3,name);
     /*
     Session se1 = HibernateUtil1.getSessionFactory().openSession();
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
    void num5GoToScene(MouseEvent event) throws IOException {
       /* String voice = "C:\\Users\\talla\\Desktop\\EngKids_AdProProject\\src\\media\\intro3.mp3"; */
       String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("iceCreem.fxml"));
           Parent dino = loader.load();
           Scene scene = new Scene(dino);
           
           IceCreemController controller= loader.getController();
           controller.setUserName(username.getText());
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
     @FXML
    void card2En(MouseEvent event) {
         card2.setWidth(158);
         card2.setHeight(196);
         
         num2.setFitWidth(125);
         num2.setFitHeight(154);
    }

    @FXML
    void card2Ex(MouseEvent event) {
         card2.setWidth(148);
         card2.setHeight(186);
         
         num2.setFitWidth(115);
         num2.setFitHeight(144);
    }

    @FXML
    void num2Click(MouseEvent event) {
      /* String voice = "C:\\Users\\talla\\Desktop\\EngKids_AdProProject\\src\\media\\lose2.mp3"; */
       String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
    
    
    @FXML
    void card5En(MouseEvent event) {
         card5.setWidth(158);
         card5.setHeight(196);
         
         num5.setFitWidth(120);
         num5.setFitHeight(154);
    }

    @FXML
    void card5Ex(MouseEvent event) {
       card5.setWidth(148);
         card5.setHeight(186);
         
         num5.setFitWidth(110);
         num5.setFitHeight(144);
    }

     @FXML
    void card9En(MouseEvent event) {
         card9.setWidth(158);
         card9.setHeight(196);
         
         num9.setFitWidth(113);
         num9.setFitHeight(154);
    }

    @FXML
    void card9Ex(MouseEvent event) {
         card9.setWidth(148);
         card9.setHeight(186);
         
         num9.setFitWidth(103);
         num9.setFitHeight(144);
    }
    
    @FXML
    void num9Click(MouseEvent event) {
       /* String voice = "C:\\Users\\talla\\Desktop\\EngKids_AdProProject\\src\\media\\lose2.mp3"; */
       String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
    
    
    
    @FXML
    void RotateEvent(RotateEvent event) {
       
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\sun.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        
         
    }  
    
    
    
   
    
    
    
    
    
}
