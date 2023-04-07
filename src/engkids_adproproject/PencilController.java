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
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

public class PencilController implements Initializable {
    
    String voice = " ";
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
     voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\penBaloon.mp3"; 
     Media sound = new Media(new File(voice).toURI().toString());
     MediaPlayer mediaPlayer = new MediaPlayer(sound);
     mediaPlayer.play();   
        }
    @FXML
    private Rectangle rec1;

    @FXML
    private Rectangle rec11;

    @FXML
    private Rectangle rec12;

    @FXML
    private Rectangle rec13;

    @FXML
    private Rectangle rec14;

    @FXML
    private Button ba4;

    @FXML
    private Button ba3;

    @FXML
    private Button ba2;

    @FXML
    private Button ba1;

    @FXML
    private Button ba5;

   

    @FXML
    private ImageView homebutton;

    @FXML
    private ImageView emptyStar1;

    @FXML
    private ImageView emptyStar2;

    @FXML
    private ImageView emptyStar3;

    @FXML
    private ImageView book;
    @FXML
    private ImageView penCil;
    @FXML
    private ImageView era;
    @FXML
    private ImageView bag;
     @FXML
    private ImageView pen;
    /***********************************/ 
    @FXML
    private Label s;
    @FXML
    private Label lableP;
    
    
    @FXML
    private Label p;
    @FXML
    private Label lable2;
    
    @FXML
    private Label k;
    @FXML
    private Label lable3;
    
    @FXML
    private Label e;
    @FXML
    private Label lable4;
    
    @FXML
    private Label a;
    @FXML
    private Label lable5;
    
    
    @FXML
    private TextField text;
     /**************************************************/
     int levl ;
    /************************************/ 
      @FXML
    private Label username;
     void setUserName(String name){
     username.setText(name);

     set s = new set();
     s.setScore(emptyStar1,emptyStar2,emptyStar3,name);
     }
     /***********************************/ 

    @FXML
    void ba1Action(ActionEvent event) throws IOException {
        levl=3;
      if(voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\bagBaloon.mp3"){
         
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\pump.mp3";
         Media s = new Media(new File(musicFile).toURI().toString());
         MediaPlayer m = new MediaPlayer(s);
         m.play();
         
         ba1.setVisible(false);
         rec1.setVisible(false);
         bag.setVisible(false);
         
         
         lable4.setVisible(false);
           e.setVisible(false);
           
           lable5.setVisible(true);
           a.setVisible(true);
         
         voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\letter.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        num=5;
         
         
         
         
       
      }
     
     else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
    }

    @FXML
    void ba2Act(ActionEvent event) {
    if(voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\eraserBaloon.mp3"){
         
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\pump.mp3";
         Media n = new Media(new File(musicFile).toURI().toString());
         MediaPlayer m = new MediaPlayer(n);
         m.play();
         
         ba2.setVisible(false);
         rec11.setVisible(false);
         era.setVisible(false);
         
          lableP.setVisible(false);
           p.setVisible(false);
           
           lable2.setVisible(true);
           s.setVisible(true);
         
         voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\letter.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        num=2;
         
        
      }
     
     else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
    }

   

    @FXML
    void ba3Act(ActionEvent event) {
     if(voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\pencilPaloon.mp3"){
         
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\pump.mp3";
         Media s = new Media(new File(musicFile).toURI().toString());
         MediaPlayer m = new MediaPlayer(s);
         m.play();
         
         ba3.setVisible(false);
         rec12.setVisible(false);
         penCil.setVisible(false);
         
         
          lable3.setVisible(false);
           k.setVisible(false);
           
           lable4.setVisible(true);
           e.setVisible(true);
         
         voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\letter.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        num=4;
         
        
      }
     
     else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
    }

    

    @FXML
    void ba4Act(ActionEvent event) {
     if(voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\bookPaloon.mp3"){
         
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\pump.mp3";
         Media d = new Media(new File(musicFile).toURI().toString());
         MediaPlayer m = new MediaPlayer(d);
         m.play();
         
         ba4.setVisible(false);
         rec13.setVisible(false);
         book.setVisible(false);
         
        
         
          lable2.setVisible(false);
           s.setVisible(false);
           
           lable3.setVisible(true);
           k.setVisible(true);
         
         voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\letter.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        num=3;
         
        
      }
     
     else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
    }
    
    
    /*********************************/
    int num;
     @FXML
    void enter(KeyEvent event) throws IOException {
      if(event.getCode()==KeyCode.ENTER){
        //pen
        if(num==1){
            if(text.getText().equals("p")||text.getText().equals("P")){
           p.textProperty().bind(text.textProperty());
           
          
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\eraserBaloon.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
         
         }
         else
         {
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
         }
        }
      
      
        
        //eraser
        if(num==2){
            if(text.getText().equals("s")){
           s.textProperty().bind(text.textProperty());
           
          /* lableP.setVisible(false);
           s.setVisible(false);*/
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\bookPaloon.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
         
         }
         else
         {
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
         }
        }
        
        
        
        //book
        if(num==3){
         if(text.getText().equals("k")){
         k.textProperty().bind(text.textProperty());
           
          
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\pencilPaloon.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
         
         }
         else
         {
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
         }
        }
        
        
        
        //pencil
        if(num==4){
         if(text.getText().equals("e")){
         e.textProperty().bind(text.textProperty());
           
          
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\bagBaloon.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
         
         }
         else
         {
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
         }
        }
        
        
        //bag
        if(num==5){
         if(text.getText().equals("a")){
         a.textProperty().bind(text.textProperty());
           
          
         voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\yaaay.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        
        
        /***************************************************************/
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("levels.fxml"));
        Parent levels = loader.load();
        Scene scene = new Scene(levels);

           
        LevelsController controller = loader.getController();
        
           
          Session se1 = HibernateUtil1.getSessionFactory().openSession();
        
            
        
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
          Session session = HibernateUtil1.getSessionFactory().openSession();
          session.beginTransaction();
          
          score sc = new score(username.getText(),3);
          emptyStar1.setVisible(true);
          emptyStar2.setVisible(true);
          emptyStar3.setVisible(true);
     
          session.update(sc);
            
          session.getTransaction().commit();
          session.close();
           }
     }      
          
        controller.setUserName(username.getText());
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
        
        /******************************************************************/
         
         }
         else
         {
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
         }
        }
        
        
      }
        
        
    }
