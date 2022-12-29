package example2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificacionService notificar;

    public UserService (NotificacionService notificar){
        this.notificar = notificar;

    }
}
