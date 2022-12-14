package speedclick_marchand_bihr;

import java.util.Scanner;

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

    public void jouer(int i, int j) {
       matriceDeBoutons matrice = new matriceDeBoutons(i, j);
       matrice.creematrice();
       matrice.exctinction();
       int tour = 0;
       int L=0;
       int C=0;
       int score=0;
        while (tour < 4) {
            matrice.allumagebouton(); 
            matrice.afficherMatrice();
            System.out.println("Dans quelle colone colone voulez vous clicker ");
            Scanner sc=new Scanner(System.in);
            L = sc.nextInt();
            System.out.println("Sur quelle ligne colone voulez vous clicker ");
            C = sc.nextInt();
            matrice.caseclick(L, C);
            if (matrice.BoutonClicker()== true) {
                score = score + 1;
            }
            System.out.println("Le score est "+ score);
            matrice.exctinction();
             
            
        }
    }
}
