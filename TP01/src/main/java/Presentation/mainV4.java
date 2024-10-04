package Presentation;

import Model.DAO.DaoImpl;
import Model.DAO.IDao;
import Model.Metier.IMetier;
import Model.Metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainV4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        IDao dao = (IDao) context.getBean(IDao.class);
        System.out.println(dao.getData());


    }
}
