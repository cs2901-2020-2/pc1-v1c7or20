package pc;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestRegistraApp {
    @Test
    public void TestProfesor() {
        Profesor profesor1 = new Profesor("Juan");
        Profesor profesor2 = new Profesor("Pedro");
        Profesor profesor3 = new Profesor("Maria");
        Assert.assertFalse(profesor1.getLogged());
        Assert.assertFalse(profesor2.getLogged());
        Assert.assertFalse(profesor3.getLogged());
        profesor1.login("Juan");
        profesor2.login("Pedro");
        profesor3.login("Falso");
        Assert.assertTrue(profesor1.getLogged());
        Assert.assertTrue(profesor2.getLogged());
        Assert.assertFalse(profesor3.getLogged());

    }

    @Test(timeOut = 500)
    public void testRegistraTime(){
        Profesor profesor1 = new Profesor("Juan");
        Profesor profesor2 = new Profesor("Pedro");
        Profesor profesor3 = new Profesor("Maria");
        RegistraApp registraApp = RegistraApp.getInstance();
        Oficinas oficinas1 = new Oficinas("CE2A");
        Oficinas oficinas2 = new Oficinas("DGA");
        Oficinas oficinas3 = new Oficinas("Counter Docentes");
        Oficinas oficinas4 = new Oficinas("Counter Alumnos");
        registraApp.addOficina(oficinas1);
        registraApp.addOficina(oficinas2);
        registraApp.addOficina(oficinas3);
        registraApp.addOficina(oficinas4);
        profesor1.login("Juan");
        profesor2.login("Pedro");
        profesor3.login("Maria");
        registraApp.addRegister(profesor1,"2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido,10/08 08:00-10:00 Laboratorio.");
        registraApp.addRegister(profesor2,"2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido,10/08 08:00-10:00 Laboratorio.");
        registraApp.addRegister(profesor3,"2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido,10/08 08:00-10:00 Laboratorio.");
    }

    @Test(invocationCount = 500, threadPoolSize = 500)
    public void testRegistraApp(){
        Profesor profesor1 = new Profesor("Juan");
        Profesor profesor2 = new Profesor("Pedro");
        Profesor profesor3 = new Profesor("Maria");
        RegistraApp registraApp = RegistraApp.getInstance();
        Oficinas oficinas1 = new Oficinas("CE2A");
        Oficinas oficinas2 = new Oficinas("DGA");
        Oficinas oficinas3 = new Oficinas("Counter Docentes");
        Oficinas oficinas4 = new Oficinas("Counter Alumnos");
        registraApp.addOficina(oficinas1);
        registraApp.addOficina(oficinas2);
        registraApp.addOficina(oficinas3);
        registraApp.addOficina(oficinas4);
        profesor1.login("Juan");
        profesor2.login("Pedro");
        profesor3.login("Maria");
        registraApp.addRegister(profesor1,"2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido,10/08 08:00-10:00 Laboratorio.");
        registraApp.addRegister(profesor2,"2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido,10/08 08:00-10:00 Laboratorio.");
        registraApp.addRegister(profesor3,"2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido,10/08 08:00-10:00 Laboratorio.");
    }
}
