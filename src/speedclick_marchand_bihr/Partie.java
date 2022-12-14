package speedclick_marchand_bihr;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Partie {
    private matriceDeBoutons matrice;
    
    public void initialisaserMatrice(int i, int j){
        matriceDeBoutons matrice = new matriceDeBoutons(i,j); 
        matrice.creematrice();
        matrice.exctinction();
        matrice.afficherMatrice();
    }
    
}
