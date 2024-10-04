package Presentation;

import Model.DAO.DaoImpl;
import Model.DAO.IDao;
import Model.Metier.IMetier;
import Model.Metier.MetierImpl;

import java.io.File;
import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws Exception{
        //instantiation Dynamique
        Scanner scanner = new Scanner(new File("Config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance();
        System.out.println("Main 2 => Le resultat sest : " + metier.calculer());
    }
}
