package pc;

import java.util.logging.Logger;

public class Oficinas {

    private String name;
    static final Logger logger = Logger.getLogger(Oficinas.class.getName());


    public Oficinas(String nameOfice){
        name = nameOfice;
    }

    public void update (String values) {
        String description = values;
        StringBuilder str = new StringBuilder();
        str.append(name);
        str.append(" recibio: ");
        str.append(description);
        String answer = str.toString();
        logger.info(answer);
    }

}
