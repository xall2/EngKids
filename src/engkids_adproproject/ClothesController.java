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
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author talla
 */
public class ClothesController implements Initializable{

    String voice =" ";
//    Media sound = new Media(new File(voice).toURI().toString());
//    MediaPlayer mediaPlayer = new MediaPlayer(sound);
//   
    /*image*/
    @FXML
    private ImageView chirt;

    @FXML
    private ImageView jens;

    @FXML
    private ImageView bag;

    @FXML
    private ImageView skirt;

    @FXML
    private ImageView boot;

    @FXML
    private ImageView drees;
    /*rabit*/
    @FXML
    private ImageView rRed;

    @FXML
    private ImageView rGray;

    @FXML
    private ImageView rYellow;
    
    
    
    /*bottun*/
    @FXML
    private Button btChirt;
    
     @FXML
    private Button redColor;
     
     @FXML
    private Button greenColor;
     
      @FXML
    private Button orangColor;
      
       @FXML
    private Button yelllowColor;
       
       @FXML
    private Button blueColor;

    @FXML
    private Button purpleColor;
    
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
    /************************************/
      void setUserName(String name){
     username.setText(name);
     
     set s = new set();
     s.setScore(emptyStar1,emptyStar2,emptyStar3,name);}
    
    /***********************************اذا الماوس جاء فوق اي شكل************************************/
    @FXML
    void bagEnter(MouseEvent event) {
          bag.setFitHeight(179);
         bag.setFitWidth(179);
    }

    @FXML
    void bagExit(MouseEvent event) {
           bag.setFitHeight(149);
         bag.setFitWidth(149);
    }

    @FXML
    void bootEnter(MouseEvent event) {
         boot.setFitHeight(215);
         boot.setFitWidth(215);
    }

    @FXML
    void bootExit(MouseEvent event) {
         boot.setFitHeight(182);
         boot.setFitWidth(182);
    }

    @FXML
    void chirtEnter(MouseEvent event) {
         chirt.setFitHeight(201);
         chirt.setFitWidth(201);
    }

    @FXML
    void chirtExit(MouseEvent event) {
         chirt.setFitHeight(171);
         chirt.setFitWidth(171);
    }

    @FXML
    void jinsEnter(MouseEvent event) {
         jens.setFitHeight(188);
         jens.setFitWidth(188);
    }

    @FXML
    void jinsExit(MouseEvent event) {
         jens.setFitHeight(158);
         jens.setFitWidth(158);
    }

    @FXML
    void skirtEnter(MouseEvent event) {
          skirt.setFitHeight(188);
         skirt.setFitWidth(188);
    }

    @FXML
    void skirtExit(MouseEvent event) {
         skirt.setFitHeight(158);
         skirt.setFitWidth(158);
    }
     
    @FXML
    void dressEnter(MouseEvent event) {
          drees.setFitHeight(188);
         drees.setFitWidth(188);
    }

    @FXML
    void dressExit(MouseEvent event) {
        drees.setFitHeight(155);
         drees.setFitWidth(155);
    }
    
    @FXML
    void purpulEn(MouseEvent event) {
         purpleColor.setMaxSize(75, 82);
         purpleColor.setMinSize(75, 82);
    }

    @FXML
    void purpulEx(MouseEvent event) {
         purpleColor.setMaxSize(70,77);
         purpleColor.setMinSize(70,77);
    }
    
    @FXML
    void blueEn(MouseEvent event) {
        blueColor.setMaxSize(75, 82);
        blueColor.setMinSize(75, 82);
    }

    @FXML
    void blueEx(MouseEvent event) {
        blueColor.setMaxSize(70,77);
        blueColor.setMinSize(70,77);
    }
    
    @FXML
    void greenEn(MouseEvent event) {
       greenColor.setMaxSize(75, 82);
       greenColor.setMinSize(75, 82);
    }

    @FXML
    void greenEx(MouseEvent event) {
        greenColor.setMaxSize(70,77);
        greenColor.setMinSize(70,77);
    }
    
    
    @FXML
    void orangEn(MouseEvent event) {
      orangColor.setMaxSize(75, 82);
      orangColor.setMinSize(75, 82);
    }

    @FXML
    void orangEx(MouseEvent event) {
        orangColor.setMaxSize(70,77);
        orangColor.setMinSize(70,77);
    }
    
    @FXML
    void redEn(MouseEvent event) {
       redColor.setMaxSize(75, 82);
       redColor.setMinSize(75, 82);
    }

    @FXML
    void redEx(MouseEvent event) {
       redColor.setMaxSize(70,77);
       redColor.setMinSize(70,77);
    }
    
    @FXML
    void yeelowEn(MouseEvent event) {
       yelllowColor.setMaxSize(75, 82);
       yelllowColor.setMinSize(75, 82);
    }

    @FXML
    void yeelowEx(MouseEvent event) {
        yelllowColor.setMaxSize(70,77);
        yelllowColor.setMinSize(70,77);
    }
   /**********************************************************************************/ 
   
    
    
