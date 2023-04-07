/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engkids_adproproject;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author talla
 */
public class SignupController  {
  @FXML
    private Button homeback;

    @FXML
    private Button sginuptohome;
    
     @FXML
    private TextField textName;

    @FXML
    private PasswordField textPass;
    
    
    /**************************DataBase***************************/
     @FXML
    void goTolevels(ActionEvent event) throws IOException {
        String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        /******************************************************************/
        Session session = HibernateUtil.getSessionFactory().openSession();
        
            player play=new player();
        
           //1 retrave from DB
           session.beginTransaction();
           List<player> sList = null;
           String queryStr = "from player";
           Query query = session.createQuery(queryStr);
           sList = query.list();
           session.getTransaction().commit();
          
           //2 insert on DB
           for(player i:sList){
            
          if(!textName.getText().equals("")&&!textPass.getText().equals("")){
            if (!i.getUsername().equals(textName.getText())) {
            //
            session.beginTransaction();  
            play.setUsername(textName.getText());
            play.setPass(textPass.getText());
            session.save(play); 
            
            session.getTransaction().commit();
            session.close();
            
            /************************************************************/
            Session session1 = HibernateUtil1.getSessionFactory().openSession();
            session1.beginTransaction();
            score sc = new score();
            sc.setUsername(textName.getText());
            sc.setLevel(0);
            session1.save(sc); 
            session1.getTransaction().commit();
            session1.close();
            /***************************************************************/
            
        
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("levels.fxml"));
           Parent levels = loader.load();
           Scene scene = new Scene(levels);
           
           LevelsController controller= loader.getController();
           controller.setUserName(textName.getText());
           
           
           Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(scene);
           window.show();
            }}
         }
        
    }      /***********************************************************/
    
    
    
    
    

       @FXML
    void homebackenter(MouseEvent event) {
       homeback.setMinSize(118, 63);
        homeback.setMaxSize(118, 63);

    }

    @FXML
    void homebackexite(MouseEvent event) {
        homeback.setMinSize(113, 59);
        homeback.setMaxSize(113,59);
    }
    
     @FXML
    void sginuptohomeenter(MouseEvent event) {
        sginuptohome.setMinSize(212, 86);
        sginuptohome.setMaxSize(212, 86);

    }

    @FXML
    void sginuptohomeexite(MouseEvent event) {
       sginuptohome.setMinSize(202, 76);
        sginuptohome.setMaxSize(202, 76);
    }
    
    //go to login page 
    
    
    //go to signup page 
     @FXML
    void backTostart(ActionEvent event) throws IOException {
         String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
           Parent signuppage = FXMLLoader.load(getClass().getResource("start.fxml"));
           Scene scene = new Scene(signuppage);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
 
    }
}
