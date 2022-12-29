package example2;

import org.springframework.stereotype.Component;

@Component
public class NotificacionService {

    public class Saludo {
        public Saludo(){
            System.out.println("Iniciando");
        }
        public String saludar(){
            return "hola mundo";
        }
    }


}
