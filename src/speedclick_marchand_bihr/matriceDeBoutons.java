package speedclick_marchand_bihr;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class matriceDeBoutons {

    private int ligne;
    private int colone;
    private Bouton boutonCourant;
    Bouton[][] matrice;    //on crée un tab de boutons

    public matriceDeBoutons(int l, int c) { // prend en compte les dimensions de l'utilisateur   
        ligne = l;
        colone = c;
        matrice = new Bouton[ligne][colone];
    }

    public void creematrice() {
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colone; j++) {
                matrice[i][j] = new Bouton();
            }
        }
    }

    public void caseclick(int i, int j) {        // permet de cliquer une coordonnée donc un bouton
        matrice[i][j].clicker();
    }

    public void exctinction() {        // permet d'eteindre et de decliquer tous les boutons du tableau
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colone; j++) {
                matrice[i][j].declicker();
                matrice[i][j].eteindrebouton();
            }
        }
    }
    
    public void allumagebouton ()  {
        Random r = new Random();        //  on en allume un au hasard
        int a = r.nextInt(5);
        Random b = new Random();
        int c = b.nextInt(5);
        matrice[a][c].allumerbouton();
        
            
            
            
            
    public void afficherMatrice() {
        Random r = new Random();        // dès qu'on affiche la matrice de boutons, on en allume un au hasard
        int a = r.nextInt(5);
        Random b = new Random();
        int c = b.nextInt(5);
        matrice[a][c].allumerbouton();
        
        for (int x = ligne - 1; x >= 0; x--) {
            for (int y = 0; y < colone; y++) {
                if (matrice[x][y].onoff() == true) {
                    System.out.print(" ON ");
                } else {
                    System.out.print(" off ");
                }
            }
            System.out.println("");

        }
    }

    public void BoutonClicker() {
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colone; j++) {
                 if (matrice[i][j].clicker()==true && matrice[i][j].onoff()==true);
                 afficherMatrice();
                 matrice[i][j].declicker();
            }
        }
        
    }
}
