package example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example2/beans2.xml");
        UserService usuario = (UserService) context.getBean("notificacion");
        String texto = usuario.notificar.toString();

    }
}
