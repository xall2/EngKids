/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engkids_adproproject;
import javax.persistence.*;

/**
 *
 * @author alaas
 */
@Entity
@Table(name="score")
public class score {
   
   @Id
   @Column(name="username1")
   public  String username1;
    
   
   @Column(name="level")
   public  int level;
   
   
   public score(){}

    public score(String username1, int level) {
        this.username1 = username1;
        this.level = level;
    }
   
   

    public String getUsername() {
        return username1;
    }

    

    public int getLevel() {
        return level;
    }

    public void setUsername(String username) {
        this.username1 = username;
    }

   

    public void setLevel(int level) {
        this.level = level;
    }
}
