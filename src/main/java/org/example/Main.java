package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/beans.xml");
        Saludo saludar = (Saludo) context.getBean("Saludo");
        String texto = saludar.saludar();
        System.out.println(texto);

    }
}