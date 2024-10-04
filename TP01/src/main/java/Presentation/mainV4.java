package Presentation;

import Model.DAO.IDao;
import Model.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainV4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Model");
        IMetier metier = (IMetier) context.getBean(IMetier.class);
        System.out.println(metier.calculer());


    }
}
