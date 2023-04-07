/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engkids_adproproject;

import java.util.List;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author alaas
 */
public class set {
    
    
    
    void setScore(ImageView emptyStar1,ImageView emptyStar2,ImageView emptyStar3,String name){
        FXMLLoader loader = new FXMLLoader();
               loader.setLocation(getClass().getResource("levels.fxml"));
               LevelsController levels = loader.getController();
        
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
               
           if(i.getLevel()==1){
               emptyStar1.setVisible(true);
               emptyStar2.setVisible(false);
               emptyStar3.setVisible(false);
               /*levels.setLock1Vi();//lock1 true
              /* levels.setLock2UnVi();//lock2 false*/
             }  
            
           if(i.getLevel()==2){
               emptyStar1.setVisible(true);
               emptyStar2.setVisible(true);
               emptyStar3.setVisible(false);
           } 
           
           if(i.getLevel()==3){
               emptyStar1.setVisible(true);
               emptyStar2.setVisible(true);
               emptyStar3.setVisible(true);
             }    
         
         } 
      }
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }

