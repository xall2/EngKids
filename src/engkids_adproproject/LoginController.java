/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engkids_adproproject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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
public class LoginController implements Initializable {
     @FXML
    private Button homeback;

    @FXML
    private Button logintohome;
    
    @FXML
    private TextField textName;

    @FXML
    private PasswordField textPass;
    
    @FXML
    private Label label;
    
    
    /*******************************DataBase***********************************/
    
        @FXML
    void goTolevels(ActionEvent event) throws IOException {
         String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        Session session = HibernateUtil.getSessionFactory().openSession();
        
            player play=new player();
        
           //1 retrave from DB
           session.beginTransaction();
           List<player> sList = null;
           String queryStr = "from player";
           Query query = session.createQuery(queryStr);
           sList = query.list();
           session.getTransaction().commit();
            
           for(player i:sList){System.out.println(""+i.getUsername());
             if(!textName.getText().equals("")&&!textPass.getText().equals("")){
               if (i.getUsername().equals(textName.getText())&&i.getPass().equals(textPass.getText())) {
                   FXMLLoader loader = new FXMLLoader();
                   loader.setLocation(getClass().getResource("levels.fxml"));
                   Parent levels = loader.load();
                   Scene scene = new Scene(levels);
           
                   LevelsController controller= loader.getController();
                   controller.setUserName(textName.getText());
                   Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                   window.setScene(scene);
                   window.show();}
               
               else
                 label.setText("Your user name or password not valid");
              }      
           }
    }
    /**************************************************************************/
    
    
    
    
    
       @FXML
    void homebackenter(MouseEvent event) {
        homeback.setMinSize(118, 59);
        homeback.setMaxSize(118, 59);

    }

    @FXML
    void homebackexite(MouseEvent event) {
       homeback.setMinSize(113, 49);
        homeback.setMaxSize(113,49);
    }
    
     @FXML
    void logintohomeenter(MouseEvent event) {
        logintohome.setMinSize(212, 86);
        logintohome.setMaxSize(212, 86);

    }

    @FXML
    void logintohomeexite(MouseEvent event) {
       logintohome.setMinSize(202, 76);
       logintohome.setMaxSize(202, 76);
    }
    
    
    
    //go to signup page 
     @FXML
    void backTostart(ActionEvent event) throws IOException {
         String voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\select.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
           Parent start = FXMLLoader.load(getClass().getResource("start.fxml"));
           Scene scene = new Scene(start);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
 
    }
    
    
    
    
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   

}
