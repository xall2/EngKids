/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engkids_adproproject;



/**
 * FXML Controller class
 *
 * @author talla
 */

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author alaas
 */
public class LevelsController implements Initializable {
    

    @FXML
    private Button L11;

    @FXML
    private ImageView b2;

    @FXML
    private ImageView beer1;

    @FXML
    private Button L121;

    @FXML
    private ImageView b1;

    @FXML
    private Button L12;

    @FXML
    private ImageView b3;
    
     
    @FXML
    private ImageView homebutton;
    
     @FXML
    private ImageView emptyStar1;

    @FXML
    private ImageView emptyStar2;

    @FXML
    private ImageView emptyStar3;
    
   @FXML
    private ImageView lock1;
     void setLock1Vi(){
     lock1.setVisible(true);
     }
    
    @FXML
    private ImageView lock2;
    void setLock2Vi() {
        lock2.setVisible(true);
    }
    
    void setLock2UnVi() {
        lock2.setVisible(false);
    }
    

    @FXML
    private Label username;
    
   

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
    void lock1Voice(MouseEvent event) {
       String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    @FXML
    void lock2Voice(MouseEvent event) {
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

    }
    
    
    
    
    
    
    
    

    @FXML
    void homebuttonExite(MouseEvent event) {
       homebutton.setFitWidth(70);
        homebutton.setFitHeight(64);

    }
    

    @FXML
    void beer_EN1(MouseEvent event) {
      b1.setFitHeight(68);
      b1.setFitWidth(68);
    }
    
    @FXML
    void beer_EX1(MouseEvent event) {
      b1.setFitHeight(64);
      b1.setFitWidth(64);
    }
/////////////////////////////////////////
    
    @FXML
    void beer_EN2(MouseEvent event) {
      b2.setFitHeight(70);
      b2.setFitWidth(73);
    }

    @FXML
    void beer_EX2(MouseEvent event) {
      b2.setFitHeight(66);
      b2.setFitWidth(69);
    }
    
 ///////////////////////////////////////// 
    
    @FXML
    void beer_EN3(MouseEvent event) {
      b3.setFitHeight(75);
      b3.setFitWidth(75);
    }

    @FXML
    void beer_EX3(MouseEvent event) {
      b3.setFitHeight(71);
      b3.setFitWidth(71);
    }

 
    @FXML
    void leval_1(MouseEvent event) throws IOException {
         String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("level1.fxml"));
           Parent level1 = loader.load();
           Scene scene = new Scene(level1);
           
           Level1Controller controller= loader.getController();
           controller.setUserName(username.getText());
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void leval_2(MouseEvent event) throws IOException {
         String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("level2.fxml"));
           Parent level2 = loader.load();
           Scene scene = new Scene(level2);
           
           Level2Controller controller= loader.getController();
           controller.setUserName(username.getText());
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }
    /***********************************************************/
    @FXML
    void leval_3(MouseEvent event)throws IOException {
         String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
          
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("level3.fxml"));
           Parent level3 = loader.load();
           Scene scene = new Scene(level3);
           
           Level3Controller controller= loader.getController();
           controller.setUserName(username.getText());
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
 
    }
    
    
    void setUserName(String name){
     username.setText(name);
    // setScore(emptyStar1,emptyStar2,emptyStar3,name);
     
     
      Session se1 = HibernateUtil1.getSessionFactory().openSession();
         //1 retrave from DB
           se1.beginTransaction();
           List<score> sList = null;
           String queryStr = "from score";
           Query query = se1.createQuery(queryStr);
           sList = query.list();
           se1.getTransaction().commit();
         
           for(score i:sList){ System.out.println("levels="+name+" "+i.getLevel());
           if(i.getUsername().equals(name)){
             if(i.getLevel()==1){emptyStar1.setVisible(true); lock1.setVisible(false); }/****************************lock****************************/
             else if(i.getLevel()==2){emptyStar1.setVisible(true);emptyStar2.setVisible(true);lock1.setVisible(false); lock2.setVisible(false); }
             else if(i.getLevel()==3){emptyStar1.setVisible(true);emptyStar2.setVisible(true);emptyStar3.setVisible(true);lock1.setVisible(false); lock2.setVisible(false); }
           }
    }
    }
    
    /*add star1 to user*/
    void setStar1(int num,String name){
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
           for(score i:sList){System.out.println("is="+name);
           if(i.getUsername().equals(name)){
          Session session = HibernateUtil1.getSessionFactory().openSession();
          session.beginTransaction();
          
          score sc = new score(name,num);
          emptyStar1.setVisible(true);
     
          session.update(sc);
            
          session.getTransaction().commit();
          session.close();
           }
     }}
    
    void setStar2(int num,String name){
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
           for(score i:sList){System.out.println("is="+name);
           if(i.getUsername().equals(name)){
          Session session = HibernateUtil1.getSessionFactory().openSession();
          session.beginTransaction();
          
          score sc = new score(name,num);
          emptyStar1.setVisible(true);
          emptyStar2.setVisible(true);
     
          session.update(sc);
            
          session.getTransaction().commit();
          session.close();
           }
     }
    }
    
    void setStar3(int num,String name){
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
           for(score i:sList){System.out.println("is="+name);
           if(i.getUsername().equals(name)){
          Session session = HibernateUtil1.getSessionFactory().openSession();
          session.beginTransaction();
          
          score sc = new score(name,num);
          emptyStar1.setVisible(true);
          emptyStar2.setVisible(true);
          emptyStar3.setVisible(true);
     
          session.update(sc);
            
          session.getTransaction().commit();
          session.close();
           }
     }
    }
    
    
   
/*******************************************************************************************/
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        }  
       

     
           
   @FXML
    void member(ActionEvent event) throws IOException {
      
            
       FXMLLoader loader = new FXMLLoader();
           
           loader.setLocation(getClass().getResource("school.fxml"));
           Parent start = loader.load();
           Scene scene = new Scene(start);
           
           Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();   
       
   
    }         

   
  
    
    

}