  /**********************************start game********************************************************************/
   @Override
    public void initialize(URL location, ResourceBundle resources) {
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\t-shirt.mp3";     
         Media sound = new Media(new File(voice).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play();}
    
    
    
    @FXML
    void enter(KeyEvent event) {
//        if(event.getCode().equals(KeyCode.ENTER)){
//         voice = "D://programming//projetAB//src//t-shirt.mp3";     
//         Media sound = new Media(new File(voice).toURI().toString());
//         MediaPlayer mediaPlayer = new MediaPlayer(sound);
//         mediaPlayer.play(); } 
       }
    
    
    
    
    
    /************shirt in red**************/
    @FXML
    void btChirtEvent(ActionEvent event) {
       if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\t-shirt.mp3"){
        String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play();
        
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\red.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
         }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }  
     } 
    
    
       @FXML
    void redColorEvent(ActionEvent event) {
      if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\red.mp3"){
         
        String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play();  
          
        Image image = new Image("redT-shirt.png");
        chirt.setImage(image);
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\trouser.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
     }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       } 
    }
       
    /*************************************/ 
    
    
    
    
    
    /****trouser in green*****/
     @FXML
    void btJensEvent(ActionEvent event) {
       if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\trouser.mp3"){
        
        String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play();   
           
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\green.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play(); 
        }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }   
    }
    
    
    @FXML
    void greenColorEvent(ActionEvent event) {
     if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\green.mp3"){
         
         String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play();
         
        Image image = new Image("greenPants.png");
        jens.setImage(image);
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\dress.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
     }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       } 
    }
    /***********************/
    
    
    
    /****************Dress in orang*********************/
     @FXML
    void btDressEvent(ActionEvent event) {
      if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\dress.mp3"){
         String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play(); 
          
          
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\orange.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play(); 
        }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
    }
       
    @FXML
    void orangColorEvent(ActionEvent event) {
         if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\orange.mp3"){
         String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play();    
             
        Image image = new Image("orangDress.png");
        drees.setImage(image);
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\bag.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
     }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       } 
    }
      
   /************************************************************/
    
    
    
    /*****************bag in yellow************************/
     @FXML
    void btBagEvent(ActionEvent event) {
       if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\bag.mp3"){
           
          String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play(); 
           
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\yellow.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play(); 
        }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
    }
    
    @FXML
    void yelllowColorEvent(ActionEvent event) {
       if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\yellow.mp3"){
           
         String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play();  
           
        Image image = new Image("yellowSchool-bag.png");
        bag.setImage(image);
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\shoes.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
     }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
    }
       
       
       
       
       
       
   /****************************shoce in purbl***********************************/    
    
     @FXML
    void btShoseEvent(ActionEvent event) {
      if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\shoes.mp3"){
         String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play(); 
          
          
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\purple.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play(); 
        }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
    }

   
     @FXML
    void purpleColorEvent(ActionEvent event) {
       if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\purple.mp3"){
         String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play();  
           
        Image image = new Image("purpulBaby-shoes.png");
        boot.setImage(image);
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\skirt.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
     }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
    }
    
    
     
       
       
 /*************************skirt in blue*******************************/
     @FXML
    void btSkirtEvent(ActionEvent event) {
       if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\skirt.mp3"){
        String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play();   
           
           
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\blue.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play(); 
        }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
    }
   
    
    @FXML
    void blueColorEvent(ActionEvent event) throws IOException {
       if( voice=="D:\\programming\\EngKids_AdProProject\\src\\media\\blue.mp3"){
           
        String vo = "D:\\programming\\EngKids_AdProProject\\src\\media\\intro3.mp3";     
        Media so = new Media(new File(vo).toURI().toString());
        MediaPlayer md = new MediaPlayer(so);
        md.play();   
           
        Image image = new Image("bluGored-skirt.png");
        skirt.setImage(image);
        voice = "D:\\programming\\EngKids_AdProProject\\src\\media\\yaaay.mp3";     
        Media sound = new Media(new File(voice).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        /*****************************************/
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("levels.fxml"));
        Parent levels = loader.load();
        Scene scene = new Scene(levels);

           
        LevelsController controller = loader.getController();
        
        
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
          Session session = HibernateUtil1.getSessionFactory().openSession();
          session.beginTransaction();
          score sc=null;
          if(!(i.getLevel()==3)){
           sc = new score(username.getText(),2);
          emptyStar1.setVisible(true);
          emptyStar2.setVisible(true);
          emptyStar3.setVisible(true);
           
          session.update(sc);
          }
          session.getTransaction().commit();
          session.close();
           }
     }
        controller.setUserName(username.getText());
        /*******************************************************/
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
     }
       else{
         String musicFile = "D:\\programming\\EngKids_AdProProject\\src\\media\\lose2.mp3";
         Media sound = new Media(new File(musicFile).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(sound);
         mediaPlayer.play(); 
       }
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
    
    
    
    
    
    
    
    
    void moveRabit(Duration duration,Node node){  
          
        //Instantiating TranslateTransition class   
        TranslateTransition translate = new TranslateTransition();  
          
        //shifting the X coordinate of the centre of the circle by 400   
        translate.setByY(-8);  
          
        //setting the duration for the Translate transition   
        translate.setDuration(duration);  
          
        //setting cycle count for the Translate transition   
        translate.setCycleCount(500);  
          
          
          
        //setting Circle as the node onto which the transition will be applied  
        translate.setNode(node);  
          
        //playing the transition   
        translate.play();
    
    
    }
    
    
    
    
    
    
    
    
    
    
    @FXML
    void bt1Enter(MouseEvent event) {
          
    }

    @FXML
    void bt1Exit(MouseEvent event) {
         
    }

    
  
    
  
    
    
}