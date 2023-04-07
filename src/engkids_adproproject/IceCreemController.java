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
public class IceCreemController implements Initializable {

      @FXML
    private Rectangle card3;

    @FXML
    private Rectangle card1;

    @FXML
    private Rectangle card8;

    @FXML
    private ImageView num8;

    @FXML
    private ImageView num3;

    @FXML
    private ImageView num1;
    
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
    void num3GoToScene(MouseEvent event) throws IOException {
       String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\yaaay.mp3";  
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("levels.fxml"));
        Parent levels = loader.load();
        Scene scene = new Scene(levels);

           
        LevelsController controller = loader.getController();
        /**********************************************/
        Session se1 = HibernateUtil1.getSessionFactory().openSession();
        
            //score sc1=new score();
        
           //1 retrave from DB
           se1.beginTransaction();
           List<score> sList = null;
           String queryStr = "from score";
           Query query = se1.createQuery(queryStr);
           sList = query.list();
           se1.getTransaction().commit();
          
           //2 insert on DB
           for(score i:sList){System.out.println("is="+username.getText());
           if(i.getUsername().equals(username.getText())){
              if(i.getLevel()==0||i.getLevel()==1) 
              controller.setStar1(1,username.getText());
              
              if(i.getLevel()==2) 
              controller.setStar2(2,username.getText());
              
              if(i.getLevel()==3) 
              controller.setStar3(3,username.getText());
              
         }
           
           
           
           
           }
           
           
           
           
           
        controller.setUserName(username.getText());
        
        
        
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
        
        
        /*
        Parent abcd = FXMLLoader.load(getClass().getResource("level1.fxml"));

        Scene scene = new Scene(abcd);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();*/
    }
    

    @FXML
    void card1En(MouseEvent event) {
       card1.setWidth(158);
       card1.setHeight(196);
         
         num1.setFitWidth(125);
         num1.setFitHeight(154);
    }

    @FXML
    void card1Ex(MouseEvent event) {
      card1.setWidth(148);
       card1.setHeight(186);
         
         num1.setFitWidth(115);
         num1.setFitHeight(144);
    }

    @FXML
    void card3En(MouseEvent event) {
      card3.setWidth(158);
       card3.setHeight(196);
         
         num3.setFitWidth(113);
         num3.setFitHeight(154);
    }

    @FXML
    void card3Ex(MouseEvent event) {
       card3.setWidth(148);
       card3.setHeight(186);
         
         num3.setFitWidth(103);
         num3.setFitHeight(144);
    }

    @FXML
    void card8En(MouseEvent event) {
        card8.setWidth(158);
        card8.setHeight(196);
         
         num8.setFitWidth(147);
         num8.setFitHeight(162);
    }

    @FXML
    void card8Ex(MouseEvent event) {
       card8.setWidth(148);
        card8.setHeight(186);
         
         num8.setFitWidth(137);
         num8.setFitHeight(152);
    }

    @FXML
    void num1Click(MouseEvent event) {
      String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    
    @FXML
    void num8Click(MouseEvent event) {
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
       /* String voice = "C:\\Users\\talla\\Desktop\\EngKids_AdProProject\\src\\media\\intro3.mp3";*/
       String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\icecreem.mp3";  
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
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
