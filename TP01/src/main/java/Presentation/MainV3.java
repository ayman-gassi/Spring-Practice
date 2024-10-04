package Presentation;
import Model.Metier.IMetier;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainV3 {
    public static void main(String[] args){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("Spring-Common.xml");
        IMetier metier = (IMetier) beanFactory.getBean("ImpMetier");
        System.out.println(metier.calculer());
    }
}