/**********************************************************/
   
 
    @FXML
    void ba5Act(ActionEvent event) {
     if(voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\penBaloon.mp3"){
         
         String d = "D:\\programming\\EngKids_AdProProject\\src\\media\\pump.mp3";
         Media h = new Media(new File(d).toURI().toString());
         MediaPlayer m = new MediaPlayer(h);
         m.play();
         
         ba5.setVisible(false);
         rec14.setVisible(false);
         pen.setVisible(false);
         
         
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\letter.mp3"; 
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        num=1;
        }
     
     else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       } 
    
    }

    

    @FXML
    void homebuttonExite(MouseEvent event) {

    }

    @FXML
    void homebuttonMouseEnter(MouseEvent event) {

    }

    @FXML
    void homebuttonMouseclic(MouseEvent event) {

    }
    
    
    
    
/****************************************************************/
    /*************************/
    void recEn(Rectangle rec){
       rec.setWidth(rec.getWidth()+5);
       rec.setHeight(rec.getHeight()+5);
       
    }
    
    void recEx(Rectangle rec){
       rec.setWidth(185);
       rec.setHeight(363);
    }
    /*************************/
    
   
    
    /**************************************************/
    @FXML
    void rec1En(MouseEvent event) {
        recEn(rec1);
       
    }

    @FXML
    void rec1Ex(MouseEvent event) {
          recEx(rec1);
         
    }
    
     @FXML
    void rec2En(MouseEvent event) {
        recEn(rec11);
       
    }

    @FXML
    void rec2Ex(MouseEvent event) {
       recEx(rec11);
       
    }

    @FXML
    void rec3En(MouseEvent event) {
        recEn(rec12);
        
    }

    @FXML
    void rec3Ex(MouseEvent event) {
        recEx(rec12);
        
    }

    @FXML
    void rec4En(MouseEvent event) {
        recEn(rec13);
        
    }

    @FXML
    void rec4Ex(MouseEvent event) {
        recEx(rec13);
        
    }

    @FXML
    void rec5En(MouseEvent event) {
        recEn(rec14);
        
    }

    @FXML
    void rec5Ex(MouseEvent event) {
       recEx(rec14);
       
    }

    

}

