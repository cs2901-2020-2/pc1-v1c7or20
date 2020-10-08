package pc;

public class Profesor {
    private String name;
    private boolean isLogged;

    public Profesor(String nameProfesor){
        name = nameProfesor;
        isLogged= false;
    }

    public void login(String nameProfesor){
        if (name.equals(nameProfesor)){
            isLogged = true;
        }
    }

    public void disconnect(){
        if (isLogged )
            isLogged = false;
    }

    public boolean getLogged(){
        return isLogged;
    }

}
