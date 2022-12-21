/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speedclick_marchand_bihr;

/**
 *
 * @author User
 */
public class Bouton {
     private boolean allume;
     private boolean click; 
     
     
    public Bouton() {       //on initialise le bouton en l'eteignant 
        allume = false;
        click=false;
    }
    
    public void allumerbouton (){   //permet d'aallumer le bouton
        allume=true;
    }
    
    public boolean onoff (){  //la méthode permet de savoir si le bouton est allumé ou nom
        return allume;
    }
    
    
    public void eteindrebouton (){
        allume=false;
    }
    
    public boolean clicker(){            // si le boton est clické, l'attribut clicjé prend vrai
        click = true;
        return true;
    }
    
    public void declicker(){        //permet de reinitialiser l'attribut click
        click = false;
    }
    

   
    
}
