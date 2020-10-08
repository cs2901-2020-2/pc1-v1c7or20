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
        logger.info(name + " recibio: " + description);
    }

}
