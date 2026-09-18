import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.net.URL;

public class User {
    private int id;
    private String nombre;
    private URL foto;
    private String correo;
    private int telefono;
    
    private List<Notification> notifications;
}
