import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.net.URL;

public class Worker extends User {
    private int rate;
    private String principalJob;
    private ArrayList<String> secondaryJobs;
    private int salary;
    private int finishedJobs;
    private ArrayList<URL> finishJobsPictures;
    
    private List<Request> requests;
    private List<WorkZone> workZones;
    private List<Disponibility> disponibilityHours;
}
