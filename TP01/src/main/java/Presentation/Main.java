package Presentation;

import Model.DAO.DaoImpl;
import Model.Metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        //instantiation Statique
        MetierImpl metier = new MetierImpl(new DaoImpl());
        System.out.println("Main 1 => Le resultat sest : " + metier.calculer());
    }
}