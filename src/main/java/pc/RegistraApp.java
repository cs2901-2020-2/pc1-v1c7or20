package pc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistraApp  {
    private static RegistraApp instance = null;
    private List<Oficinas> observers = new ArrayList<>();
    private String patternDate = "[0-9]{4}-I{1,2} [A-Z0-9]{6} [E][S|N] [[A-Za-z0-9á-ú]* ]*, [0-9]{1,2}, Semana[0-9]{2}, [[A-Za-z]* ]*,[0-9]{2}/[0-9]{2} [0-9]{2}:[0-9]{2}-[0-9]{2}:[0-9]{2} Laboratorio.|Teoria.";

    public synchronized void addOficina(Oficinas oficinas){
        observers.add(oficinas);
    }

    public synchronized void removeOficina(Oficinas oficina){
        observers.remove(oficina);
    }

    public synchronized boolean verify( String description) {
        Pattern verifier = Pattern.compile(patternDate);
        Matcher matcher = verifier.matcher(description);
        return matcher.matches();
    }

    public synchronized void notifyObservers(String description){
        for (Oficinas oficinas : observers){
            oficinas.update(description);
        }
    }

    public synchronized void processDescription(String description){
        if(verify(description))
            notifyObservers(description);
    }

    public static synchronized RegistraApp getInstance(){
        if (instance == null)
             instance = new RegistraApp();
        return instance;
    }
    public synchronized  void addRegister(Profesor profesor, String description){
        if (profesor.getLogged())
            processDescription(description);
    }

}
